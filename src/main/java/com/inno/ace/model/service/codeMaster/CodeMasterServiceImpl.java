package com.inno.ace.model.service.codeMaster;

import com.inno.ace.enums.CommonMsg;
import com.inno.ace.model.dao.ace.CodeMasterDao;
import com.inno.ace.model.vo.CodeMasterVO;
import com.inno.ace.model.vo.PagingVO;
import com.inno.ace.model.vo.ResultVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CodeMasterServiceImpl implements CodeMasterService {

    // 코드 마스터 dao
    private final CodeMasterDao codeMasterDao;

    /**
     * 코드 마스터 리스트 조회
     * @param pagingVO
     * @return
     */
    public ResultVO selectCodeMasterList(PagingVO pagingVO) {
        pagingVO.calcPage(codeMasterDao.selectCodeMasterCnt(pagingVO));
        return ResultVO.builder().data(codeMasterDao.selectCodeMasterList(pagingVO)).build();
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

}
