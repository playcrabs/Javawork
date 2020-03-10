package com.iu.main;

import java.util.ArrayList;

import com.iu.dept.DeptController;
import com.iu.dept.DeptDAO;
import com.iu.dept.DeptDTO;
import com.iu.dept.DeptInput;
import com.iu.emp.EmpController;
import com.iu.emp.EmpDAO;
import com.iu.emp.EmpDTO;
import com.iu.emp.EmpInput;
import com.iu.emp.EmpView;
import com.iu.salgrade.SalgradeDAO;
import com.iu.salgrade.SalgradeDTO;
import com.iu.salgrade.SalgradeInput;

public class ScottMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DeptController dc = new DeptController();
		//dc.start();
		// SalgradeDAO salgradeDAO = new SalgradeDAO();
		// SalgradeInput salgradeInput = new SalgradeInput();
		// SalgradeDTO salgradeDTO = salgradeInput.insert();
		// salgradeDAO.insert(salgradeDTO);
		
		//======================================================
		
		EmpController empController = new EmpController();
		empController.menu();

	}
}
