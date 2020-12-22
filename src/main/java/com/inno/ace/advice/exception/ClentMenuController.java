package com.inno.ace.advice.exception;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.inno.ace.model.service.clientMenu.ClientMenuService;
import com.inno.ace.model.vo.ClientMenuVO;
import com.inno.ace.model.vo.ResultVO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/clientMenu")
public class ClentMenuController {
    private final ClientMenuService clientMenuService;

    @GetMapping("{clientId}")
    public ResultVO selectClientMenuList(@PathVariable int clientId) {
        return clientMenuService.selectClientMenuList(clientId);
    }

    @PostMapping
    public ResultVO syncClientMenu(ClientMenuVO clientMenuVO)  throws JsonProcessingException {
        return clientMenuService.syncClientMenu(clientMenuVO);
    }

}
