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

    /**
     * 중복 조회
     * @param clientNm
     * @return
     */
    @GetMapping("/confirmDuple/{clientNm}")
    public ResultVO confirmDuple(@PathVariable String clientNm) {
        return clientService.confirmDuple(clientNm);
    }

    /**
     * 거래처 조회
     * @param clientId
     * @return
     */
    @GetMapping("/{clientId}")
    public ResultVO selectClient(@PathVariable int clientId) { return clientService.selectClient(clientId);}

    /**
     * 거래처 리스트 조회
     * @param pagingVO
     * @return
     */
    @GetMapping("/clientList")
    public ResultVO clientList(PagingVO pagingVO) { return clientService.selectClientList(pagingVO);}

    /**
     * 거래처 등록
     * @param clientVO
     * @return
     */
    @PostMapping
    public ResultVO insertClient(ClientVO clientVO) {
        return clientService.insertClient(clientVO);
    }

    /**
     * 거래처 수정
     * @param clientVO
     * @return
     */
    @PutMapping
    public ResultVO updateClient(ClientVO clientVO) {
        return clientService.updateClient(clientVO);
    }

}
