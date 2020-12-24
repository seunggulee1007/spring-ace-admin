package com.inno.ace.model.service.code;

import com.inno.ace.model.vo.CodeVO;
import com.inno.ace.model.vo.PagingVO;
import com.inno.ace.model.vo.ResultVO;

import java.util.List;

public interface CodeService {

    ResultVO selectCodeList(int codeMasterId);

    List<CodeVO> selectCodeListByCodeMasterNm(String codeMasterNm);

    ResultVO insertCode(CodeVO codeVO);

    ResultVO updateCode(CodeVO codeVO);

    ResultVO deleteCode(int codeId);

    ResultVO updateOrd(int gu, int ord, int codeMasterId);

}
