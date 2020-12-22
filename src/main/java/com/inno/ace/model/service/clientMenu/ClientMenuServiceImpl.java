package com.inno.ace.model.service.clientMenu;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.inno.ace.advice.exception.NoDomainAddrException;
import com.inno.ace.enums.ApiNm;
import com.inno.ace.enums.ApiUrl;
import com.inno.ace.enums.CommonMsg;
import com.inno.ace.model.dao.ace.ClientMenuDao;
import com.inno.ace.model.service.api.ApiService;
import com.inno.ace.model.service.client.ClientService;
import com.inno.ace.model.service.menu.MenuService;
import com.inno.ace.model.vo.ClientMenuVO;
import com.inno.ace.model.vo.ClientVO;
import com.inno.ace.model.vo.MenuVO;
import com.inno.ace.model.vo.ResultVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ClientMenuServiceImpl implements ClientMenuService {

    private final ClientMenuDao clientMenuDao;
    private final MenuService menuService;
    private final ClientService clientService;
    private final ApiService apiService;

    public ResultVO selectClientMenuList(int client) {
        return ResultVO.builder().data(clientMenuDao.selectClientMenuList(client)).build();
    }

    /**
     * 메뉴 동기화
     * @param clientMenuVO
     * @return
     * @throws JsonProcessingException
     */
    public ResultVO syncClientMenu(ClientMenuVO clientMenuVO) throws JsonProcessingException {
        // 해당 클라이언트의 도메인이 등록 되었는지 체크 하기 위해 클라이언트 정보를 조회
        ClientVO clientVO = (ClientVO)clientService.selectClient(clientMenuVO.getClientId()).getData();
        String domainAddr = clientVO.getDomainAddr();
        ResultVO resultVO = ResultVO.builder().resultMsg(CommonMsg.SUCCESS_MENU_ASYNC.getMsg()).build();

        // 도메인이 등록 되어 있지 않다면 동기화를 진행할 수 없으므로 예외를 발생 시킨다.
        if(StringUtils.isEmpty(domainAddr)) {
            throw new NoDomainAddrException();
        }

        // 즉시 여부가 "Y"일 시엔 바로 전송을 시킨다.
        if("Y".equals(clientMenuVO.getImmediateYn())) {

            // 대메뉴 하위 리스트 전체 조회(대메뉴 하나씩만 동기화 시키기 때문)
            List<MenuVO> menuList = menuService.selectMenuListByMenuId(clientMenuVO.getMenuId());

            // 계층형으로 만들기 위해 하위 메뉴or페이지를 상위 vo의 childeren에 매핑
            for(MenuVO menuVO : menuList) {
                menuVO.setChildren(menuList.stream().filter(menu -> menu.getMenuId() != 0 && menu.getParMenuId()== menuVO.getMenuId()).collect(Collectors.toList()));
            }

            // 그 중 가장 상위 대메뉴만 필터링 이후 순서에 맞게 정렬을 한다.
            menuList = menuList.stream()
                    .filter(menu -> clientMenuVO.getMenuId() == menu.getMenuId())
                    .sorted(Comparator.comparing(MenuVO::getOrd))
                    .collect(Collectors.toList());

            // 도메인에 프로토콜이 없다면 프로토콜을 붙여 준다.
            if(!domainAddr.startsWith("http://")) {
                domainAddr = "http://" + domainAddr;
            }

            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(menuList);
            if("N".equals(clientMenuVO.getUseYn())) {
                domainAddr = domainAddr + ApiUrl.SYNC_MENU_DELETE.getApiUrl();
                Map<String, Object> map = new HashMap<>();
                map.put("menuId", clientMenuVO.getMenuId());
                resultVO = apiService.doApiGet(ApiNm.SYNC_MENU_DELETE.getApiNm(), domainAddr, map);
            }else {
                domainAddr = domainAddr + ApiUrl.SYNC_MENU.getApiUrl();
                resultVO = apiService.doApiPost(ApiNm.SYNC_MENU.getApiNm(), domainAddr, json);
            }

            clientMenuVO.setApplyYn("Y");
        }

        // 결과 값이 성공이라면 데이터베이스에 적재 시킨다.
        if(resultVO.getResult() == 0) {
            if(clientMenuVO.getClientMenuId() > 0) {
                clientMenuDao.updateClientMenu(clientMenuVO);
            }else {
                clientMenuDao.insertClientMenu(clientMenuVO);
            }
        }


        return resultVO;
    }
}
