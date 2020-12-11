package com.inno.ace.advice.exception;

import com.inno.ace.enums.CommonMsg;

/**
 * 버전 체크
 * @author es-seungglee
 *
 */
public class NoVersionException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = 1291658484551919953L;
    public NoVersionException(String msg, Throwable t) {
        super(msg, t);
    }
     
    public NoVersionException(String msg) {
        super(msg);
    }
     
    public NoVersionException() {
        super(CommonMsg.NO_VERSION.getMsg());
    }

}
