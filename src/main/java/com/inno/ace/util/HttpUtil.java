package com.inno.ace.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.springframework.stereotype.Component;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

@Component
public class HttpUtil {

    public String sendRest(String sendUrl, String json) throws IllegalStateException, IOException {

        String inputLine = null;
        StringBuffer outResult = new StringBuffer();
        URL url = new URL(sendUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setDoOutput(true);
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setRequestProperty("Accept-Charset", "UTF-8");
        conn.setConnectTimeout(10000);
        conn.setReadTimeout(10000);

        OutputStream os = conn.getOutputStream();
        os.write(json.getBytes("UTF-8"));
        os.flush();

        // 리턴된 결과 읽기
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
        while ((inputLine = in.readLine()) != null) {
            outResult.append(inputLine);
        }

        return outResult.toString();
    }

    public String requestPost(Map<String, Object> params, String reqUrl, Map<String, Object> propertyParam) throws UnsupportedEncodingException, MalformedURLException, IOException  {
        StringBuilder postData = new StringBuilder();
        for(Map.Entry<String,Object> param : params.entrySet()) {
            if(postData.length() != 0) postData.append('&');

            postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
            postData.append('=');
            postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));

        }
        
        return requestPost(postData.toString(), reqUrl, propertyParam);
    }
    
    public String requestPost(String reqParam, String reqUrl, Map<String, Object> propertyParam) throws MalformedURLException, IOException {
        
        String resultData = "";

        URL url = new URL(reqUrl);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setDoOutput(true);

        if(propertyParam != null) {
            for(Map.Entry<String,Object> param : propertyParam.entrySet()) {
                con.setRequestProperty(URLEncoder.encode(param.getKey(), "UTF-8"), URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
            }
        }

        try(OutputStream os = con.getOutputStream();) {
            os.write(reqParam.getBytes("utf-8"));
            os.flush();
        }

        try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"))) {
            String inputLine;

            while((inputLine  = in.readLine()) != null) {
                resultData += inputLine;
            }
        }

        
        return resultData;
    }
}
