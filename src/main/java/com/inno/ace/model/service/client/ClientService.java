package com.inno.ace.model.service.client;

import com.inno.ace.model.vo.ClientVO;
import com.inno.ace.model.vo.PagingVO;
import com.inno.ace.model.vo.ResultVO;

public interface ClientService {

    /**
     * 거래처 리스트 조회
     * @param pagingVO
     * @return
     */
    ResultVO selectClientList(PagingVO pagingVO);

    /**
     * 거래처 명 중복 확인
     * @param clientNm
     * @return
     */
    ResultVO confirmDuple(String clientNm);

    /**
     * 거래처 등록
     * @param clientVO
     * @return
     */
    ResultVO insertClient(ClientVO clientVO);
    
    /**
     * 거래처 수정
     * @param clientVO
     * @return
     */
    ResultVO updateClient(ClientVO clientVO);
}
