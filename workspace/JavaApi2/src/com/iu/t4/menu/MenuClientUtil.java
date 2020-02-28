package com.iu.t4.menu;

public class MenuClientUtil {
	
	
	public MenuVO  makeMenu(String menu) {
		MenuVO menuVO = new MenuVO();
		String [] menus = menu.split("-");
		menuVO.setMenuName(menus[0]);
		menuVO.setMenuPrice(Integer.parseInt(menus[1]));
		
		return menuVO;
	}

}
