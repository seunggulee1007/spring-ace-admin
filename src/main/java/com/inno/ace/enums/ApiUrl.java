package com.inno.ace.enums;

public enum ApiUrl {
    SYNC_MENU("/innoApi/syncMenu"),
    ;
    String apiUrl;
    ApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }
    public String getApiUrl() { return apiUrl; }
}
