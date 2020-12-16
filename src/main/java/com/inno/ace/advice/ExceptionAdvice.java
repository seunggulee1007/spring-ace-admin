package com.inno.ace.advice;

import com.inno.ace.advice.exception.*;
import com.inno.ace.enums.CommonCode;
import com.inno.ace.enums.CommonMsg;
import com.inno.ace.model.vo.ResultVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 커스텀 예외 처리
 * @author es-seungglee
 *
 */
@RequiredArgsConstructor
@RestControllerAdvice
public class ExceptionAdvice{

    @ExceptionHandler(Exception.class)
    protected ResultVO defaultException(Exception e) {
        ResultVO resultVO = ResultVO.builder()
                .result(CommonCode.FAIL.getCode())
                .resultMsg(e.getMessage())
                .errMsg(e.getStackTrace()[0].toString())
                .build();
        e.printStackTrace();
        return resultVO;
    }

    @ExceptionHandler(NoVersionException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    protected ResultVO noVersionException(NoVersionException e) {
        ResultVO resultVO = ResultVO.builder()
                .result(CommonCode.FAIL.getCode())
                .resultMsg(e.getMessage())
                .errMsg(e.getStackTrace()[0].toString())
                .build();
        return resultVO;
    }
    
    @ExceptionHandler(AccessDeniedException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public ResultVO accessDeniedException(AccessDeniedException e, HttpServletRequest request) {
        ResultVO resultVO = ResultVO.builder()
                .result(CommonCode.FAIL.getCode())
                .resultMsg(e.getMessage())
                .errMsg(e.getStackTrace()[0].toString())
                .build();
        return resultVO;
    }
    
    @ExceptionHandler(CAuthenticationEntryPointException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ResultVO CEmailSigninFailedException(CAuthenticationEntryPointException e, HttpServletRequest request) {
        ResultVO resultVO = ResultVO.builder()
                .result(CommonCode.FAIL.getCode())
                .resultMsg(e.getMessage())
                .errMsg(CommonMsg.EXPIRE_LOGIN.getMsg())
                .build();
        return resultVO;
    }
    
    @ExceptionHandler(NoMemberException.class)
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    public ResultVO NoMemberException(NoMemberException e, HttpServletRequest request) {
        ResultVO resultVO = ResultVO.builder()
                .result(CommonCode.FAIL.getCode())
                .resultMsg(e.getMessage())
                .errMsg(e.getStackTrace()[0].toString())
                .build();
        return resultVO;
        
    }
    
    @ExceptionHandler(AlreadyMemberException.class)
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    public ResultVO AlreadyMemberException(AlreadyMemberException e, HttpServletRequest request) {
        ResultVO resultVO = ResultVO.builder()
                .result(CommonCode.FAIL.getCode())
                .resultMsg(e.getMessage())
                .errMsg(e.getStackTrace()[0].toString())
                .build();
        return resultVO;
    }

    @ExceptionHandler(DuplicationException.class)
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    public ResultVO DupleClientException(DuplicationException e) {
        ResultVO resultVO = ResultVO.builder()
                .result(CommonCode.FAIL.getCode())
                .resultMsg(e.getMessage())
                .errMsg(e.getStackTrace()[0].toString())
                .build();
        return resultVO;
    }

    @ExceptionHandler(FalseIDException.class)
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    public ResultVO FalseIDException(FalseIDException e, HttpServletRequest request) {
        ResultVO resultVO = ResultVO.builder()
                .result(CommonCode.FAIL.getCode())
                .resultMsg(e.getMessage())
                .errMsg(e.getStackTrace()[0].toString())
                .build();
        return resultVO;
    }
    
    @ExceptionHandler(BizServiceException.class)
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    protected ResultVO BizServiceException(BizServiceException e, HttpServletRequest request) {
        return ResultVO.builder()
                .result(CommonCode.FAIL.getCode())
                .resultMsg(e.getMessage())
                .errMsg(e.getStackTrace()[0].toString())
                .build();
    }
    
    @ExceptionHandler(CommonUtilException.class)
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    protected ResultVO CommonUtilException(CommonUtilException e, HttpServletRequest request) {
        return ResultVO.builder()
                .result(CommonCode.FAIL.getCode())
                .resultMsg(e.getMessage())
                .errMsg(e.getStackTrace()[0].toString())
                .build();
    }

    @ExceptionHandler(NoDomainAddrException.class)
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    protected ResultVO NoDomainAddrException(NoDomainAddrException e) {
        return ResultVO.builder()
                .result(CommonCode.FAIL.getCode())
                .resultMsg(e.getMessage())
                .errMsg(e.getStackTrace()[0].toString())
                .build();
    }

}
