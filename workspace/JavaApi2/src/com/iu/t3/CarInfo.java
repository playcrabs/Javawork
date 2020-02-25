package com.iu.t3;

public class CarInfo {

	public void info(Car car) {
		// TODO Auto-generated method stub
		System.out.println(car);
		
		Engine e = car.getEngine();
		e.getFuel();
		//System.out.println(e);
		// ↑두줄로 늘이면
		System.out.println(car.getEngine().getFuel());
		
	}

}
