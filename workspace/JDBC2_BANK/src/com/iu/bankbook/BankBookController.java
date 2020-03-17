package com.iu.bankbook;

import java.util.ArrayList;
import java.util.Scanner;

import com.iu.bankMain.bankCommonView;

public class BankBookController {
	
	private Scanner sc;
	private BankBookService bankBookService;
	private BankView bankView;
	private BankBookInput bankBookInput;
	private bankCommonView bankCommonView;
	
	public BankBookController() {
		sc = new Scanner(System.in);
		bankBookService = new BankBookService();
		bankView = new BankView(); 
		bankBookInput = new BankBookInput();
		bankCommonView = new bankCommonView();
	}
	
	public void start() {
		BankBookDTO bankBookDTO= null;
		String message=null;
		boolean check = true;
		
		while(check) {
			System.out.println("1. 상품 정보 리스트");
			System.out.println("2. 상품 정보 추가");
			System.out.println("3. 상품 판매 결정");
			System.out.println("4. 상품 관리 종료");
			int select = sc.nextInt();
			
			switch (select) {
			case 1:
				ArrayList<BankBookDTO> ar = bankBookService.selectList();
				bankView.view(ar);
				break;
			case 2:
				bankBookDTO = bankBookInput.insert();
				select = bankBookService.insert(bankBookDTO);
				message = "상품정보 추가 실패";
				if(select > 0) {
					message = "상품정보 추가 성공";
				}
				bankCommonView.view(message);
				break;
			case 3:
				bankBookDTO = bankBookInput.update();
				select= bankBookService.update(bankBookDTO);
				message ="상품정보 수정 실패";
				if(select>0) {
					message = "상품정보 수정 성공";
				}
				bankCommonView.view(message);
				break;

			default:
				check= false;
				break;
			}
		}
		
		
	}

}