package com.iu.bankbook;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

public class BankBookService {
	
	private BankBookDAO bankBookDAO;
	
	public BankBookService() {
		bankBookDAO = new BankBookDAO();
	}
	
	public int update(BankBookDTO bankBookDTO) {
		int result=0;
		try {
			result = bankBookDAO.update(bankBookDTO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
				
	}
	
	public ArrayList<BankBookDTO> selectList(){
		ArrayList<BankBookDTO> ar = null;
		
		try {
			ar = bankBookDAO.selectList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ar;
	}
	
	public int insert(BankBookDTO bankBookDTO) {
		//BankBook insert
		//1. 현재시간을 밀리세컨즈로 변환
		//2. DB 시퀀스 번호를 받아오기
		//3. Java에서 제공하는 API 
		int result=0;
		try {
			long num = bankBookDAO.seqSelect();
			System.out.println("Sequence : "+num);
			//bankBookDTO.setBookNumber(num+"");
			bankBookDTO.setBookNumber(String.valueOf(num));
			result = bankBookDAO.insert(bankBookDTO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//this.useTime();
		//this.useAPI();
		return result;
	}
	
	private void useAPI() {
		String name = UUID.randomUUID().toString();
		System.out.println("Name : "+name);
	}
	
	private void useTime() {
		Calendar ca = Calendar.getInstance();
		long l = ca.getTimeInMillis();
		System.out.println("Serial : "+l);
	}
	

}