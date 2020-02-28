package com.iu.t2.school;

import java.util.ArrayList;

public class StudentController {
	private ArrayList<StudentVO> ar;
	private StudentDAO studentDAO;
	private StudentView studentView;
	
	public StudentController() {
		this.studentDAO = new StudentDAO();
		this.studentView = new StudentView();
	}
	
	public void start() {
		
		//1. 전체 학생 출력
		ar = this.studentDAO.init();
		this.studentView.view(ar);
		//2. 학생 정보 추가
		//StudentVO studentVO = this.studentDAO.addStudent();
		//ar.add(studentVO);
		
		//3. 학생 정보 검색(이름)
		//4. 학생 정보 삭제(번호)
		this.studentDAO.deleteStudent(ar);
		this.studentView.view(ar);
		
		//5. 프로 그램 종료
		
		
	}

}
