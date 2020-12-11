package com.inno.ace.controller;

import com.inno.ace.advice.exception.CAuthenticationEntryPointException;
import com.inno.ace.enums.CommonMsg;
import com.inno.ace.model.vo.ResultVO;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exception")
public class ExceptionCotroller {

    @GetMapping(value = "/entrypoint")
    public ResultVO entrypointException() {
        throw new CAuthenticationEntryPointException();
    }
    
    @GetMapping(value = "/accessdenied")
    public ResultVO accessdeniedException() {
        throw new AccessDeniedException(CommonMsg.EXPIRE_LOGIN.getMsg());
    }
}
