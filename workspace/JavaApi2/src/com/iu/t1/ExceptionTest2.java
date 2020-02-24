package com.iu.t1;

import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		try {
		System.out.print("숫자를 입력:");
		int num = scan.nextInt();
		
		int num2 = 15;
		int result = num2/num;
		
		System.out.println(result);
		//Exception은 어떤 오류이든지 다 받을수 있음
		}catch(Exception e) {
			e.printStackTrace();
			e.getMessage();
			System.out.println("제대로 입력해주세요!");
		} finally {
			
		}
	}

}
