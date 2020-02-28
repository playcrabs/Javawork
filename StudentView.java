package com.iu.t2.school;

import java.util.ArrayList;

public class StudentView {
	
	public void view(ArrayList<StudentVO> ar) {
		System.out.println("이름 \t 번호 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
		System.out.println("=============================================================");
		for(StudentVO studentVO : ar) {
			System.out.print(studentVO.getName()+" \t");
			System.out.print(studentVO.getNum()+" \t");
			System.out.print(studentVO.getKor()+" \t");
			System.out.print(studentVO.getEng()+" \t");
			System.out.print(studentVO.getMath()+" \t");
			System.out.print(studentVO.getTotal()+" \t");
			System.out.print(studentVO.getAvg());
			System.out.println();
		}
		//이름  번호  국어  영어  수학  총점  평균
		//iu   1   50  50   50  150 50.0
		//hani 2   60  60   60  180 60.0
		
	}

}
