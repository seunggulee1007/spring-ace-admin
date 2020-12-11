package com.inno.ace.model.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=false)
public class MenuVO extends CommonVO {
    /** 메뉴 아이디 */
    private int menuId;
    /** 부모 메뉴 아이디 */
    private int parMenuId;
    /** 메뉴 명 */
    private String menuNm;
    /** 순서 */
    private int ord;
    /** 사용 여부 */
    private String useYn;
    /** 메뉴 여부 */
    private String menuYn;
    /** 메뉴 레벨 */
    private int menuLevel;
    /** 페이지 url */
    private String pageUrl;
    /** 컴포넌트 */
    private String component;
    /** 메타 정보 */
    private String metaInfo;

    private String name;
    private List<MenuVO> children;

}
