package com.inno.ace.model.service.api;

import com.inno.ace.model.vo.ResultVO;

import java.util.Map;

public interface ApiService {
    ResultVO doApi(String apiNm, String reqUrl, Map<String, Object> data);
}
