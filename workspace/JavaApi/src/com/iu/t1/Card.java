package com.iu.t1;

public class Card {
	
	public static int width;
	
	String kind;
	String color;
	int num;
	
	public void instanceMethod() {
		System.out.println(kind);
		System.out.println(Card.width);
		Card.classMethod();
		
	}
	public static void classMethod() {
		System.out.println(Card.width);
		//System.out.println(kind);
		//instanceMethod();
		
	}
	
	//생성자 생성
	public Card() {	}
	Card c3 = new Card();
	
	public Card(String kind) {
		this.color=color;
		this.kind=kind;
		this.num=num;
	}
	
	public Card(String kind, String colot, int num) {
		this.color=color;
		this.kind=kind;
		this.num=num;
	}
	
	
}
