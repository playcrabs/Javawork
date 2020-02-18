package com.iu.t1;

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "";
		String name2 = "";
		String name3 = new String("");
		String name4 = new String("");

		System.out.println(name==name2);	//true
		System.out.println(name3==name4);	//false
		
		System.out.println(name3.equals(name4));	//true
		
		StringEx ex1 = new StringEx();
		ex1.name = "kim";
		StringEx ex2 = new StringEx();
		ex2.name = "kim";
		
		System.out.println(ex1.equals(ex2));	//false
	}

}
