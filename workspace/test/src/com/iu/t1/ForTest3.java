package com.iu.t1;
import java.util.*;

public class ForTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id =1234;
		int pw =5678;
		String result = null;
		
		//id, pw 입력 로그인 시도 최대 3번
		//반복문으로 최대 3번까지 돌리기
		//반복문 종료 후, 로그인 성공/은행 방문을 요함
		Scanner scanner = new Scanner(System.in);
		int input_id = 0;
		int input_pw = 0;
		
		System.out.println("<<로그인>>");
		for (int i = 0; i < 3; i++) {
			System.out.print("ID:");
			input_id = scanner.nextInt();
			System.out.print("PW:");
			input_pw = scanner.nextInt();
			if (id == input_id && pw == input_pw) {
				result="로그인 성공";
				break;
			}
			System.out.println("틀렸습니다. 다시 입력해 주세요");
		}
		
		System.out.println(result);
//		if (id != input_id || pw != input_pw) {
//			System.out.println("은행 방문을 요함");
//		}else {
//			System.out.println("로그인 성공");
//			}
	}

}
