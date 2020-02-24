package com.iu.t8;

import java.util.Calendar;

public class CalanderTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		long mil = calendar.getTimeInMillis();
		System.out.println(mil);
		
		Calendar yesterday = Calendar.getInstance();
		yesterday.set(Calendar.DATE, 23);
		System.out.println(calendar.getTime());
		System.out.println(yesterday.getTime());
	
		long yes = yesterday.getTimeInMillis();
		System.out.println(yes);
		
		long result = mil-yes;
		System.out.println(result);
		System.out.println(result/1000);
		System.out.println(result/(1000*60));		//분
		System.out.println(result/(1000*60*60));		//분
		System.out.println(result/(1000*60*60*24));		//분
	}

}
