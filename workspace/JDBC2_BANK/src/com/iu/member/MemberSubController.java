package com.iu.member;

import java.util.ArrayList;
import java.util.Scanner;

import com.iu.bankbook.BankBookDTO;
import com.iu.bankbook.BankBookService;
import com.iu.bankbook.BankView;

public class MemberSubController {
	
	private Scanner sc;
	private BankBookService bankBookService;
	private BankView bankView;
	private MemberInput memberInput;
	
	public MemberSubController() {
		sc = new Scanner(System.in);
		bankBookService = new BankBookService();
		bankView = new BankView();
		memberInput = new MemberInput();
	}
	
	public void subStart() {
		MemberDTO memberDTO = (MemberDTO)MemberSession.getSession("member");
		System.out.println(memberDTO.getMemberID()+ " 님 환영합니다");
		
		boolean check=true;
		
		while(check) {
			System.out.println("1. 상품 리스트");
			System.out.println("2. 로그아웃");
			int select = sc.nextInt();
			
			switch (select) {
			case 1:
				ArrayList<BankBookDTO> ar = bankBookService.selectList();
				bankView.view(ar);
				String number = memberInput.buy();
				if(number != null) {
					System.out.println("Buy : "+number);
				}
				break;

			default:
				check=false;
				MemberSession.remove("member");
				break;
			}
		}
		
	}
	
	

}

