package com.iu.t2;

public class StringBufferTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("samsung");
		//참조변수를 출력하면 내부에서 toString메소드가 호출
		System.out.println(sb);
		
		//delete
		StringBuffer sb2 = sb.delete(1, 3);
		System.out.println(sb2);
		System.out.println(sb);
		System.out.println(sb2.deleteCharAt(2));
		
		//insert
		sb.insert(1, "google");
		System.out.println(sb);
		
		//reverse
		sb = sb.reverse();
		System.out.println(sb.reverse());
		
	}

}
