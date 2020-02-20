package com.iu.t1;

public class CardMain {

	public static void main(String[] args) {
		// 클래스메소드, 클래스변수 사용법
		// 클래스명.변수명
		// 클래스명.메소드명()
		
		Card c1 = new Card();
		c1.kind="spade";
		c1.color="black";
		c1.num=1;
		System.out.println(c1.width);

		Card c2 = new Card();
		c2.kind="spade";
		c2.color="black";
		c2.num=2;
		System.out.println(c2.width);
		
		//숫자2 >> 문자열2
		String s =String.valueOf(2);
	}

}
