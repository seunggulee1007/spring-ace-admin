package com.inno.ace.model.dao.ace;

import com.inno.ace.model.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface UserDao {

    public Optional<UserVO> selectUser(String userId);
    
    public int insertUser(UserVO userVO);
    
    public int updatePwd(UserVO userVO);
    
}
