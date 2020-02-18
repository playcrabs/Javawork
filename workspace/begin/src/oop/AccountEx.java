package oop;

import java.awt.print.Printable;

public class AccountEx {

	public static void main(String[] args) {
	//Account 클래스의 인스턴스 account1 생성
	//account1의 계좌번호는 11112222저장
	//account1의 예금주를 Lee로 초기화
	//account1의 잔고를 10000로 지정
	Account account1 = new Account();
	//account1의 계좌에 20000원을 입금하고 잔고 출력
	//System.out.println(account1);
	//account1의 계좌에 10000원을 출금하고 잔고출력
	account1.num=11112222;
	account1.user="Lee";
	account1.money=10000;
	
	System.out.println("=================계좌================");
	System.out.println("이름:"+account1.user);
	System.out.println("계좌:"+account1.num);	
	System.out.println("잔고:"+account1.money);	
	
	//계좌에 입금하고 잔고 출력
	account1.deposit(account1.num, account1.money);
	//계좌에 출금하고 잔고 출력1
	account1.withdraw(account1.num, account1.money);
	//계좌에 출금하고 잔고 출력2, 잔고부족
	account1.withdraw(account1.num, 30000);
	
	//Account클래스의 인스턴스 account2 생성
	//단, 계좌번호, 예금주, 초기입금액을 매개변수로 전달하여 처리
	Account account2 = new Account(33334444,"Kim",10000);	//매개변수로 전달해서 처리
	
	//매개변수를 받는 생성자, 기본생성자 
	//2계좌에 입금하고 잔고 출력
	account2.deposit(account2.num, account2.money);
	//2계좌에 출금하고 잔고 출력1
	account2.withdraw(account2.num, account2.money);
	//2계좌에 출금하고 잔고 출력2, 잔고부족
	account2.withdraw(account2.num, 30000);
	
	}//END main();

}//END Account class


	//계좌번호, 예금주, 잔고를 속성(멤버변수)으로 갖는  Account 클래스를 작성 
	class Account{
		int num;
		String user;
		int money;
		
		//기본생성자
		public Account() {
		}

		//..using Fields, 
		public Account(int num, String user, int money) {
			this.num = num;
			this.user = user;
			this.money = money;
			
			System.out.println("=================계좌================");
			System.out.println("이름:"+user);
			System.out.println("계좌:"+num);	
			System.out.println("잔고:"+money);
			
		}
		
		// Account 클래스의 기능 - 입금, 출금, 잔고조회
		public void deposit(int num, int money) {	//입금
			if (money>0) {
				System.out.println("=================================");
				System.out.printf("[입금]%,d원\t",money);
				this.money += money;
				printMoney();
			}
		}
		public int withdraw(int num, int money) {	//출금
			if (this.money >= money) {
				this.money -= money;
				System.out.println("=================================");
				System.out.printf("[잔고]%,d원\t",money);
				printMoney();
				return money;
			} else {
			System.out.println("==============부족=================");
			System.out.printf("[잔고]%,d원\t",money);
			printMoney();
			return 0;
			}
		}
		public void printMoney() {					//잔고
			System.out.println("[잔고]"+money);
		}
		
		public int info(int num2) {
			System.out.println();
			return num2;
		}
		

		
		
		
	}

