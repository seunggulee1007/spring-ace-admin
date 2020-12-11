package com.inno.ace.model.vo.work;

import com.inno.ace.model.vo.CommonVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class WorkTimeVO extends CommonVO {

    /** 근무 시간 아이디 */
    private int workTimeId;
    /** 근무 기준 아이디 */
    private int workBaseId;
    /** 근무 시작 시간 */
    private String workStartTm;
    /** 근무 종료 시간 */
    private String workEndTm;
    /** 총 근무 시간 */
    private int workTotTm;
    
}
