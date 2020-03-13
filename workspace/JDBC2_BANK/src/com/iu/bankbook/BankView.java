package com.iu.bankbook;

import java.util.ArrayList;

public class BankView {
	public void view(ArrayList<BankBookDTO> ar) {
		for(BankBookDTO bankBookDTO : ar) {
			System.out.println("NUMBER	:"+bankBookDTO.getBOOK_NUMBER());
			System.out.println("NAME	:"+bankBookDTO.getBOOK_NAME());
			System.out.println("CONTENTS:"+bankBookDTO.getBOOK_CONTENTS());
			System.out.println("RATE	:"+bankBookDTO.getBOOK_RATE()+"%");
			if (bankBookDTO.getBOOK_SALE() == 1) {
				System.out.println("SALE	:현재 판매중인 상품입니다.");
			}else {
				System.out.println("SALE	:현재 판매중인 상품이 아닙니다.");
			}
			System.out.println("------------------------------");
			
		}
	}

}
