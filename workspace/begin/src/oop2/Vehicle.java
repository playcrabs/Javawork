package oop2;

//탈 것과 관련 공통의 속성과 기능을 갖는 클래스
//공통 속성과 기능 2가지
//Bus, Train 클래스 생성하고 각각 속성,기능 한개씩 더
public class Vehicle {
	//속성1,2
	String name;
	int fuel;
	//기능1,2
	public void start() {
		if (fuel>0) {
			System.out.println(name + "이(가) 출발합니다.");
		} else {
			System.out.println(name + "의 연료가 부족합니다.");
			System.out.println("남은 연료의 양:"+ fuel);
		}
	}
	public void stop() {
		if (fuel<0) {
			System.out.println(name + "이(가) 정지합니다.");
		} else {
			System.out.println("다음 정거장으로 갑니다.");
			System.out.println("남은 연료의 양:"+ fuel);
		}
	}
	
	//Vihicle의 기본 생성자
	Vehicle() {
		System.out.println("Vehicle의 기본 생성자");
	}
	
}

class Bus extends Vehicle{
	String color;
	
	//안보이지만
	//Boat(){} 가 있음, 생성자가 없을 때
	
	public void Color() {
		System.out.println("버스의 색은 " +color+ "입니다.");
	}
	
	Bus (){
		//suprt(); 묵시적으로 포함되는 코드, 쓰나 안쓰나 상관X
		System.out.println("버스의 기본 생성자");
	}
	
	//객체를 문자열로 반환하는 부모 클래스의 메소드 오버라이딩
	//반환문자열의 형태 - name:---, fuel:---, color:---
	public String toString() {
		return "name:"+name+" fuel:"+fuel+" color:"+color ;
	}
	
}

class Train extends Vehicle{
	//super(); 여기도 있음 -> 생성자의 첫 줄에 삽입해야함~~
	int num;
	Door door;	//한개일 경우
	Door[] doors; //여러개일 경우
	
	String name;
	
	public void Number() {
		System.out.println("이 지하철은 " +num+ "호선 입니다.");
		fuel -= 100;
	}
	
	public Train(String name, int num, int fuel, Door[] doors) {
		super.name=name;	//부모
		this.name=name;		//자신
		this.num=num;
		this.fuel=fuel;
		this.doors=doors;
		
		System.out.println("-----생 성-----");
		System.out.println("종류:"+name);
		System.out.println("연료량:"+fuel);
		System.out.println("문 갯수:"+doors.length);
		System.out.println("-------------");
	}
}

class Door {
	String material;
	int width, height;
	
	public Door(String material, int width, int height) {
		super();
		this.material = material;
		this.width = width;
		this.height = height;
	}
	
	
}







