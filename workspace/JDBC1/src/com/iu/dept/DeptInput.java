package com.iu.dept;

import java.util.Scanner;

public class DeptInput {
	
	private Scanner scan;
	
	public DeptInput() {
		scan = new Scanner(System.in);
	}
	
	public DeptDTO insert() {
		//부서번호, 부서명, 지역명 입력받기
		DeptDTO deptDTO = new DeptDTO();
		
		System.out.print("추가할 부서번호를 입력하세요:");
		deptDTO.setDeptno(scan.nextInt());
		System.out.print("추가할 부서명을 입력하세요:");
		deptDTO.setDname(scan.next());
		System.out.print("추가할 지역명을 입력하세요:");
		deptDTO.setLoc(scan.next());
		
		return deptDTO;
	}
	
	public DeptDTO delete() {
		DeptDTO deptDTO = new DeptDTO();
		
		System.out.print("지울 부서번호를 입력하세요:");
		deptDTO.setDeptno(scan.nextInt());
		
		return deptDTO;
	}
}
