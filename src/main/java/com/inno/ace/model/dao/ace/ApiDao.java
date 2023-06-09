package com.inno.ace.model.dao.ace;

import com.inno.ace.model.vo.ApiVO;
import com.inno.ace.model.vo.ClientVO;
import com.inno.ace.model.vo.PagingVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ApiDao {

   /** api 요청부 적재 */
   int insertApiLog(ApiVO apiVO);
   /** api 응답부 적재 */
   int updateApiLog(ApiVO apiVO);

}
