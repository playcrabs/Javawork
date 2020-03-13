package com.iu.bankMain;

import java.util.ArrayList;

import com.iu.bankbook.BankBookDAO;
import com.iu.bankbook.BankBookDTO;
import com.iu.bankbook.BankView;

public class bankMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BankBookDAO bankBookDAO = new BankBookDAO();
		BankBookDTO bankBookDTO = new BankBookDTO();
		BankView bankView = new BankView();
		
//		bankBookDTO.setBOOK_NUMBER("100");
//		bankBookDTO.setBOOK_NAME("자유적금");
//		bankBookDTO.setBOOK_CONTENTS("자유적금입니다");
//		bankBookDTO.setBOOK_RATE(10.0);
//		bankBookDTO.setBOOK_SALE(0);
//		bankBookDAO.insert(bankBookDTO);
//		
//		bankBookDTO.setBOOK_NUMBER("10");
//		bankBookDTO.setBOOK_SALE(1);
//		bankBookDAO.update(bankBookDTO);
		
		try {
			
			ArrayList<BankBookDTO> ar = bankBookDAO.selectList();
			bankView.view(ar);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
