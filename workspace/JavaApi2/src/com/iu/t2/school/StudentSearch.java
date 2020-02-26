package com.iu.t2.school;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSearch {
	public ArrayList<StudentVO> search(ArrayList<StudentVO> ar) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름:");
		String s = scan.next();
		ArrayList<StudentVO> VO = new ArrayList<StudentVO>();
		StudentVO sVO = new StudentVO();
		for (int i = 0; i < ar.size(); i++) {
			if ( s.equals(sVO.getName()) ) {
				VO.remove(sVO.getName());
				System.out.println("!");
				System.out.println(sVO.getNumber());
			}
		}
		return ar;
	}
}
