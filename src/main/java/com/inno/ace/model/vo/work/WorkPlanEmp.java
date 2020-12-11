package com.inno.ace.model.vo.work;

import com.inno.ace.model.vo.CommonVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class WorkPlanEmp extends CommonVO {
    
    /** 사원 근무 등록 아이디 */
    private int workPlanEmpId;
    /** 근무 종류 아이디 */
    private int workKindId;
    /** 근무 시간 아이디 */
    private int workTimeId;
    /** 사원 아이디 */
    private String userId;
    
}
