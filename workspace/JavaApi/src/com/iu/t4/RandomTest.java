package com.iu.t4;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		
		//1부터 45사이의 랜덤로또 번호
		//중복 안나오게하기
		Random random = new Random();
		int [] num = new int [6];
		for (int i = 0; i < 6; i++) {
			num[i]=random.nextInt(45)+1;
			for (int j = 0; j < i; j++) {
				if (num[i]==num[j]) {
					--i;
				}
			}
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(i+"번째 값:"+num[i]);
		}
		
	}

}
