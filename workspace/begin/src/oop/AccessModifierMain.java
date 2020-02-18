package oop;

import oop2.accessModifier;

public class AccessModifierMain extends accessModifier{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accessModifier am = new accessModifier();
		AccessModifierMain amm = new AccessModifierMain();
		System.out.println("---public---");
		System.out.println("name:"+am.name);
		am.name="AHN";
		System.out.println("name:"+am.name);
		//
		
		System.out.println("---protected---");
		System.out.println("age:"+amm.age);
		amm.age=23;
		System.out.println("age:"+amm.age);
	}

}
