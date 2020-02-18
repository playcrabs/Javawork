package oop;

public class TableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체, 인스턴스, 참조변수, 오브젝트 같은 말?
		
		//RedCar클래스 타입의 변수 red생성
		//Car 클래스의 레퍼런스 변수 car생성
		RedCar red = new RedCar();
		Car car = new Car();
		
		Table ti = new Table();	//책상의 인스턴스 생성
		Table to = new Table();	//책상의 객체 생성
	
		
		Table tr;		//책상의 참조변수 선언
		Table tableObj;	//책상의 오브젝트 선언
		
		tr = new Table();		//책상의 참조변수 생성
		tableObj = new Table();	//책상의 오브젝트 생성
		
		//red는 RedCar클래스의 인스턴스인가? -true
		System.out.println(red instanceof RedCar);
		System.out.println(red instanceof Object);
//		System.out.println(red instanceof Car);
		
		
		
	}

}
