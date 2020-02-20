package com.iu.t3;

import java.util.Scanner;

public class WrapperTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열을 숫자로 바꿔주는 메소드 
		// Integer.parseInt("10");
		// Double.parseDouble("10.21");
		// 주민번호를 입력받음 ex.991225-1234557
		// 나이:
		// 계절: ex(3~5/6~8/9~11/12~12)
		
		Scanner scan = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요:");
        String num = scan.next();
        
        //나이는..0~3자리
        String age = num.substring(0, 2);
        String mf = num.substring(7,8);
        
        char ch = num.charAt(7);
        int numCh =Integer.parseInt(String.valueOf(ch));
        
        int age2 = Integer.parseInt(age);
        int mf2 = Integer.parseInt(mf);
        if (mf2==1 || mf2==2) {
			age2 = 2020-(age2+1900);
		}
        if (mf2 == 3 || mf2 == 4) {
        	age2 = 20-age2;
		}
        System.out.print("나이:"+age2);
        System.out.println();
        
        //계절은..3~6자리
        String season3 = null;
        String season = num.substring(2, 4);
        int season2 = Integer.parseInt(season);
        if ( season2 >= 3 && season2 <= 5) {season3="봄";}
        if ( season2 >= 6 && season2 <= 8) {season3="여름";}
        if ( season2 >= 9 && season2 <= 11) {season3="가을";}
        if ( season2 >= 1 && season2 <= 2 || season2 == 12) {season3="겨울";}
        System.out.print("계절:"+season3);
	}

}
