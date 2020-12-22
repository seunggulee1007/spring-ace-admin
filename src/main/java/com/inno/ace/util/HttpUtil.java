package com.inno.ace.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.springframework.stereotype.Component;

import java.io.*;
import java.net.*;
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

    public String requestGet(String reqUrl, Map<String, Object> params)  {

        StringBuilder postData = new StringBuilder();
        String resultData = "";
        try {

            for(Map.Entry<String,Object> param : params.entrySet()) {
                if(postData.length() != 0) postData.append('&');
                postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
                postData.append('=');
                postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
            }

            URL url = new URL(reqUrl + "?" + postData.toString());

            HttpURLConnection conn = (HttpURLConnection)url.openConnection();

            conn.setRequestMethod("GET");
            // 연결 타임 아웃
            conn.setConnectTimeout(3000); // 3초
            // 읽기 타임아웃
            conn.setReadTimeout(3000);  // 3초

            try (BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"))) {
                String inputLine;

                while((inputLine  = in.readLine()) != null) {
                    resultData += inputLine;
                }
            }
        }catch (MalformedURLException | ProtocolException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return resultData;
    }
}
