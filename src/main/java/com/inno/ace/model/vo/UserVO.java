package com.inno.ace.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class UserVO {
    
    @ApiModelProperty(value="아이디", required=true)
    private String userId;
    @ApiModelProperty(value="비밀번호", required=true)
    private String password;
    @ApiModelProperty(value="변경 비밀번호")
    private String chgPwd;
    @ApiModelProperty(value="이름")
    private String userNm;
    @ApiModelProperty(value="firebase UID")
    private String uId;
    @ApiModelProperty(value="등록일자")
    private String crtDtm;
    
}
