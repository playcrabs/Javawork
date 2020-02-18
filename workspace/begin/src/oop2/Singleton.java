package oop2;

public class Singleton {

	private static Singleton s;

	//기본 생성자를 클래스 외부에서 접근할 수 없도록 선언하여 정의
	private Singleton(){}
	
	//s가 null인 경우에만 인스턴스를 생성
	public static Singleton getInstance() {
		if ( s == null ) {
			s = new Singleton();
		}
		return s;
	}
}
