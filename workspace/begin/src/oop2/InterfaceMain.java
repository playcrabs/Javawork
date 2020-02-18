package oop2;

public class InterfaceMain {

	public static void main(String[] args) {
		InterfaceA ia = new ClassA();
		ia.method();
		//ia.metodd();
		
		//classA의 인스턴스 ca 생성하여 method(), methodd()호출
		ClassA ca = new ClassA();
		ca.method();
		ca.methodd();
		ca.classAmethod();
		
		//System.out.println(InterfaceB.methodBBB());
		InterfaceB.methodBBB();

	}

}
