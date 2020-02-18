package com.iu.t1;

import java.util.Scanner;

public class StringTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="AppleGoogle";
		int index = str.indexOf('e');
		System.out.println("index:"+index);
		
		int index2 = str.lastIndexOf('e');
		System.out.println("index2:"+index2);
		
		String sub = str.substring(2);
		System.out.println("sub:"+sub);
		
		String sub2 = str.substring(5, 11);
		System.out.println("sub2:"+sub2);

		//.뒤로 파일명이 뭔지 구분해야함
		//test.jpg
		Scanner scan = new Scanner(System.in);
		System.out.print("파일명을 입력:");
		String fileName = scan.next();
		int index3= fileName.indexOf('.');
		String file =fileName.substring(index3);
		if (file.equals(".jpg") || file.equals(".gif") || file.equals(".png")) {
			System.out.println("사진 파일 입니다.");
		} else {
			System.out.println("사진 파일이 아닙니다.");
		}
		
		
	}

}
