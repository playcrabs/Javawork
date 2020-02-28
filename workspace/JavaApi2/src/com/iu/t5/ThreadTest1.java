package com.iu.t5;

public class ThreadTest1 {

	public static void main(String[] args) {
		//Thread 클래스 상속
//		ThreadEx1 ex1 = new ThreadEx1();
//		ThreadEx2 ex2 = new ThreadEx2();
//		ex1.start();
//		ex2.start();	
		ThreadEx3 ex3 = new ThreadEx3();
		ThreadEx4 ex4 = new ThreadEx4();
		

		//Runnable 인터페이스 구현
		Thread t1 = new Thread(ex3);
		Thread t2 = new Thread(ex4);
		t1.start();
		t2.start();
	}

}
