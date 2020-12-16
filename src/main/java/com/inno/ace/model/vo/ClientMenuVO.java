package com.inno.ace.model.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=false)
public class ClientMenuVO extends CommonVO {

    /** 고객사 메뉴 아아디 */
    private int clientMenuId;
    /** 메뉴 아이디 */
    private int menuId;
    /** 메뉴 명 */
    private String menuNm;
    /** 순서 */
    private int ord;
    /** 사용 여부 */
    private String useYn;
    /** 거래처 아이디 */
    private int clientId;
    /** 적용 완료 여부 */
    private String applyYn;
    /** 즉시 여부 */
    private String immediateYn;

}
