package basic;
import java.util.*;

public class OperatorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//1. 0에서 100사이의 임의의 정수를 하나 입력받아
		//	 3의 배수이면 "3의 배수: 0"
		//	  그렇지 않으면  "3의 배수: X" 출력
		//	 0에서 100사이만 받음 0
		System.out.println("----- 3의 배수 알아보기 ------");
		System.out.print("0에서 100사이의 수를 하나 입력: ");
		int i = sc.nextInt();
		boolean result = i > -1 && i < 101;
		String s =  ( (result == true) && (( i % 3 ) == 0) )  ?  "3의 배수 입니다." : "3의 배수가 아닙니다.";
		System.out.println(s);
		System.out.println();
		
		//2. 윤년 계산하기
		//	 연도를 입력받아 4로 나누어 떨어지고,
		//	 100으로 나누어 떨어지지않으면 윤년
		//	  단, 400으로 나누어지는 경우에는 윤년
		System.out.println("-----윤년 알아보기-----");
		System.out.print("연도를 입력: ");
		int ii = sc.nextInt();
		String ss = ( ( ((ii%100) != 0) && ((ii%4)==0) ) || (ii % 400) == 0) ? "윤년" : "윤년아님";
		System.out.println(ii + "년은 " + ss );
		System.out.println();
		
		//3.출금 요청 처리 - 출금액을 입력받아 동전으로 지급하기
		//	단, 10원 미만은 반올림
		//	ex) 출금액: 7777원
		//		500원 짜리: ~개
		//		100원 짜리: ~개
		//		50원 짜리: ~개 
		//		10원 짜리: ~개 
		System.out.println("-----출금 요청 처리-----");
		System.out.print("금액을 입력: ");
		int money = sc.nextInt();
		System.out.println("500원 짜리: " + money/500 + "개");
		int money1 = money%500;
		System.out.println("100원 짜리: "  + money1/100 +  "개");
		int money2 = money1%100;
		System.out.println("50원 짜리: " + money2/50 + "개");
		int money3 = (money2%50);
		System.out.println("10원 짜리: " + Math.round(money3/10.0) + "개");
		
		sc.close();
			
	}

}
