package oop2;

public interface InterfaceA {
	double PI = 3.14;
	final double PII = 3.14;
	final static double PIII = 3.14;
	
	//int i; >final키워드가 없어도 상수이므로 값을 초기화 하지않고서는 선언 불가
	int i = 0;
	
	public void method(); //final이나abstract키워드가 없어도 상수, 추상메소드
	
	//인터페이스
	//일종의 추상클래스
	//추상클래스보다 추상화 정도가 높다.
	//-일반 메소드, 멤버변수 정의 불가
	//실제 구현된 것이 전혀없는 기본설계도
	//추상메소드와 상수만을 멤버로 가질수 있음
	//미리 정해진 규칙에 맞게 구현하도록 표준을 제시하는데 사용
	//자바의 단일 상속을 보완
	
	//접근제한 interface 인터페이스명{
	//	상수
	//	추상메소드
	//	default메소드
	//	-인터페이스에 추가된 공유 메소드
	//	-메소드 선언부에 static을 명시하고 바디 구현
	//	-인터페이스명.정적메소드명() 으로 사용 가능
	//	정적 메소드
	//	}
	
	//인터페이스간의 상속
	//접근제한 interface 이름 extends 인터페이스명,...{
	//	상수
	//	추상메소드
	//	default메소드
	//	-인터페이스에 추가된 일반 메소드
	//	-메소드 선언부에 default를 명시하고 바디구현
	//	정적 메소드
	//	}
	
	//인터페이스 구현
	//접근제한  class 클래스명 implements 인터페이스명 {}
	
}


//interfaceA와 iterfaceB를 구현하는 하위클래스 ClassA작성
class ClassA implements InterfaceA{
	@Override
	public void method() {
		System.out.println("method()");
	}
	public void methodd() {
		System.out.println("methodd()");
	}
	
	public void classAmethod() {
		System.out.println("calssAmethod");
	}
}

interface InterfaceB{
	public void methodB();
	default public void methodBB() {
		System.out.println("인터페이스 내의 일반 메소드");
	}
	
	public static void methodBBB() {
		System.out.println("인터페이스 내의 공유 메소드");
	}
}

interface InterfaceC extends InterfaceA, InterfaceB{
	void method();
}

//vehicle클래스를 상속받고
//InterfaceA와 B를 구현하는 하위클래스 ClassB작성
class ClassB extends Vehicle implements InterfaceA, InterfaceB{
	@Override
	public void method() {
		InterfaceB.methodBBB();
	}
	public void methodd() {
	}
	public void methodB() {
	}	
}
