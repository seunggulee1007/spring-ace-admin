package com.inno.ace.model.service.biz;

import com.inno.ace.advice.exception.BizServiceException;
import com.inno.ace.enums.CommonCode;
import com.inno.ace.enums.CommonMsg;
import com.inno.ace.model.vo.BizVO;
import com.inno.ace.model.vo.ResultVO;
import com.inno.ace.util.CommonUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

@Service
public class BizServiceImpl implements BizService {
    
    @Value("${biz.post_url}")
    private String BIZ_POST_URL;
    @Value("${biz.xml_rows}")
    private String BIZ_XML_ROWS;
    
    public ResultVO getBizInfo(String bizNo) throws IOException {
        
        BizVO bizVO = BizVO.builder().build();
        if(bizNo.indexOf("-") != -1) {
            bizNo = bizNo.replaceAll("-", "");
        }
        if(!CommonUtil.isBusinessId(bizNo)) {
            throw new BizServiceException("유효한 사업자 번호가 아닙니다. 사업자 번호를 다시 확인해 주세요");
        } else {
            String resultData = "";
            String postUrl = BIZ_POST_URL;
            String xmlRaw = BIZ_XML_ROWS;
            xmlRaw = xmlRaw.replace("{CRN}", bizNo);                               // 해당 필드 중 {CRN}의 값을 사업자 번호로 변경시킨다.
            URL url = new URL(postUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/xml");
            conn.setDoOutput(true);                                                 // Server 통신에서 출력 가능한 상태로 만듬
            
            try(OutputStream os = conn.getOutputStream();){
                os.write(xmlRaw.getBytes("utf-8"));
                os.flush();
                os.close();
            }
            
            try (BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"))) {
                String inputLine;
                
                while((inputLine  = in.readLine()) != null) {
                    resultData += inputLine;
                }
            }
            List<Map<String, String>> xmlList = CommonUtil.getMapResultFromXml(resultData);             // xml 형식을 map으로 바꿔서 list형태로 저장
            Map<String, String> firstData = xmlList.get(0);
            
            bizVO.setBizNo(bizNo);
            bizVO.setResultMsg(firstData.get("trtCntn"));
            bizVO.setDetailMsg(firstData.get("smpcBmanTrtCntn"));
            bizVO.setDetailMsgEngl(firstData.get("smpcBmanEnglTrtCntn"));
        }
        return ResultVO.builder()
                .result(CommonCode.SUCCESS.getCode())
                .resultMsg(CommonMsg.SUCCESS_SEARCH.getMsg())
                .data(bizVO)
                .build();
    }
}
