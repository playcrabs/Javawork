package oop;

public class Variable {
	//123456을 초기값으로 갖는 정수형 상수 MAX_NUM 선언
//	final int MAX_NUM; //=123456;
//	final int MAX_NUM = 1000000;
	
	//MAX_NUM의 값을 9999로 초기화하는 기본 생성자 생성
	//상수 선언은 생성자 초기화 뿐
	public Variable(){
		int MAX_NUM = 99999;
	}
	
	String name; //멤버변수  / 인스턴스(객체, 참조) 변수
	int count;
	
	static String type; //멤버변수  / 클래스(static, 공유) 변수
	static boolean flag;
	
	final static double PI= 3.14;
	
	// 멤버 변수 name과 flag의 값을 출력하는
	// printVar() 메소드 작성
	public void printVar() {
		//문자열을 저장하는 str변수를 선언하면서 Hello로 초기화
		String str = "Hello";
		System.out.println("name과 flag의 값:"+name+" "+flag);
	}
	// 클래스 변수 또는 static변수 또는 공유 변수들의 값만 출력하는
	// printStatic() 메소드 작성
	public static void printStatic(){
		//str은 지역변수이므로 선언지역 이외에선 사용불가
		System.out.println("type과 flag의 값:"+type+" "+flag);
	}
	
}
