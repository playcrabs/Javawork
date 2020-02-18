package com.iu.t1;
import java.util.*;

public class ForTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0~59초 출력, 입력한 초와 일치하면 그 즉시 종료
		Scanner scanner = new Scanner(System.in);
		System.out.print("0~59 사이의 초를 입력:");
		int num = scanner.nextInt();
		for (int i = 0; i < 60; i++) {
			System.out.println(i+"초");
			if (i==num) {
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}
