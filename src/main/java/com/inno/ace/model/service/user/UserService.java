package com.inno.ace.model.service.user;

import com.inno.ace.advice.exception.AlreadyMemberException;
import com.inno.ace.model.vo.ResultVO;
import com.inno.ace.model.vo.UserVO;

import javax.servlet.http.HttpServletResponse;

public interface UserService {

    ResultVO signUp(UserVO userVO) throws AlreadyMemberException;
    
    ResultVO signIn(UserVO userVO, HttpServletResponse res);
    
    ResultVO chgPwd(UserVO userVO);
    
}
