package com.iu.t1;
import java.util.*;

public class FotTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//분과 초를 입력할때, 0분 0초부터 59분 59초를 출력
		//입력한 분과 초가 맞으면 프로그램 종료
		Scanner scanner = new Scanner(System.in);
		System.out.print("분을 입력:");
		int min = scanner.nextInt();
		System.out.print("초를 입력:");
		int sec = scanner.nextInt();
		//int check = 0; >>0이면 break X, 1이면 break O, Boolean타입
		
		time:
		for (int i = 0; i < 60; i++) {
			for (int j = 0; j < 60; j++) {
				System.out.println(i+"분"+j+"초");
				if (i==min && j==sec) {
					System.out.println("종료합니다.");
					//i=60;
					//check=1;
					break time;
				}
			}
			//if(check==1){
			//break;}
		}
	}
}
