package com.inno.ace.enums;

public enum ApiNm {
    SYNC_MENU("메뉴 동기화"),
    SYNC_MENU_DELETE("메뉴 삭제 동기화"),
    SYNC_CODE("코드 동기화"),
    ;
    String apiNm;
    ApiNm(String apiNm) {
        this.apiNm = apiNm;
    }

    public String getApiNm() {
        return apiNm;
    }
}
