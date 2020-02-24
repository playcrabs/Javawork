package com.iu.t8;

import java.util.Calendar;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CalanderTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//생년월일을 입력받아서 Calander 객체로 변환
		Scanner scan = new Scanner(System.in);
		Calendar calander = Calendar.getInstance();

		int year = 0;
		int month = 0;
		int date = 0;
		calander.set(year, month, date);
		
		System.out.print("생년월일을 입력하세요:");
		String birth= scan.next();
		
		//1.split
		String [] str1 = birth.split(".");
		for (String s : str1) {
		}
		
		year = Integer.parseInt(str1[0]);
		month = Integer.parseInt(str1[1])-1;
		date = Integer.parseInt(str1[2]);
		
		//2. StringTokenizer
		System.out.println("----------------------");
		StringTokenizer st = new StringTokenizer (birth, ".");
			year = Integer.parseInt(st.nextToken());
			month = Integer.parseInt(st.nextToken());
			date = Integer.parseInt(st.nextToken());
		
		calander.set(year, month, date);
		System.out.println(calander.getTime());
			
//		//3. subtring
//		String y = birth.substring(0, 4);
//		String m = birth.substring(5,7);
//		String d = birth.substring(8);
//		System.out.println(y+" "+m+" "+d);

	}

}
