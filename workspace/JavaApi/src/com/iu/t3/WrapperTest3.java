package com.iu.t3;

import java.util.Scanner;

public class WrapperTest3 {

	public static void main(String[] args) {
		//주민등록번호 검증
		//971117-2222222
		//234567 892345  를 각자리에 곱한다
		//마지막자리는 검증용 번호
		//나온숫자들을 전부 더한 결과를 (285) 11로 나눠서 나머지를 구함(10)
		//11에서 나머지 값을 뺀 결과(1)가 같으면 정상, 아니면 틀림 
		//결과값이 두자리 이상이면, 다시 10으로 나눈 나머지를 검증용 번호와 비교
		
		Scanner scan = new Scanner(System.in);
		System.out.print("주민번호를 입력해주세요:");
        String jumin = scan.next();
		String [] ar = jumin.split("-");
		int k =0;	//ar[]누적
		int j =2;	//ar[0]곱셈값
		int h =8;	//ar[1]곱셈값
		
		//ar[0]
		for (int i = 0; i < ar[0].length(); i++) {
			k = k + Integer.parseInt(ar[0].charAt(i)+"") * j;
			j++;
		}
		
		//ar[1]
		for (int i = 0; i < ar[1].length()-1; i++) {
			k = k + Integer.parseInt(ar[1].charAt(i)+"") * h;
			//valueOf 매개변수로 char 넣으면  String
			if (h==9) {
				h=2;
			} else
			h++;
		}
		
		System.out.println("합:"+k);
		System.out.println("나머지:"+k%11);
		
		int jj=k%11;
		if ( 11 - jj >= 10 ) {
			System.out.println("검증번호:" + k%10);
		} else {
			System.out.println("검증번호:" + ( 11- (k%11)) );
		}

	}

}
