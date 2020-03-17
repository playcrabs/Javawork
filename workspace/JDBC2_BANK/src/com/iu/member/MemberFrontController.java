package com.iu.member;

import java.util.Scanner;

import com.iu.bankMain.bankCommonView;

public class MemberFrontController {
	
	private Scanner sc;
	private MemberInput memberInput;
	private MemberService memberService;
	private bankCommonView bankCommonView;
	private MemberSubController memberSubController;
	
	//-------------------- 멤버 변수 선언
	
	public MemberFrontController() {
		sc = new Scanner(System.in);
		memberInput = new MemberInput();
		memberService = new MemberService();
		bankCommonView = new bankCommonView();
		memberSubController = new MemberSubController();
	}
	
	//---------------------- 생성자를 이용 멤버변수 초기화
	
	public void start() {
		boolean check=true;
		MemberDTO memberDTO = null;
		String message=null;
		
		while(check) {
			
			if(MemberSession.getSession("member") != null) {
				
				memberSubController.subStart();
				
			}else {
			
			System.out.println("1. 로 그 인 ");
			System.out.println("2. 회원가입");
			System.out.println("3. 종      료");
			
			int select = sc.nextInt();
			
			switch (select) {
			case 1:
				memberDTO = memberInput.login();
				memberDTO = memberService.login(memberDTO);
				message ="로그인 실패";
				if(memberDTO != null) {
					message = "로그인 성공";
					MemberSession.setSession("member", memberDTO);
				}
				bankCommonView.view(message);
				break;
			case 2:
				memberDTO = memberInput.insert();
				select = memberService.insert(memberDTO);
				message="회원 가입 실패";
				if(select>0) {
					message = "회원 가입 성공";
				}
				
				bankCommonView.view(message);
				
				break;

			default:
				check = false;
				break;
			}
				
			
			}
		
		}
	}

}
