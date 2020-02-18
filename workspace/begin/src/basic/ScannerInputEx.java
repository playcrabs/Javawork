package basic;

import java.util.Scanner;

public class ScannerInputEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-----이자 계산기-----");
		System.out.printf("고객명 : ");
		String name = scan.nextLine();
		System.out.printf("원금 : ");
		int money = scan.nextInt();
		System.out.printf("이율 : ");
		double plus = scan.nextDouble();
		System.out.println("------------------");
		
		System.out.println(name +"님의 원금 "+ money +"원의 이자는 "+ 
						  (plus * money)+"원 입니다.");
		System.out.printf("%s 님의 원금 %,d의 이자는 %,.0f 입니다.\n"
						  ,name		,money		,plus*money);
		System.out.println("(이율 "+ (plus * 100)+"% 적용)");
		System.out.printf("(이율 %.0f%% 적용)" ,plus*100);
		
		scan.close();
	}

}