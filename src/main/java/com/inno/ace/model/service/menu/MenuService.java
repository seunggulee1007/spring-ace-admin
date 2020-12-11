package com.inno.ace.model.service.menu;

import com.inno.ace.model.vo.MenuVO;
import com.inno.ace.model.vo.ResultVO;

public interface MenuService {

    /**
     * 메뉴 리스트 조회
     * @return
     */
    ResultVO selectMenuList();

    /**
     * 메뉴 조회
     * @param menuId
     * @return
     */
    ResultVO selectMenu(int menuId);

    /**
     * 메뉴 등록
     * @param menuVO
     * @return
     */
    ResultVO insertMenu(MenuVO menuVO);

    /**
     * 메뉴 수정
     * @param menuVO
     * @return
     */
    ResultVO updateMenu(MenuVO menuVO);

    /**
     * 메뉴 삭제
     * @param menuId
     * @return
     */
    ResultVO deleteMenu(int menuId);

    /**
     * 메뉴 순번 변경
     * @param gu
     * @param parMenuId
     * @param ord
     * @return
     */
    ResultVO updateOrd(int gu, int ord, int parMenuId);

}
