package com.iu.t1;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사람 이름을 대입
		Scanner scan = new Scanner(System.in);
		System.out.print("주민 번호를 입력:");
		String name = scan.next();
		char ch = name.charAt(7);
		if (ch=='1') {System.out.println("남자");} 
		if (ch=='2') {System.out.println("여자");} 
		
		
		
	}

}
