package com.iu.t1;
import java.util.*;

public class ForTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// 연산자만 이용하는 문제
		// 계산식을 만들기
		System.out.print("숫자 입력:");
		int num = scanner.nextInt();
		
		// n >> n
		// 0 >> 0
		// 1 >> 1
		// 2 >> 2
		// 3 >> 3
		// 4 >> 10
		// 6 >> 12
		// 7 >> 13
		// 9 >> 21
		
		int result = 0;
		
		result = ((num/4)*10) + num%4;
		//result = (num+6)*(num/4);
		System.out.println("답은 "+result);
	}

}
