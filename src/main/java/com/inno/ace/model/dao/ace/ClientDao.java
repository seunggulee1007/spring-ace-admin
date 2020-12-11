package com.inno.ace.model.dao.ace;

import com.inno.ace.model.vo.ClientVO;
import com.inno.ace.model.vo.PagingVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ClientDao {

    /**
     * 거래처 등록
     * @param clientVO
     * @return
     */
    int insertClient(ClientVO clientVO);

    /**
     * 거래처 수정
     * @param clientVO
     * @return
     */
    int updateClient(ClientVO clientVO);

    /**
     * 거래처 리스트 조회
     * @param pagingVO
     * @return
     */
    Optional<List<ClientVO>> selectClientList(PagingVO pagingVO);

    /**
     * 거래처 조회
     * @param clientId
     * @return
     */
    Optional<ClientVO> selectClient(int clientId);

}
