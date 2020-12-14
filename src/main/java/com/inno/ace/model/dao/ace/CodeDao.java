package com.inno.ace.model.dao.ace;

import com.inno.ace.model.vo.CodeVO;
import com.inno.ace.model.vo.PagingVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CodeDao {

    /**
     * @apiNote 코드 마스터 아이디로 코드 목록 조회
     * @author leesg
     * @param pagingVO
     * @return
     */
    List<CodeVO> selectCodeList(PagingVO pagingVO);

    /**
     * 코드 리스트 건수 조회
     * @param pagingVO
     * @return
     */
    int selectCodeCnt(PagingVO pagingVO);

    /**
     * 마스터 아이디로 코드 리스트 조회
     * @param codeMsterId
     * @return
     */
    List<CodeVO>selectCodeListByMasterId(int codeMsterId);

    /**
     * 그룹 명으로 코스트 리스트 조회
     * @param codeMasterNm
     * @return
     */
    List<CodeVO> selectCodeListByCodeMasterNm(String codeMasterNm);

    /**
     * @apiNote 코드 정보 등록
     * @author leesg
     * @param codeVO
     * @return
     */
    int insertCode(CodeVO codeVO);

    /**
     * @apiNote 코드 수정
     * @author leesg
     * @param codeVO
     * @return
     */
    int updateCode(CodeVO codeVO);

    /**
     * 코드 순서 변경
     * @param ord
     * @param codeId
     * @return
     */
    int updateOrd(int ord, int codeId);
    
    /**
     * @apiNote 코드 삭제
     * @author leesg
     * @param codeId
     * @return
     */
    int deleteCode(int codeId);
    
    /**
     * @apiNote 코드 마스터 아이디로 코드 목록 전체 삭제
     * @author leesg
     * @param codeMasterId
     * @return
     */
    int deleteCodeList(int codeMasterId);
    
}
