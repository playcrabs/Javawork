package com.iu.himart;
import java.util.Scanner;

public class HimartMain {

	public static void main(String[] args) {
		Computer com1 = new Computer();	//객체, 인스턴스
		Computer com2 = new Computer();	//객체, 인스턴스
		System.out.println();
		//배열 - 같은 데이터 타입만 모을수 있음, 한번 선언 시 크기 수정 불가능
		//모을려고 하는 데이터 타입[] 변수명 = new 데이터타입 [크기]
		Computer []  coms = new Computer[2];
		coms[0] = com1;
		coms[1] = com2;
		
		Tv tv = new Tv();
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		Product [] p = new Product[2];
		p[0] =tv;
		p[1] =com1;
		
		tv = (Tv)p[0];
		//클래스명 참조변수명 = new 클래스명();
		Object obj = new Object();		//객체생성
		boolean ch = obj.equals(tv);
		System.out.println("ch:"+ch);
		
		
		
	}

}
