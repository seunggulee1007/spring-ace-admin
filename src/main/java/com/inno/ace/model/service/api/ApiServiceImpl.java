package com.inno.ace.model.service.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import com.inno.ace.enums.CommonMsg;
import com.inno.ace.model.dao.ace.ApiDao;
import com.inno.ace.model.vo.ApiVO;
import com.inno.ace.model.vo.ResultVO;
import com.inno.ace.util.HttpUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ApiServiceImpl implements ApiService {

    private final ApiDao apiDao;
    private final HttpUtil httpUtil;

    @Transactional
    public ResultVO doApiGet(String apiNm, String reqUrl, Map<String, Object> map ) {
        long resCd = 0;
        String resMsg = CommonMsg.SUCCESS_API.getMsg();
        ApiVO apiVO = new ApiVO();
        try {
            apiVO.setReqData(map.toString());
            apiVO.setReqNm(apiNm);
            StackTraceElement[] ste = Thread.currentThread().getStackTrace();
            apiVO.setReqLoc(ste[0].toString());
            apiDao.insertApiLog(apiVO);
            String result = httpUtil.requestGet(reqUrl, map);
            apiVO.setResData(result);
            ResultVO resultVO = new Gson().fromJson(result, ResultVO.class);
            resCd = resultVO.getResult();
            resMsg = resultVO.getResultMsg();
        } catch(IllegalStateException e) {
            resCd = -1;
            resMsg = e.getMessage();
        }
        apiVO.setResCd(resCd);
        apiVO.setResMsg(resMsg);
        apiDao.updateApiLog(apiVO);
        return ResultVO.builder().result(resCd).resultMsg(resMsg).build();
    }

    @Transactional
    public ResultVO doApiPost(String apiNm, String reqUrl, String json) {
        long resCd = 0;
        String resMsg = CommonMsg.SUCCESS_API.getMsg();
        ApiVO apiVO = new ApiVO();
        try {
            apiVO.setReqData(json);
            apiVO.setReqNm(apiNm);
            StackTraceElement[] ste = Thread.currentThread().getStackTrace();
            apiVO.setReqLoc(ste[0].toString());
            apiDao.insertApiLog(apiVO);
            String result = httpUtil.sendRest(reqUrl, json);
            apiVO.setResData(result);
            ResultVO resultVO = new Gson().fromJson(result, ResultVO.class);
            resCd = resultVO.getResult();
            resMsg = resultVO.getResultMsg();
        } catch(JsonProcessingException e) {
            resCd = -1;
            resMsg = e.getMessage();
            e.printStackTrace();
        } catch(IllegalStateException e) {
            resCd = -1;
            resMsg = e.getMessage();
        } catch (IOException e) {
            resCd = -1;
            resMsg = e.getMessage();
        }
        apiVO.setResCd(resCd);
        apiVO.setResMsg(resMsg);
        apiDao.updateApiLog(apiVO);
        return ResultVO.builder().result(resCd).resultMsg(resMsg).build();
    }


}
