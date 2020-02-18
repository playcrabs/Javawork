package basic;
import java.util.*;

public class ForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//구구단 출력
		for (int i = 2; i < 10; i++) {
			System.out.println("<"+i+"단>");
			for (int j = 2; j < 10; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
		System.out.println();
				
		//구구단 옆으로 출력1
		System.out.println("구구단 옆으로 출력1");
		for (int l = 2; l < 10; l++) {
			System.out.println(l+"단");
			for (int  j= 2;  j< 10; j++) {
				System.out.print( l+"*"+j+"="+(l*j) +" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//구구단 옆으로 출력2
		System.out.println("구구단 옆으로 출력2");
		for (int l = 2; l < 10; l++) {
			for (int  j= 2;  j< 10; j++) {
				System.out.print( j+"*"+l+"="+(l*j) +"  ");
			}
			System.out.println();
		}
		System.out.println();

		//구구단 입력받아 출력
		System.out.println("- - - 구 구 단 출 력 - - -");
		System.out.print("출력하실 단을 입력하세요:");
		int num = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(num+"x"+i+"="+(num*i));
		}

	}

}
