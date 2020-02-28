package com.iu.t5;

public class ThreadEx3 implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 25; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
