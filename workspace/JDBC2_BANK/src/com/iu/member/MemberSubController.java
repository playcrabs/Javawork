package com.iu.member;

import java.util.ArrayList;
import java.util.Scanner;

import com.iu.account.AccountDTO;
import com.iu.account.AccountService;
import com.iu.account.AccountView;
import com.iu.bankMain.bankCommonView;
import com.iu.bankbook.BankBookDTO;
import com.iu.bankbook.BankBookService;
import com.iu.bankbook.BankView;

import oracle.net.ns.Message;

public class MemberSubController {

	private Scanner sc;
	private BankBookService bankBookService;
	private BankView bankView;
	private MemberInput memberInput;
	private AccountDTO accountDTO;
	private AccountService accountService;
	private bankCommonView bankCommonView;
	private AccountView accountView;

	public MemberSubController() {
		sc = new Scanner(System.in);
		bankBookService = new BankBookService();
		bankView = new BankView();
		memberInput = new MemberInput();
		accountDTO = new AccountDTO();
		accountService = new AccountService();
		bankCommonView = new bankCommonView();
		accountView = new AccountView();
	}

	public void subStart() {
		MemberDTO memberDTO = (MemberDTO) MemberSession.getSession("member");
		System.out.println(memberDTO.getMemberID() + " 님 환영합니다");

		boolean check = true;

		while (check) {
			System.out.println("1. 상품 리스트");
			System.out.println("2. 나의 계좌 정보");
			System.out.println("3. 로그아웃");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				ArrayList<BankBookDTO> ar = bankBookService.selectList();
				bankView.view(ar);
				String number = memberInput.buy();
				if (number != null) {
					System.out.println("Buy : " + number);
					AccountDTO accountDTO = new AccountDTO();
					accountDTO.setBookNumber(number);
					accountDTO.setMemberID(memberDTO.getMemberID());
					select = accountService.insert(accountDTO);
					String message = "계좌개설실패";
					if (select > 0) {
						message = "계좌개설성공";
					}
					bankCommonView.view(message);
				}
				break;
			case 2:
				ArrayList<AccountDTO> ar1 = accountService.selectList(memberDTO.getMemberID());
				accountView.view(ar1);
				break;
			default:
				check = false;
				MemberSession.remove("member");
				break;
			}
		}

	}

}
