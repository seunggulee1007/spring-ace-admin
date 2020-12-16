package com.inno.ace.model.vo;

import lombok.Data;

@Data
public class ApiVO {

    /** 요청 번호 */
   private int reqNo;
   /** 요청 서비스 */
   private String reqNm;
   /** 요청 데이터 */
   private String reqData;
   /** 요청 경로 */
   private String reqLoc;
   /** 응답 데이터 */
   private String resData;
   /** 응답 결과 */
   private long resCd;
   /** 응답 메시지 */
   private String resMsg;
   /** 요청일자 */
   private String reqDtm;
   /** 응답일자 */
   private String resDtm;
    
}
