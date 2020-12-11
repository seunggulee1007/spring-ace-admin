package com.inno.ace.model.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.sql.Date;

@Builder
@Data
public class BizVO {
    
    @ApiModelProperty(value="사업자 번호")
    private String bizNo;
    
    @ApiModelProperty(value="조회자 아이디")
    private String userId;
    
    @ApiModelProperty(value="조회자 이름")
    private String userNm;
    
    @ApiModelProperty(value="결과 값")
    private String resultMsg;
    
    @ApiModelProperty(value="결과 상세 메시지")
    private String detailMsg;
    
    @ApiModelProperty(value="결과 상세 메시지 영문")
    private String detailMsgEngl;
    
    @ApiModelProperty(value="등록(조회)일자")
    private Date crtDate;
    
}
