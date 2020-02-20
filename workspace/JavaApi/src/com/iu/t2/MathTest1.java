package com.iu.t2;

public class MathTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = Math.random();//
		System.out.println(d);//0.0~100.0미만
		double dd = (Math.random()*99+1);
		int result = (int)dd;
		System.out.println(result);
		
		//floor() - 버림
		System.out.println(Math.floor(10.3));
		//ceil() - 올림
		System.out.println(Math.ceil(10.3));
		//round() - 반올림
		System.out.println(Math.round(1));
		
		//
		
	}

}
