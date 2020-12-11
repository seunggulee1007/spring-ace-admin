package com.inno.ace.model.vo.work;

import com.inno.ace.model.vo.CommonVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class WorkBaseVO extends CommonVO {

    /** 근무 기준 아이디 */
    private int workBaseId;
    /** 근무 종류 아이디 */
    private int workKindId;
    /** 적용 시작일 */
    private String applyDt;
    /** 정산단위 기간 */
    private String settleUnitTerm;
    
}
