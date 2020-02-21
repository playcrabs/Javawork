package com.iu.cafe;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Barista {
	
	public Coffee makeCoffee() {
		System.out.println("커피제작~");
		Coffee coffee = new Coffee();
		coffee.price=100;
		return coffee;
	}
	
	//오버로딩
	public ArrayList<Coffee> makeCoffee2(int count) {
		ArrayList<Coffee> ar = new ArrayList<Coffee>();
		for (int i = 0; i < count ; i++) {
		Coffee coffee = new Coffee();
		ar.add(coffee);
		}
		
		return ar;
	}
	
	//오버라이딩
	public ArrayList<Coffee> makeCoffee(ArrayList<Coffee> ar) {
		Coffee coffee = new Coffee();
		ar.add(coffee);
		return ar;
	}

}
