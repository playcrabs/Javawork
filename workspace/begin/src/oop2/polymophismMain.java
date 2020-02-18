package oop2;

public class polymophismMain {
	// 다형성
	// -인스턴스의 취급이 변수의 형태에 의해 변하는 것
	// -부모 타입으로 자식 클래스를 참조
	// > 상속 시켜준 멤버만 접근 가능
	// > Parent p = new Child();
	//  왼쪽 객체가 오른쪽 객체의 상위클래스인 경우엔 자동 형변환됨
	// 	반대의 경우에는 강제 형변환 필요
	//  단, 할당되는 인스턴스 유형에 따라 실행 오류 발생 가능
	// -기본형 데이터들처럼 참조 자료형 변수들도 형변환
	
	// UP casting
	// -자식을 부모 클래스의 부모 타입으로 형변환
	// -묵시적으로 형변환 (생략 가능)
	
	// DOWN casting
	// -부모를 자식클래스의 타입으로 형변환
	// -명시적으로 형변환 (생략 불가능)
	// -상속받지 않은 메소드도 사용가능해 존재하지 않은 영역 참조의 위험이 있음

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent("Kim");
		p.printName();
		
		Child c = new Child("Lee",10);
		c.PrintName();
		
		System.out.println("======Up Casting======");
		p = new Child("Park", 20);
		p.printName();
		//p.printChild();
		//Child는 상속시켜준 메소드가 아니므로 자식타입으로 사용불가

		System.out.println("======Down Casting======");
		c = (Child) new Parent("Han");
		//강제 형변환은 가능하지만 오류가 발생함
		c.PrintName();
		
	}//END main()

}//END class
