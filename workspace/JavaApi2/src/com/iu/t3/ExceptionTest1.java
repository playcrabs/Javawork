package com.iu.t3;

import java.util.ArrayList;

public class ExceptionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = null;
//		int age = Integer.parseInt(a);
		
		Car car = new Car();
		//CarInfo ci = new CarInfo();
		
		System.out.println(car);
		//System.out.println(ci);
		//car.getEngine().getFuel();
		
//		ArrayList<Car> cars = new ArrayList<Car>();
//		cars.get(0).getEngine();
		
		Car [] cars = new Car[3];
		cars[3].getEngine();
	}

}
