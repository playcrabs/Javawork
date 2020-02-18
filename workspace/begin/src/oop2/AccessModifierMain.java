package oop2;

public class AccessModifierMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accessModifier am = new accessModifier();
		System.out.println("---public---");
		System.out.println("name:"+am.name);
		am.name="AHN";
		System.out.println("name:"+am.name);
		
		System.out.println("---protected---");
		System.out.println("age:"+am.age);
		am.age=23;
		System.out.println("age:"+am.age);
		
		System.out.println("---	---");
		System.out.println("level:"+am.level);

		//am.num="1111111";
		//private는 외부 클래스에서 접근 할 수 없다
		System.out.println("---private---");
		am.setNum("010-1111-2222");
		System.out.println(am.getNum());
	}

}
