package com.iu.salgrade;

import java.util.Scanner;

public class SalgradeInput {
	
	private Scanner scan;
	
	public SalgradeInput() {
		scan = new Scanner(System.in);
	}
	
	public SalgradeDTO insert() {
		SalgradeDTO salgradeDTO = new SalgradeDTO();
		
		System.out.print("추가할 GRADE:");
		salgradeDTO.setGrade(scan.nextInt());
		System.out.print("추가할 LOSAL:");
		salgradeDTO.setLosal(scan.nextInt());
		System.out.print("추가할 HISAL:");
		salgradeDTO.setHisal(scan.nextInt());
		
		return salgradeDTO;
		
	}

}
