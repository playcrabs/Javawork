package com.iu.t2.school;

import java.util.ArrayList;

public class StudentView {
	public void view(ArrayList<StudentVO> ar) {
		// 이름 번호 국어 영어 수학 총점 평균
		// iu 1 10 20 30 60 20

		System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=======================================================");

		for (StudentVO studentVO : ar) {
			System.out.print(studentVO.getName()+"\t");
			System.out.print(studentVO.getNumber()+"\t");
			System.out.print(studentVO.getKor()+"\t");
			System.out.print(studentVO.getEng()+"\t");
			System.out.print(studentVO.getMath()+"\t");
			System.out.print(studentVO.getAll()+"\t");
			System.out.print(studentVO.getAvg()+"\t");
			System.out.println();

		}
	}
}
