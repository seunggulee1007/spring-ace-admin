package com.inno.ace.model.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ClientVO extends CommonVO {
    /** 클라이언트 아이디 */
    private int clientId;
    /** 거래처 이름 */
    private String clientNm;
    /** 거래처 종류 */
    private String clientKind;
    /** 사업자 번호 */
    private String bizNo;
    /** 휴폐업 조회결과 메시지 */
    private String bizResultMsg;
    /** 휴폐업 조회 결과 상세 메시지 */
    private String bizResultDetailMsg;
    /** 휴폐업 조회 결과 상세 영문 메시지 */
    private String bizResultDetailEngMsg;
    /** 휴폐업 조회 결과 */
    private String bizResult;
    /** 대표자 명 */
    private String ceoNm;
    /** 법인 등록 번호 */
    private String coRegNo;
    /** 업태 */
    private String bizCond;
    /** 업종 */
    private String bizKind;
    /** 계약 상태 */
    private String contractStatus;
    /** 우편번호 */
    private String postNo;
    /** 기본주소 */
    private String addr;
    /** 기본 영문 주소 */
    private String addrEng;
    /** 주소타입 (R:도로명, J:지번) */
    private String addrType;
    /** 상세주소 */
    private String addrDetail;
    /** 도로명 */
    private String roadNm;
    /** 도로명 코드 */
    private String roadNmCd;
    /** 법정동/법정리 코드 */
    private String bcode;
    /** 법정동/법정리 이름 */
    private String bname;
    /** 건물관리번호 */
    private String buildingCd;
    /** 건물명 */
    private String buildingNm;
    /** 도/시 이름 */
    private String sido;
    /** 시/군/구 이름 */
    private String sigungu;
    /** 시/군/구 코드 */
    private String sigunguCd;
    /** 대표전화번호 */
    private String telNo;
    /** 담당자 */
    private String manager;
    /** 휴대전화 */
    private String phone;
    /** 이메일 */
    private String email;
    /** 계약 금액 */
    private double contractAmt;
    /**  계약 기간 시작 일자 */
    private String contractDateFrom;
    /** 계약기간 종료 일자 */
    private String contractDateTo;
    /** 도메인 주소 */
    private String domainAddr;

}
