package com.inno.ace.model.vo;

import lombok.Data;

import java.sql.Date;

@Data
public class CommuteVO {

    /** 출퇴근 아이디 */
    private int commuteId;
    /** 근무 종류 아이디 */
    private int workKindId;
    /** 사용자 아이디 */
    private String userId;
    /** 출근 날짜 */
    private String workDay;
    /** 출근 시간 */
    private Date startDt;
    /** 퇴근 시간 */
    private Date endDt;
    /** 총 근무시간 */
    private double totWorkTm;
    /** 기본 근무 시간 */
    private double basicWorkTm;
    /** 연장 근무 시간 */
    private double overWorkTm;
    /** 연차 시간 */
    private double AnnualTm;
    /** 휴일 근무 여부 */
    private boolean isHolyday;
    /** 연장 근무 여부 */
    private boolean isOverWork;

}
