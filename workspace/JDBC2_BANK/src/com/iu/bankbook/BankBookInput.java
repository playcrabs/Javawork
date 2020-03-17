package com.iu.bankbook;

import java.util.Scanner;

public class BankBookInput {
	private Scanner sc;
	
	public BankBookInput() {
		sc = new Scanner(System.in);
	}
	
	public BankBookDTO update() {
		BankBookDTO bankBookDTO = new BankBookDTO();
		System.out.println("수정할 상품 번호 입력");
		bankBookDTO.setBookNumber(sc.next());
		System.out.println("0.판매  1.판매중지");
		bankBookDTO.setBookSale(sc.nextInt());
		return bankBookDTO;
	}
	
	public BankBookDTO insert() {
		BankBookDTO bankBookDTO = new BankBookDTO();
		System.out.println("상품명(통장이름) 입력");
		bankBookDTO.setBookName(sc.next());
		System.out.println("상품 설명 입력");
		bankBookDTO.setBookContents(sc.next());
		System.out.println("상품 이자율 입력");
		bankBookDTO.setBookRate(sc.nextDouble());
		bankBookDTO.setBookSale(0);
		return bankBookDTO;
	}

}
