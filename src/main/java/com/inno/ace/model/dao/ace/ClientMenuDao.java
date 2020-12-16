package com.inno.ace.model.dao.ace;

import com.inno.ace.model.vo.ClientMenuVO;
import com.inno.ace.model.vo.ClientVO;
import com.inno.ace.model.vo.PagingVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ClientMenuDao {

    /**
     * 거래처 메뉴 조회
     * @param clientId
     * @return
     */
    List<ClientMenuVO> selectClientMenuList(int clientId);

    int insertClientMenu(ClientMenuVO clientMenuVO);

    int updateClientMenu(ClientMenuVO clientMenuVO);

}
