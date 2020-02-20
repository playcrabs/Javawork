package com.iu.t2;

public class WrapperTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.BYTES);
		System.out.println(Long.BYTES);
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer("20");
		
		int n1 = i1.intValue();	//4
		int n2 = i2.intValue();	//8
		
		System.out.println(n1+n2);	//30
		
		//primitive type >> reference type - auto Boxing
		i1 = 30;
		//primitive type << reference type - auto UnBoxing		
		n1 = i1;
		i1 = (int)3.12;
		
		int num3 = Integer.parseInt("30");
		System.out.println(num3*2);
		
	}

}
