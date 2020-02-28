package com.iu.t4.menu;

import java.util.ArrayList;

public class MenuClientView {
	
	public void view(ArrayList<MenuVO> ar) {
		System.out.println("MenuName \t MenuPrice");
		for(MenuVO menuVO : ar) {
			System.out.println(menuVO.getMenuName()+"\t"+menuVO.getMenuPrice());
			System.out.println("----------------------------");
		}
		
	}

}
