package com.inno.ace.model.vo.work;

import com.inno.ace.model.vo.CommonVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class WorkKindVO extends CommonVO {

    /** 근무 종류 아이디 */
    private int workKindId;
    /** 근무제 종류 명 */
    private String workKindNm;
    
}
