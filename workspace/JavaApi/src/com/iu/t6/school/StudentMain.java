package com.iu.t6.school;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDAO sDAO = new StudentDAO();
		StudentVO sVO = new StudentVO();

		ArrayList<StudentVO> studentVOs = sDAO.makeStudet();
		sDAO.addStudent(studentVOs);
		System.out.println("==추가==");
		for (int i = 0; i < studentVOs.size(); i++) {
			StudentVO studentVO = studentVOs.get(i);
			System.out.println("이름:" + studentVO.getName());
			System.out.println("번호:" + studentVO.getNumber());
			System.out.println("국어:" + studentVO.getKor());
			System.out.println("영어:" + studentVO.getEng());
			System.out.println("수학:" + studentVO.getMath());
			System.out.println("총합:" + studentVO.getAll());
			System.out.println("평균:" + studentVO.getAvg());
			System.out.println("---------------");
		}

		sDAO.removeStudent(studentVOs);
		System.out.println("==삭제==");
		for (int i = 0; i < studentVOs.size(); i++) {
			StudentVO studentVO = studentVOs.get(i);
			System.out.println("이름:" + studentVO.getName());
			System.out.println("번호:" + studentVO.getNumber());
			System.out.println("국어:" + studentVO.getKor());
			System.out.println("영어:" + studentVO.getEng());
			System.out.println("수학:" + studentVO.getMath());
			System.out.println("총합:" + studentVO.getAll());
			System.out.println("평균:" + studentVO.getAvg());
			System.out.println("---------------");
		}

	}

}
