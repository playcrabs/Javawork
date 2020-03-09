package com.iu.main;

import com.iu.dept.DeptController;
import com.iu.dept.DeptDAO;
import com.iu.dept.DeptDTO;
import com.iu.dept.DeptInput;
import com.iu.salgrade.SalgradeDAO;
import com.iu.salgrade.SalgradeDTO;
import com.iu.salgrade.SalgradeInput;

public class ScottMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 생성 공식
		// 클래스명 변수명 = new 생성자();
		DeptController dc = new DeptController();
		dc.start();

		// SalgradeDAO salgradeDAO = new SalgradeDAO();
		// SalgradeInput salgradeInput = new SalgradeInput();

		// 멤버 사용 공식
		// 변수
		// 참조변수명.멤버변수명
		// 메소드
		// 참조변수명.메소드명
		// SalgradeDTO salgradeDTO = salgradeInput.insert();
		// salgradeDAO.insert(salgradeDTO);

	}

}
