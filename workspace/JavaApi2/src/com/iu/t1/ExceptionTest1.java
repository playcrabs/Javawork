package com.iu.t1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//try-catch문
		//예외가 발생할 구간을 try로 감싸고, catch로 처리
		try {
		System.out.print("숫자 입력:");
		int data1 = scan.nextInt();
		System.out.print("글자 입력:");
		String data2 = scan.next();
		//발생한 예외객체, 생략되어 있음
		//throw new InputMismatchException();
		
		System.out.print("입력한 데이터:"+data2);
		System.out.println();
	
		int result = Integer.parseInt(data2);
		//타입이 달라서 catch에서 받아주지 못함
		//throw new NumberFormatException();
		System.out.print("결과:"+result);
		//예외가 발생했을때 실행될 코드, catch문은 여러개 사용 가능함
		}catch(InputMismatchException e) {
			//Exception의 종류를 알려줌
			e.printStackTrace();
			System.out.println("타입에 맞게 입력해주세요!(1)");
		}catch(NumberFormatException e) {
			//Exception의 종류를 알려줌
			e.printStackTrace();
			System.out.println("타입에 맞게 입력해주세요!(2)");
		}catch(Exception e) {
			System.out.println("예외 발생!");
		}
		System.out.println();
		System.out.println("프로그램 종료");
	}

}
