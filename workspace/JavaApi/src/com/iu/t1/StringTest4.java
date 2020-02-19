package com.iu.t1;

public class StringTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "kim,23,lee_24_park,25";
		//참조변수명.메소드명
		data = data.replace('_' , ',');	//데이터를 바꿔줌
		String [] strs=data.split(",");	//나눠서 출력
		for (String s :strs) {
			System.out.println(s);
		}
		data.isEmpty();
	}

}
