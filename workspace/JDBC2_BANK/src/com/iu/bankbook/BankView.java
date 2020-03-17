package com.iu.bankbook;

import java.util.ArrayList;

public class BankView {
	
	public void view(ArrayList<BankBookDTO> ar) {
		for(BankBookDTO bankBookDTO: ar) {
			System.out.println("NUMBER   : "+bankBookDTO.getBookNumber());
			System.out.println("Name     : "+bankBookDTO.getBookName());
			System.out.println("Contents : "+bankBookDTO.getBookContents());
			System.out.println("Rate     : "+bankBookDTO.getBookRate()+"%");
			if(bankBookDTO.getBookSale()==0) {
				System.out.println("판매중");
			}else {
				System.out.println("현재는 판매 중지 상품입니다");
			}
			System.out.println("------------------------------");
		}
	}

}
