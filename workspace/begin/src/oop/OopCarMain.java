package oop;

public class OopCarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Car 클래스의  color 변수의 값 출력
		// Car클래스의 참조변수, 객체, 인스턴스 car생성
		Car car = new Car();
		System.out.println(car.color);
		// car를 이용하여 color변수에 액세스
		car.color = "red";
		System.out.println(car.color);
		
		// Car 클래스의 객체 blue 선언
		// blue 생성
		// color를 BLUE로 저장
		Car blue;
		blue=new Car();
		blue.color = "BLUE";
		
		// Car 클래스의 객체 green 선언
		// green 생성
		// color를 GREEN로 저장
		Car green;
		green=new Car();
		green.color = "GREEN";

		//blue의 color를 출력
		//green의 color를 출력
		System.out.println(blue.color);
		System.out.println(green.color);
		
		// blue의 color를 파랑으로 변경
		blue.color = "파랑";
		
		
		// blue의 start() 호출
		// green의 start() 호출
		blue.start();
		green.start();
		
		//클래스명 참조변수명; >>객체를 다루기 위한 참조변수 선언
		//Tv t;
		//참조변수명 = new 클래스명(); >>객체생성 후, 생성된 객체의
		//							주소를 참조변수에 저장
		//t = new Tv();
	}

}
