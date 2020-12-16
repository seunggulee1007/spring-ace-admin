package com.inno.ace.model.service.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.google.gson.Gson;
import com.inno.ace.enums.CommonMsg;
import com.inno.ace.model.dao.ace.ApiDao;
import com.inno.ace.model.service.menu.MenuService;
import com.inno.ace.model.vo.ApiVO;
import com.inno.ace.model.vo.ResultVO;
import com.inno.ace.util.HttpUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ApiServiceImpl implements ApiService {

    private final ApiDao apiDao;
    private final HttpUtil httpUtil;

    public ResultVO doApi(String apiNm, String reqUrl, Map<String, Object> data) {
        JsonMapper mapper = new JsonMapper();
        long resCd = 0;
        String resMsg = CommonMsg.SUCCESS_API.getMsg();
        ApiVO apiVO = new ApiVO();
        try {
            String json = mapper.writeValueAsString(data);
            apiVO.setReqData(json);
            apiVO.setReqNm(apiNm);
            StackTraceElement[] ste = Thread.currentThread().getStackTrace();
            apiVO.setReqLoc(ste[0].toString());
            apiDao.insertApiLog(apiVO);
            System.err.println("==============================================");
            System.err.println(apiVO.toString());
            System.err.println("==============================================");
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
