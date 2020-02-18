package oop;

public class CallByValueRef {
	String value;
	static String ref;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RedCar redCar = new RedCar();		// RedCar클래스의 객체 redCar 생성
		System.out.println(redCar.door);	// redCar의 color 속성의 값을 화면에 출력
		System.out.println("----------");
		System.out.println(redCar.door);
	
		//redCar의 color속성의 값을 매개변수로 전달하여  changeDoor() 호출
		CallByValueRef c =new CallByValueRef();
		c.changeDoor(redCar.door);	//call by value
		System.out.println(redCar.door);
		
		System.out.println("----------");
		System.out.println(redCar.color);
		changeColor(redCar);		//call by reference -changeColor() 호출	
		System.out.println(redCar.color);

		
	}//END main();
	
	
	//static/클래스/공유 메소드
	//RedCar클래스의 객체를 매개변수로 전달받는 클래스 메소드 changeColor() 작성
	//	   클래스메소드				      매개변수자리
	public static void changeColor(RedCar r) {
		//value = "v";
		ref = "r";
		System.out.println("차의 색:"+r.color);
		r.color= "빨강";
		System.out.println("색상 변경됨");
	}
	
	//문의 갯수를 매개변수로 받아서 화면에 출력하는  메소드 changeDoor() 작성
	//인스턴스 메소드
	//원본에는 영향을 미치지 않는다
	public void changeDoor(int door) {
		value = "v";
		ref = "r";
		
		System.out.println("문의 갯수:"+door);
		door = 2;
		System.out.println("문의 갯수 변경됨");
	}
	

}
