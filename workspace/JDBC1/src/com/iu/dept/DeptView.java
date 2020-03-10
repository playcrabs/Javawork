package com.iu.dept;

import java.util.ArrayList;

public class DeptView {
	
	public void select(DeptDTO deptDTO) {
			System.out.println("deptno:" + deptDTO.getDeptno());
			System.out.println("dname:" + deptDTO.getDname());
			System.out.println("loc:" + deptDTO.getLoc());

	}
	
	public void select(ArrayList<DeptDTO> ar) {
		for (DeptDTO deptDTO : ar) {
			System.out.println("deptno:" + deptDTO.getDeptno());
			System.out.println("dname:" + deptDTO.getDname());
			System.out.println("loc:" + deptDTO.getLoc());
		}

	}

	public void view(String message) {
		System.out.println(message);
	}

}
