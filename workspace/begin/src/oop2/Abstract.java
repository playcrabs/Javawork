package oop2;
import java.util.*;

public abstract class Abstract {
	//추상 클래스
	//abstracrt 메소드를 가지는 클래스도 abstract여야 함
	//일반메소드도 포함가능
	//필수는 아님(추상 메소드가 없어도 됨)
	//인스턴스 생성 불가, 상속을 받아서 구현해야 함
	//메소드의 실행 연월일을 출력하는 추상메소드  printDate() 작성
	//abstract로 선언된 메소드는 바디를 명시 할 수 없음
	public abstract void printDate();
	
	//메소드의 실행시간을 출력하는 printTime() 작성
	public void printTime() {
		Date now = new Date();
		System.out.println("실행시간:"+now.toLocaleString());
	}
	
}

class abstractSub extends Abstract{

	@Override
	public void printDate() {
		Date now = new Date();
		System.out.print(now.getYear()+1900+"년"+now.getMonth()+"월"+now.getDate()+"일");
	}
	
	
	
}