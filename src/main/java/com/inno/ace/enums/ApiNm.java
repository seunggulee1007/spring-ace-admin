package com.inno.ace.enums;

public enum ApiNm {
    SYNC_MENU("메뉴 동기화"),
    ;
    String apiNm;
    ApiNm(String apiNm) {
        this.apiNm = apiNm;
    }

    public String getApiNm() {
        return apiNm;
    }
}
