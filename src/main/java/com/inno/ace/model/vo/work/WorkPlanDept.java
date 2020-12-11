package com.inno.ace.model.vo.work;

import com.inno.ace.model.vo.CommonVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class WorkPlanDept extends CommonVO {

    /** 부서 근무등록 아이디 */
    private int workPlanDeptId;
    /** 근무 종류 아이디 */
    private int workKindId;
    /** 근무 시간 아이디 */
    private int workTimeId;
    /** 적용 시작일 */
    private String applyDt;
    
}
