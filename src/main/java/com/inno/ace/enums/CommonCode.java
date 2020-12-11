package com.inno.ace.enums;

/**
 * 공통 코드 집합
 * @author es-seungglee
 *
 */
public enum CommonCode {

    SUCCESS(0)
    ,FAIL(-1)
    ,FORBIDDEN(-1001)
    ,SAVE(1)
    ,MODIFY(2)
    ,DELETE(3)
    ,NOTSUPPORTED(-1002)
    ,BOARD(1)
    ,TIAR_COST(2)
    ,COMPANY_CARD(3)
    ;
    int code;
    CommonCode(int code) {
        this.code = code;
    }
    
    public int getCode() {
        return code;
    }
    
}
