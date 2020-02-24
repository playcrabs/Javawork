package com.iu.t1;

public class ExceptionTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionTest3 et = new ExceptionTest3();
		int [] ar = {1};
		
		try {
			System.out.println("실행!");
			et.test(ar);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			et.test2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
