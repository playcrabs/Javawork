package com.iu.dept;

import java.util.ArrayList;
import java.util.Scanner;

public class DeptController {
	// start메소드 선언
	// 1.부서등록
	// 2.부서삭제
	// 3.종료

	public void start() {
		DeptDAO deptDAO = new DeptDAO();
		DeptInput deptInput = new DeptInput();
		DeptView deptView = new DeptView();

		Scanner scan = new Scanner(System.in);
		System.out.println("-메뉴를 선택해주세요-");
		System.out.println(" 1. 부 서 등 록");
		System.out.println(" 2. 부 서 삭 제");
		System.out.println(" 3. 테 이 블 보 기");
		System.out.println(" 4. 부 서 별 보 기");
		System.out.println(" 5. 종 료");
		System.out.print(">> ");
		int choice = scan.nextInt();
		System.out.println("---------------");
		boolean check = true;
		do {
			switch (choice) {
			case 1:
				DeptDTO deptDTO = deptInput.insert();
				int result = deptDAO.insert(deptDTO);
				if (result > 0) {
					System.out.println(result + "개 행 이(가) 업데이트되었습니다.");
				} else {
					System.out.println(result + "개 행 이(가) 업데이트되었습니다.");
				}
				check = false;
				break;
			case 2:
				DeptDTO deptDTO1 = deptInput.delete();
				int result1 = deptDAO.delete(deptDTO1);
				if (result1 > 0) {
					System.out.println(result1 + "개 행 이(가) 업데이트되었습니다.");
				} else {
					System.out.println(result1 + "개 행 이(가) 업데이트되었습니다.");
				}
				break;
			case 3:
				ArrayList<DeptDTO> ar = deptDAO.selectList();
				deptView.select(ar);
			case 4:
				DeptDTO deptDTO2 = new DeptDTO();
				deptDTO2 = deptInput.selectOne();
				deptDTO2 = deptDAO.selectOne(deptDTO2);
				if(deptDTO2 != null) {
					deptView.view("");
					}else {
						deptView.view("부서가 존재 하지 않음");
					}
			default:
				System.exit(0);
			}
		} while (check);

	}
}
