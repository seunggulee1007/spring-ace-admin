package com.inno.ace.model.dao.ace;

import com.inno.ace.model.vo.ApiVO;
import com.inno.ace.model.vo.ClientVO;
import com.inno.ace.model.vo.PagingVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ApiDao {

   int insertApiLog(ApiVO apiVO);

   int updateApiLog(ApiVO apiVO);

}
