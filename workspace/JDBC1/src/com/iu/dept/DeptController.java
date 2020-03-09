package com.iu.dept;

import java.util.Scanner;

public class DeptController {
	//start메소드 선언
	//1.부서등록
	//2.부서삭제
	//3.종료
	
	public void start() {
		DeptDAO deptDAO = new DeptDAO();
		DeptInput deptInput = new DeptInput();
		Scanner scan = new Scanner(System.in);
		System.out.println("-메뉴를 선택해주세요-");
		System.out.println(" 1. 부 서 등 록");
		System.out.println(" 2. 부 서 삭 제");
		System.out.println(" 3. 종 료");
		System.out.print(">> ");
		int choice = scan.nextInt();
		System.out.println("---------------");
			switch (choice) {
			case 1:
				DeptDTO deptDTO = deptInput.insert();
				deptDAO.insert(deptDTO);
				break;
			case 2:
				DeptDTO deptDTO1 = deptInput.delete();
				deptDAO.delete(deptDTO1);
				break;
			default:
				System.exit(0);
			}
		
		
	}
}
