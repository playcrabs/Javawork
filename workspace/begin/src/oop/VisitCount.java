package oop;

public class VisitCount {
	static int count;	//클래스 |static| 공유멤버변수
	
	//객체가 생성될 때마다 생성된 객체의 갯수를 1씩 증가시키고 출력하는
	//기본 생성자 작성
	//출력 형태 - 현재 생성된 객체의 수: ~~~
	VisitCount() {
		count++;		
		System.out.println("현재 생성된 객체의 수:"+count);
	}
	
}
