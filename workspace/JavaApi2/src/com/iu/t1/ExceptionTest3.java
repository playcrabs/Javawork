package com.iu.t1;

import java.util.Scanner;

public class ExceptionTest3{
		//예외객체 발생시 throws 다음 타입
		public void test(int [] ar) throws Exception {
			System.out.println(ar[1]);
		}
		
		public void test2() throws MyException {
			Scanner scan = new Scanner(System.in);
			System.out.print("숫자를 입력:");
			int num = scan.nextInt();
			
			int num2 = 10;
			int result = num2 - num;
			
			if (result < 0) {
				throw new MyException("음수는 안됩니다.");
			}
			
			System.out.println(result);
		}

}
