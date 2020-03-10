package com.iu.emp;

import java.util.Scanner;

public class EmpInput {
	private Scanner scan;
	
	public EmpInput() {
		 scan = new Scanner(System.in);
	}
	
	public EmpDTO insert() {
		EmpDTO empDTO = new EmpDTO();
		System.out.print("추가할 Ename(String):");
		empDTO.setEname(scan.next());
		System.out.print("추가할 Comm(Double):");
		empDTO.setComm(scan.nextDouble());
		System.out.print("추가할 Deptno(Int):");
		empDTO.setDeptno(scan.nextInt());
		System.out.print("추가할 Empno:(Int)");
		empDTO.setEmpno(scan.nextInt());
		System.out.print("추가할 Job(String):");
		empDTO.setJob(scan.next());
		System.out.print("추가할 Mgr(Int):");
		empDTO.setMgr(scan.nextInt());
		System.out.print("추가할 Sal(Double):");
		empDTO.setSal(scan.nextDouble());
		
		return empDTO;
	}
	
	public EmpDTO delete() {
		EmpDTO empDTO = new EmpDTO();
		System.out.print("삭제할 사원의 번호:");
		empDTO.setEmpno(scan.nextInt());
		
		return empDTO;
	}
	
	public EmpDTO update() {
		EmpDTO empDTO = new EmpDTO();
		System.out.print("수정할 사원의 번호:");
		empDTO.setEname(scan.next());
		System.out.print("수정할 Sal의 값:");
		empDTO.setSal(scan.nextDouble());
		System.out.print("수정할 Comm의 값:");
		empDTO.setComm(scan.nextDouble());
		
		return empDTO;
	}
	

}
