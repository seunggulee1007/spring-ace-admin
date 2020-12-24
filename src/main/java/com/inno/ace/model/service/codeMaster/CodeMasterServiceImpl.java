package com.inno.ace.model.service.codeMaster;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.inno.ace.advice.exception.DuplicationException;
import com.inno.ace.enums.ApiNm;
import com.inno.ace.enums.ApiUrl;
import com.inno.ace.enums.CommonMsg;
import com.inno.ace.model.dao.ace.CodeMasterDao;
import com.inno.ace.model.service.api.ApiService;
import com.inno.ace.model.service.client.ClientService;
import com.inno.ace.model.vo.ClientVO;
import com.inno.ace.model.vo.CodeMasterVO;
import com.inno.ace.model.vo.PagingVO;
import com.inno.ace.model.vo.ResultVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CodeMasterServiceImpl implements CodeMasterService {

    // 코드 마스터 dao
    private final CodeMasterDao codeMasterDao;
    private final ClientService clientService;
    private final ApiService apiService;

    public ResultVO selectDupleCodeNm(String codeMasterNm) {
        if(codeMasterDao.selectDupleCodeNm(codeMasterNm) > 0) {
            throw new DuplicationException(CommonMsg.DUPLE_CODE_MASTER_NM.getMsg());
        }
        return ResultVO.builder().resultMsg(CommonMsg.AVAILABLE_MASTER_NM.getMsg()).build();
    }

    /**
     * 코드 마스터 리스트 조회
     * @param pagingVO
     * @return
     */
    public ResultVO selectCodeMasterList(PagingVO pagingVO) {
        int cnt = codeMasterDao.selectCodeMasterCnt(pagingVO);
        Map<String, Object> map= new HashMap<>();
        List<CodeMasterVO> list = codeMasterDao.selectCodeMasterList(pagingVO);
        map.put("listCnt", cnt);
        map.put("codeMasterList", list);
        return ResultVO.builder().data(map).build();
    }

    /**
     * @apiNote 코드 마스터 저장
     * @param codeMasterVO
     * @return
     */
    public ResultVO insertCodeMaster(CodeMasterVO codeMasterVO) {
        int result = 0;
        String resultMsg= CommonMsg.SUCCESS_WRITE.getMsg();
        if(codeMasterDao.insertCodeMaster(codeMasterVO) < 1) {
            result = -1;
            resultMsg = CommonMsg.FAIL_WRITE.getMsg();
        }
        return ResultVO.builder().result(result).resultMsg(resultMsg).build();
    }

    /**
     * @apiNote 코드 마스터 수정
     * @param codeMasterVO
     * @return
     */
    public ResultVO updateCodeMaster(CodeMasterVO codeMasterVO) {
        int result = 0;
        String resultMsg= CommonMsg.SUCCESS_MODIFY.getMsg();
        if(codeMasterDao.updateCodeMaster(codeMasterVO) < 1) {
            result = -1;
            resultMsg = CommonMsg.FAIL_MODIFY.getMsg();
        }
        return ResultVO.builder().result(result).resultMsg(resultMsg).build();
    }

    /**
     * @apiNote 코드 마스터 삭제
     * @param codeMasterId
     * @return
     */
    public ResultVO deleteCodeMaster(int codeMasterId) {
        int result = 0;
        String resultMsg= CommonMsg.SUCCESS_DELETE.getMsg();
        if(codeMasterDao.deleteCodeMaster(codeMasterId) < 1) {
            result = -1;
            resultMsg = CommonMsg.FAIL_DELETE.getMsg();
        }
        return ResultVO.builder().result(result).resultMsg(resultMsg).build();
    }

    public ResultVO syncCode(int clientId) throws JsonProcessingException {
        ClientVO clientVO = (ClientVO)clientService.selectClient(clientId).getData();
        String domainAddr = clientVO.getDomainAddr();
        // 도메인에 프로토콜이 없다면 프로토콜을 붙여 준다.
        if(!domainAddr.startsWith("http://")) {
            domainAddr = "http://" + domainAddr + ApiUrl.SYNC_CODE.getApiUrl();
        }
        List<CodeMasterVO> codeMasterList = codeMasterDao.selectCodeMasterAll();
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(codeMasterList);
        return apiService.doApiPost(ApiNm.SYNC_CODE.getApiNm(), domainAddr, json);
    }


}
