package oop2;

//final class Parent { -변경할 수 없는
//public class Parent {
public class Parent {
	String name;
	
	//멤버변수의 값을 매개변수로 넘겨받아 초기화하는 생성자 작성	
	//기본생성자를 찾지못해 에러가 남
	public Parent(String name) {
		this.name = name;
	}
	
	//멤버변수의 값을 화면으로 출력하는 printName() 작성
	//반환값과 매개변수는 없음
	//final public void printName() {
	//public void printName() {
	public void printName() {
		System.out.println("Parent Name:"+name);
	}

}
