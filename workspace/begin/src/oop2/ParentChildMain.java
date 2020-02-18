package oop2;

public class ParentChildMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// p,c 인스턴스 생성
		//Parent p=new Parent(); ->Parent에 생성자 생기면 에러남
		Parent p=new Parent("Kim");
		Child c= new Child("Lee",20);	
		
		p.printName();
		c.printName();
		c.printChild();
		c.PrintName();
	}

}
