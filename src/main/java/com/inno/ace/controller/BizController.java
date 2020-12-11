package com.inno.ace.controller;

import com.inno.ace.model.service.biz.BizService;
import com.inno.ace.model.vo.ResultVO;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/biz")
public class BizController {

    private final BizService bizService;
    
    @ApiOperation(value="사업자 휴폐업 조회", notes="넘겨진 사업자 번호로 휴폐업 상태 조회")
    @GetMapping("/bizInfo/{bizNo}")
    public ResultVO getBiz(@PathVariable String bizNo) throws IOException {
        return bizService.getBizInfo(bizNo);
    }
    
}
