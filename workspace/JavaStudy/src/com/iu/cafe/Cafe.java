package com.iu.cafe;

import java.util.ArrayList;

public class Cafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수선언			//
		Coffee coffee1 = new Coffee();
		coffee1.price = 1000;
		
		Coffee coffe2 = new Coffee();
		coffe2.price = 500;
		
		Coffee coffee3 = null;
		
		coffee3 = coffee1;
		System.out.println(coffee3.price);
		
		coffee3.price=200;
		System.out.println(coffee1.price);
		
		//		참조변수
		Barista barista1 = new Barista();
		barista1 = new Barista();
		
		Coffee coffee = barista1.makeCoffee();
		System.out.println("price:"+coffee.price);
		
		for (int i = 0; i < 10; i++) {
			coffee = barista1.makeCoffee();
		}
		
		Coffee [] coffees = new Coffee[10];
		ArrayList<Coffee> co= new ArrayList<Coffee>();
		for (int i = 0; i < coffees.length; i++) {
			coffee = barista1.makeCoffee();
			coffees[i]=coffee;
			co.add(coffee);
		}
		
		co = barista1.makeCoffee2(10);
		
		co = barista1.makeCoffee(co);
		
		
	}

}

class CoffeeIn {
	
	int price;
	int shot;
	
}

