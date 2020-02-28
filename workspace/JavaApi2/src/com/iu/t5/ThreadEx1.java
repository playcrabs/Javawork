package com.iu.t5;

public class ThreadEx1 extends Thread {

	@Override
	public void run() {
		// 동시에 실행하고 싶은 메소드 넣기
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
	
	//메소드의 선언부에 동기화
	public synchronized void test() {

	}
	
	//메소드 내에 특정 블록으로 동기화
	public void test2() {
		//synchronized() {}
	}

}
