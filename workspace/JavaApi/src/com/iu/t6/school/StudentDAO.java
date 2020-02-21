package com.iu.t6.school;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentDAO {
	//
	private StringBuffer sb;
	Scanner scan = new Scanner(System.in);

	public StudentDAO() {
		sb = new StringBuffer();
		sb.append("iu-3-20-30-40-");
		sb.append("choa-4-50-60-70-");
		sb.append("suji-1-25-35-45-");
		sb.append("hani-2-80-80-80");
	}

	// makeSyudent메소드 생성
	// return은 학생들의 묶음(ArrayList)
	// parsing 작업 후 VO에 넣기
	public ArrayList<StudentVO> makeStudet() {
		StringTokenizer st = new StringTokenizer(sb.toString(), "-");
		ArrayList<StudentVO> studentVO = new ArrayList<StudentVO>();
		while (st.hasMoreTokens()) {
			StudentVO sVO = new StudentVO();
			sVO.setName(st.nextToken());
			sVO.setNumber(Integer.parseInt(st.nextToken()));
			sVO.setKor(Integer.parseInt(st.nextToken()));
			sVO.setEng(Integer.parseInt(st.nextToken()));
			sVO.setMath(Integer.parseInt(st.nextToken()));
			sVO.setAll(sVO.getEng() + sVO.getKor() + sVO.getMath());
			sVO.setAvg((double) (sVO.getEng() + sVO.getKor() + sVO.getMath()) / 3);
			studentVO.add(sVO);
		}

		return studentVO;
	}

	public ArrayList<StudentVO> addStudent(ArrayList<StudentVO> ar) {
		// 학생의 정보를 입력받음
		// 리스트에 추가하고 리턴
		StudentVO sVO = new StudentVO();
			System.out.println("추가할 정보를 입력하세요.");
			System.out.println("이름:");
			String name = scan.next();
			sVO.setName(name);
			System.out.println("번호:");
			int num = scan.nextInt();
			sVO.setNumber(num);
			System.out.println("국어:");
			int kor = scan.nextInt();
			sVO.setKor(kor);
			System.out.println("영어:");
			int eng = scan.nextInt();
			sVO.setEng(eng);
			System.out.println("수학:");
			int math = scan.nextInt();
			sVO.setMath(math);
			ar.add(sVO);

		return ar;
	}
	
	//remove
	public void removeStudent(ArrayList<StudentVO> ar) {
		System.out.print("지울 이름을 입력하세요:");
		String name = scan.next();
		for (int i = 0; i < ar.size() ; i++) {
			if (name.equals(ar.get(i).getName())) {
				ar.remove(i);
			} else {
				
			}
		}
		//return ar;
	}
	
	//add와 remove의 리턴을 하지않아도(void) 왜 작동이 되는지...? 

}
