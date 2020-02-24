package com.iu.t8;

import java.util.Calendar;

public class CalanderTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar.getTime());
		//roll(field, amount)
		//field의 시간을 amount만큼 조정, 다른 field에는 영향X
		calendar.roll(calendar.MINUTE, 50);
		System.out.println(calendar.getTime());
		System.out.println("++++++++++++++++++++++++++++");
		
		//add(field, amount)
		//field의 시간을 amount만큼 조정, 다른 field에 영향O
		calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		calendar.add(calendar.MINUTE, 50);
		System.out.println(calendar.getTime());

	}

}
