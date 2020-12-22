package com.inno.ace.model.service.clientMenu;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.inno.ace.model.vo.ClientMenuVO;
import com.inno.ace.model.vo.ResultVO;

public interface ClientMenuService {
    ResultVO selectClientMenuList(int client);

    ResultVO syncClientMenu(ClientMenuVO clientMenuVO) throws JsonProcessingException;

}
