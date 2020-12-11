package com.inno.ace.model.service.security;

import com.inno.ace.advice.exception.NoMemberException;
import com.inno.ace.model.dao.ace.UserDao;
import com.inno.ace.model.vo.UserDetailVO;
import com.inno.ace.model.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomUserDetailService implements UserDetailsService {

    private final UserDao userDao;
    
    public UserDetails loadUserByUsername(String userPk) {
         UserVO userVO = userDao.selectUser(userPk).orElseThrow(NoMemberException::new);
         UserDetailVO user = UserDetailVO.builder().build();
         user.setUserId(userVO.getUserId());
         user.setPassword(userVO.getPassword());
         return user;
    }
}
