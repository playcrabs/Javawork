package com.iu.t2.school;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentRemove {

	public ArrayList<StudentVO> remove(ArrayList<StudentVO> ar) {
		ArrayList<StudentVO> VO = new ArrayList<StudentVO>();
		Scanner scan = new Scanner(System.in);
		System.out.print("번호:");
		int i = scan.nextInt();
		StudentVO sVO = new StudentVO();
		if ( i == sVO.getNumber()) {
			ar.remove(i);
		}
		return VO;
		
	}
}
