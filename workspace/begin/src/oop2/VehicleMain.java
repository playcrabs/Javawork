package oop2;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Vehicle클래스의 자식 클래스 객체 2개를 생성해
		// 각각의 속성 변경 또는 기능들을 호출
		Bus b = new Bus();
		b.name="버스";
		b.color="초록";
		b.fuel=100;
		
		b.start();
		b.Color();
		b.stop();
		
		System.out.println("=================");
		//첫번째 객체는 기본 생성자를 이용하여 각각의 속성을 변경 -account1
		//두번째 객체는 멤버 변수들을 초기화 하는 생성자를 이용 -accout2
		Door frontDoor = new Door("유리", 100, 200);
		Door backDoor = new Door("유리", 300, 400);	
		Door[] doors = {frontDoor,backDoor};
		
		Train t = new Train("지하철",1,10,doors);

		t.start();
		t.Number();
		t.stop();

		System.out.println();
		System.out.println(b);
		System.out.println(t);
		
	}

}
