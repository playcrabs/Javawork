package oop2;

public class Child extends Parent{
	int age;

	public Child(String name, int age) {
		super(name);
		this.age=age;
		// TODO Auto-generated constructor stub
	}
	
	//Child의 멤버변수의 값을 모두 출력하는 printChild() 작성
	public void printChild() {
		System.out.println("Child Name:"+name);
		System.out.println("Child Name:"+age);
	}
	
	//멤버변수 name의 값을 출력하는 printName()작성
	//반환값과 매개변수 없음
	//오버라이드
	public void PrintName() {
		System.out.println("=====오버라이드=====");
		System.out.println("Child name:"+age);
	}
}
