package oop;

public class VariableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variable 클래스의 name값을 출력
		Variable v= new Variable();
		System.out.println("count:"+v.count);
		System.out.println("name:"+v.name);
		// Variable 클래스의 type값을 출력
		System.out.println("type:"+Variable.type); //클래스명.이름
		System.out.println("flag:"+Variable.flag);
		
		v.name="kim";
		Variable.type="A";
		
		// v를 이용하여 Variable 클래스의 printVar()호출
		v.printVar();
		// static메소드이기 때문에 클래스명으로 접근
		Variable.printStatic();

	}

}
