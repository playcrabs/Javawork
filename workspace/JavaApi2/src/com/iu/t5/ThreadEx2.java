package com.iu.t5;

public class ThreadEx2 extends Thread{
	
	@Override
	public void run() {
		for (int i = 'a'; i < 'z'; i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void info() {
		for (int i = 'a'; i < 'z'; i++) {
			System.out.println((char)i);
		}
	}

}
