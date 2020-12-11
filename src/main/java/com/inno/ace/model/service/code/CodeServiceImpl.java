package com.inno.ace.model.service.code;

import com.inno.ace.enums.CommonMsg;
import com.inno.ace.model.dao.ace.CodeDao;
import com.inno.ace.model.vo.CodeVO;
import com.inno.ace.model.vo.PagingVO;
import com.inno.ace.model.vo.ResultVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CodeServiceImpl implements CodeService {
    private final CodeDao codeDao;

    public ResultVO selectCodeList(PagingVO pagingVO) {
        pagingVO.calcPage(codeDao.selectCodeCnt(pagingVO));
        List<CodeVO> codeList = codeDao.selectCodeList(pagingVO);
        return ResultVO.builder().data(codeList).build();
    }

    public ResultVO insertCode(CodeVO codeVO) {
        long result = 0;
        String resultMsg = CommonMsg.SUCCESS_WRITE.getMsg();
        if(codeDao.insertCode(codeVO) < 1) {
            result = -1;
            resultMsg = CommonMsg.FAIL_WRITE.getMsg();
        }
        return ResultVO.builder().result(result).resultMsg(resultMsg).build();
    }

    public ResultVO updateCode(CodeVO codeVO) {
        long result = 0;
        String resultMsg = CommonMsg.SUCCESS_MODIFY.getMsg();
        if(codeDao.updateCode(codeVO) < 1) {
            result = -1;
            resultMsg = CommonMsg.FAIL_MODIFY.getMsg();
        }
        return ResultVO.builder().result(result).resultMsg(resultMsg).build();
    }

    public ResultVO deleteCode(int codeId) {
        long result = 0;
        String resultMsg = CommonMsg.SUCCESS_DELETE.getMsg();
        if(codeDao.deleteCode(codeId) < 1) {
            result = -1;
            resultMsg = CommonMsg.FAIL_DELETE.getMsg();
        }
        return ResultVO.builder().result(result).resultMsg(resultMsg).build();
    }

    public ResultVO updateOrd(int gu, int ord, int codeMasterId) {
        List<CodeVO> codeList = codeDao.selectCodeListByMasterId(codeMasterId);
        CodeVO codeVO = codeList.get(ord-1);    // 해당 순번에 있는 메뉴 꺼내오기
        codeList.remove(ord-1);           // 꺼낸 메뉴 삭제
        int chgOrd = ord;
        switch (gu) {
            case 1:
                // 순번을 최상위로 변경
                chgOrd = 0;
                break;
            case 2:
                // 순번을 하나 위로 변경
                chgOrd = ord-2;
                break;
            case 3 :
                // 순번을 하나 아래로 변경
                chgOrd = ord;
                break;
            case 4:
                chgOrd = codeList.size();
                break;
        }
        codeList.add(chgOrd, codeVO);
        for(int i=0; i<codeList.size(); i++) {
            codeList.get(i).setOrd(i+1);
            codeDao.updateOrd(codeList.get(i).getOrd(), codeList.get(i).getCodeId());
        }
        return ResultVO.builder().data(chgOrd).build();
    }

}
