package com.iu.member;

import java.util.Scanner;

public class MemberInput {

	private Scanner sc;
	
	public MemberInput() {
		sc = new Scanner(System.in);
	}
	
	public String buy() {
		String number=null;
		System.out.println("1. 구매");
		System.out.println("2. 취소");
		int select = sc.nextInt();
		if(select == 1) {
			System.out.println("구매할 상품의 번호를 입력");
			number = sc.next();
		}
		
		return number;
	}
	
	public MemberDTO login() {
		MemberDTO memberDTO = new MemberDTO();
		System.out.println("Id 입력");
		memberDTO.setMemberID(sc.next());
		System.out.println("Pw 입력");
		memberDTO.setMemberPW(sc.next());
		return memberDTO;
	}
	
	
	public MemberDTO insert() {
		MemberDTO memberDTO = new MemberDTO();
		System.out.println("ID를 입력");
		memberDTO.setMemberID(sc.next());
		System.out.println("PW 입력");
		memberDTO.setMemberPW(sc.next());
		System.out.println("이름 입력");
		memberDTO.setMemberName(sc.next());
		System.out.println("전화번호 입력");
		memberDTO.setMemberPhone(sc.next());
		System.out.println("이메일 입력");
		memberDTO.setMemberEmail(sc.next());
		return memberDTO;
	}
	
}