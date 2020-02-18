package basic;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner scan; //Scanner 타입의 변수 scan 생성

		//scan = java.util.Scanner(arg0)
		scan = new Scanner(System.in); //scan 객체 생성
		
		System.out.print("문자열 입력:");
		String input1 = scan.nextLine();	//키보드에서 입력받아 저장
		System.out.println("입력 데이터: "+ input1);
		
		System.out.print("정수 입력:");
		int input2 = scan.nextInt();
		System.out.println("입력 데이터: "+ input2);
		
		System.out.print("문자열 입력:");
		double input3 = scan.nextDouble();
		System.out.println("입력 데이터: "+ input3);
		
		//키보드로부터 입력받은 문자열을 input에 저장
		System.out.print("문자열 입력:");
		int input = Integer.parseInt(scan.nextLine());
		System.out.println("입력 숫자:" + input);
				
		scan.close(); //키보드 연결 종료
		}

}
