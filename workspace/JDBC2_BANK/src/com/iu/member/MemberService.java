package com.iu.member;

public class MemberService {
	
	private MemberDAO memberDAO;
	
	public MemberService() {
		memberDAO = new MemberDAO();
	}
	
	
	public MemberDTO login(MemberDTO memberDTO) {
		try {
			memberDTO = memberDAO.login(memberDTO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return memberDTO;
	}
	
	public int insert(MemberDTO memberDTO) {
		int result=0;
		
		try {
			result = memberDAO.insert(memberDTO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
				
	}
	

}
