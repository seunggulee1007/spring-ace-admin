package com.inno.ace.model.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class CodeVO extends CommonVO {

    /** 코드 아이디 */
    private int codeId;
    /** 코드 마스터 아이디 */
    private int codeMasterId;
    /** 코드 마스터 명 */
    private String codeMasterNm;
    /** 코드 */
    private String code;
    /** 코드 명 */
    private String codeNm;
    /** 코드 설명 */
    private String codeInfo;
    /** 순서 */
    private int ord;
    /** 사용 여부 */
    private String useYn;
    /** 문자형 1 */
    private String char_1;
    /** 문자형 2 */
    private String char_2;
    /** 문자형 3 */
    private String char_3;
    /** 문자형 4 */
    private String char_4;
    /** 문자형 5 */
    private String char_5;
    /** 정수형 1 */
    private int int_1;
    /** 정수형 2 */
    private int int_2;
    /** 정수형 3 */
    private int int_3;
    /** 정수형 4 */
    private int int_4;
    /** 정수형 5 */
    private int int_5;
    
}
