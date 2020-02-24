package com.iu.t8;

import java.util.Calendar;

public class CalanderTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//현재 시간을 객체로 저장
		Calendar calander = Calendar.getInstance();
		System.out.println(calander);
		
		//get(): 값 가져오기
		int year = calander.get(Calendar.YEAR);
		int date = calander.get(Calendar.DATE);
		int month = calander.get(Calendar.MONTH);
		int hour = calander.get(Calendar.HOUR);			//12시
		int hours = calander.get(Calendar.HOUR_OF_DAY);	//24시
		int min = calander.get(Calendar.MINUTE);
		int sec = calander.get(Calendar.SECOND);
		int mil = calander.get(Calendar.MILLISECOND);
		int y = calander.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("YEAR:"+year);
		System.out.println("MONTH:"+(month+1));
		System.out.println("DATE:"+date);
		System.out.println("HOUR"+hour);
		System.out.println("MIN:"+min);
		System.out.println("YOIL:"+y);
		System.out.println("==============================");
		//2060/3
		calander.set(Calendar.MONTH, 2);
		calander.set(Calendar.YEAR, 2060);
		System.out.println(calander.getTime());
		
	}

}
