package com.iu.emp;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpController {
	EmpDAO empDAO = new EmpDAO();
	EmpView empView = new EmpView();
	EmpInput empInput = new EmpInput();

	public void menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("-메뉴를 선택해주세요-");
		System.out.println(" 1. EMP 테이블 조회");
		System.out.println(" 2. 사원 이름 검색");
		System.out.println(" 3. 전체 월급 합계");
		System.out.println(" 4. 전체 월급 합계2");
		System.out.println(" 5. 직원 추가");
		System.out.println(" 6. 사원 번호로 삭제");
		System.out.println(" 7. 직원 월급 수정");
		System.out.println(" 8. 종 료");
		System.out.print(">> ");
		int choice = scan.nextInt();
		System.out.println("---------------");
		switch (choice) {
		case 1:
			System.out.println(" 1. EMP 테이블 조회");
			ArrayList<EmpDTO> ar = empDAO.searchList("");
			empView.view(ar);
			break;
		case 2:
			System.out.println(" 2. 사원 이름 검색");
			ArrayList<EmpDTO> ar1 = empDAO.searchList("A");
			empView.view(ar1);
			break;
		case 3:
			System.out.println(" 3. 전체 월급 합계");
			ArrayList<EmpDTO> ar11 = empDAO.countSal();
			empView.view(ar11);

			break;
		case 4:
			System.out.println(" 4. 전체 월급 합계2");
			ArrayList<EmpDTO> ar111 = empDAO.countSal();
			empDAO.countSal2();
			empView.view(ar111);
			break;
		case 5:
			System.out.println(" 5. 직원 추가");
			EmpDTO empDTO = empInput.insert();
			empDAO.insert(empDTO);
			break;
		case 6:
			System.out.println(" 6. 사원 번호로 삭제");
			EmpDTO empDTO1 = empInput.delete();
			empDAO.delete(empDTO1);
			break;
		case 7:
			System.out.println(" 7. 직원 월급 수정");
			EmpDTO empDTO11 = empInput.update();
			empDAO.update(empDTO11);
			break;
		default:
			break;
		}
	}

}
