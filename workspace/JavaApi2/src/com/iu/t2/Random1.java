package com.iu.t2;

public class Random1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String menu = "삼겹살, 갈비, 초밥, 치킨, 햄버거, 피자, 족발, 굶기";
		String [] menus = menu.split(",");
		System.out.println("저녁메뉴 추천:"+menus[(int)(Math.random()*7)+1]);

		String [] per = new String[99];
		for (int i = 0; i < 5; i++) {
			per[i]="1등!";
		}
		for (int i = 5; i < 15; i++) {
			per[i]="2등!";
		}
		for (int i = 15; i < 30; i++) {
			per[i]="3등!";
		}
		for (int i = 30; i < 50; i++) {
			per[i]="4등!";
		}
		for (int i = 50; i < 99; i++) {
			per[i]="꽝";
		}
		
		for (int i = 0; i < 99; i++) {
			System.out.println("뽑기:"+per[(int)(Math.random()*98)+1]);
		}
	}

}
