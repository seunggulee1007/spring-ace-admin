package com.inno.ace.model.service.clientMenu;

import com.inno.ace.advice.exception.NoDomainAddrException;
import com.inno.ace.enums.ApiNm;
import com.inno.ace.enums.ApiUrl;
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

    public ResultVO syncClientMenu(ClientMenuVO clientMenuVO) {
        ClientVO clientVO = (ClientVO)clientService.selectClient(clientMenuVO.getClientId()).getData();
        String domainAddr = clientVO.getDomainAddr();
        ResultVO resultVO = ResultVO.builder().build();
        if(StringUtils.isEmpty(domainAddr)) {
            throw new NoDomainAddrException();
        }
        if("Y".equals(clientMenuVO.getImmediateYn())) {
            List<MenuVO> menuList = menuService.selectMenuListByMenuId(clientMenuVO.getMenuId());
            for(MenuVO menuVO : menuList) {
                menuVO.setChildren(menuList.stream().filter(menu -> menu.getMenuId() != 0 && menu.getParMenuId()== menuVO.getMenuId()).collect(Collectors.toList()));
            }
            menuList = menuList.stream()
                    .filter(menu -> clientMenuVO.getMenuId() == menu.getMenuId())
                    .sorted(Comparator.comparing(MenuVO::getOrd))
                    .collect(Collectors.toList());
            if(!domainAddr.startsWith("http://")){
                domainAddr = "http://" + domainAddr;
            }
            domainAddr = domainAddr + ApiUrl.SYNC_MENU.getApiUrl();
            Map<String, Object> map = new HashMap<>();
            map.put("data", menuList);
            resultVO = apiService.doApi(ApiNm.SYNC_MENU.getApiNm(), domainAddr, map);

        }
        if(resultVO.getResult() == 0) {
            clientMenuVO.setApplyYn("Y");
            if(clientMenuVO.getClientMenuId() > 0) {
                clientMenuDao.updateClientMenu(clientMenuVO);
            }else {
                clientMenuDao.insertClientMenu(clientMenuVO);
            }
        }


        return resultVO;
    }
}
