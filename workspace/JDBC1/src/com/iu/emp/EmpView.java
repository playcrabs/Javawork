package com.iu.emp;

import java.util.ArrayList;

public class EmpView {
	public void view(ArrayList<EmpDTO> ar) {
		System.out.println("=========================================================================");
		System.out.println("Ename\tDeptno\tEmpno\tHiredate\tMgr\tSal\tComm\tJob");
		System.out.println("=========================================================================");
		for(EmpDTO empDTO : ar) {
			System.out.print(empDTO.getEmpno()+"\t");
			System.out.print(empDTO.getEname()+"\t");
			System.out.print(empDTO.getMgr()+"\t");
			System.out.print(empDTO.getHiredate()+"\t");
			System.out.print(empDTO.getSal()+"\t");
			System.out.print(empDTO.getComm()+"\t");
			System.out.print(empDTO.getDeptno()+"\t");
			System.out.print(empDTO.getJob()+"\t");
			System.out.println();
		}
	}

}
