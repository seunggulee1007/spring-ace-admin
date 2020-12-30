package com.inno.ace.controller;

import com.inno.ace.config.JwtTokenProvider;
import com.inno.ace.model.vo.ResultVO;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ApiController {
    private final JwtTokenProvider jwtTokenProvider;
    
    @GetMapping("/generateToken")
    @ApiOperation(value="토큰 생성", notes="유저에 대한 토큰 생성")
    public ResultVO generateToken(String userId) {
        List<String> authorities = new ArrayList<>();
        authorities.add("ROLE_USER");
        return ResultVO.builder().data(jwtTokenProvider.createToken(userId,authorities)).build();
    }
}
