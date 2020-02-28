package com.iu.t5;

public class ThreadEx4 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 'A'; i < 'Z'; i++) {
			System.out.println((char) i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
