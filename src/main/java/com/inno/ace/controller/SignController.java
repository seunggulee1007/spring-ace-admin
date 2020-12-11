package com.inno.ace.controller;

import com.inno.ace.advice.exception.AlreadyMemberException;
import com.inno.ace.model.service.user.UserService;
import com.inno.ace.model.vo.ResultVO;
import com.inno.ace.model.vo.UserVO;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class SignController {

    private final UserService userService;
    
    @PostMapping("/signUp")
    @ApiOperation(value="회원 등록", notes="회원 등록")
    public ResultVO signUp(UserVO userVO)  throws AlreadyMemberException {
        return userService.signUp(userVO);
    }
    
    @PostMapping("/signIn")
    @ApiOperation(value="로그인", notes="회원 로그인")
    public ResultVO signIn(UserVO userVO, HttpServletResponse res) {
        return userService.signIn(userVO, res);
    }
    
    @PostMapping("/chgPwd")
    @ApiOperation(value="비밀번호변경", notes="비밀번호 변경 프로세스")
    public ResultVO chgPwd(UserVO userVO) {
        return userService.chgPwd(userVO);
    }
}
