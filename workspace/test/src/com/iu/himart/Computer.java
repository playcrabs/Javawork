package com.iu.himart;

public class Computer extends Product{
	String cpu;
	
	public Computer() {	//생성자
		
	}
	
	public Computer(String brand) {
		this.brand=brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

}
