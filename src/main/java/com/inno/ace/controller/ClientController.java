package com.inno.ace.controller;

import com.inno.ace.model.service.client.ClientService;
import com.inno.ace.model.vo.ClientVO;
import com.inno.ace.model.vo.PagingVO;
import com.inno.ace.model.vo.ResultVO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/client")
public class ClientController {

    private final ClientService clientService;

    @GetMapping("/confirmDuple/{clientNm}")
    public ResultVO confirmDuple(@PathVariable String clientNm) {
        return clientService.confirmDuple(clientNm);
    }

    @GetMapping("/clientList")
    public ResultVO clientList(PagingVO pagingVO) { return clientService.selectClientList(pagingVO);}
    @PostMapping
    public ResultVO insertClient(ClientVO clientVO) {
        return clientService.insertClient(clientVO);
    }

    @PutMapping
    public ResultVO updateClient(ClientVO clientVO) {
        return clientService.updateClient(clientVO);
    }

}
