package com.iu.t2.school;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
	public void start() {
		// 1. 전체 학생 출력
		// 2. 학생 정보 추가
		// 3. 학생 정보 검색(이름 입력)
		// 4. 학생 정보 삭제(번호 입력)
		// 5 .프로그램 종료
		StudentDAO sDAO = new StudentDAO();
		StudentVO sVO = new StudentVO();
		StudentView sv = new StudentView();
		StudentRemove sr = new StudentRemove();
		StudentSearch ss = new StudentSearch();
		ArrayList<StudentVO> sVOs = new ArrayList<StudentVO>();

		Scanner scan = new Scanner(System.in);
		System.out.println("-------메뉴-------");
		System.out.println("1.전체 학생 출력");
		System.out.println("2. 학생 정보 추가");
		System.out.println("3. 학생 정보 검색(이름 입력)");
		System.out.println("4.학생정보 삭제(번호 입력)");
		System.out.println("5.프로그램 종료");
		System.out.println("-----------------");
		System.out.print("메뉴 번호:");
		int i = scan.nextInt();

		System.out.println("-----------------");
		if (i == 1) {
			System.out.println("전체 학생을 출력합니다.");
			sVOs = sDAO.init();
			sv.view(sVOs);
		}
		if (i == 2) {
			System.out.println("새로운 학생의 정보를 입력하십시오");
			sDAO.addStudent();

		}
		if (i == 3) {
			System.out.println("검색할 학생의 이름을 입력하십시오.");
		}
		if (i == 4) {
			System.out.println("삭제할 학생의 번호를 입력하십시오");
			sDAO.StudentDel(sVOs);
		}
		if (i == 5) {
			System.out.println("종료합니다.");
			System.exit(0);
		}

	}
}
