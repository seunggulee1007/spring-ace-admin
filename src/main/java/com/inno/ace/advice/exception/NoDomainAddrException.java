package com.inno.ace.advice.exception;

import com.inno.ace.enums.CommonMsg;


public class NoDomainAddrException extends RuntimeException {

    public NoDomainAddrException(String msg, Throwable t) {
        super(msg, t);
    }

    public NoDomainAddrException(String msg) {
        super(msg);
    }

    public NoDomainAddrException() {
        super(CommonMsg.NO_DOMAIN_ADDR.getMsg());
    }

}
