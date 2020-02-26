package com.iu.t2.school;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.iu.t2.FileRead;
import com.iu.t2.school.StudentVO;

public class StudentDAO {
	private Scanner scan;
	
	public StudentDAO() {
		scan = new Scanner(System.in);
	}

	// student.txt파일의 내용을 읽어서 VO에 멤버변수로 초기화하고 ArrayList리턴
	// StringBufferd
	public StudentVO addStudent() {
		// 학생의 정보를 입력받고, student.txt에 추가
		// StudentVO 리턴
		ArrayList<StudentVO> VO = new ArrayList<StudentVO>();
		StudentVO studentVO = new StudentVO();		
		FileWriter fw = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("=====정보입력=====");
		System.out.print("이름:");
		String name = scan.next();
		System.out.print("번호:");
		int num = scan.nextInt();
		System.out.print("국어:");
		int kor = scan.nextInt();
		System.out.print("영어:");
		int eng = scan.nextInt();
		System.out.print("수학:");
		int math = scan.nextInt();

		String str = "\n" + name + "," + num + "," + kor + "," + eng + "," + math;

		try {
			fw = new FileWriter("c:\\test\\student.txt", true);
			fw.write(str);
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return studentVO;

	}

	public void StudentDel(ArrayList<StudentVO> ar) {
		System.out.print("삭제할 번호 입력:");
		int num = scan.nextInt();
		// 입력한 번호, 학생의 번호가 같은지
		boolean check = false;
		for (int i = 0; i < ar.size(); i++) {
			if (ar.get(i).getNumber() == num) {
				ar.remove(i);
				check = true;
				break;
			} //if END

		} //for END
		if (check) {
			FileWriter fw = null;
			try {
				//fileWriter = new FileWriter("c:\\test\\student.txt", !check);
				for (StudentVO studentVO : ar) {
					//String s = addStudent()
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

	public ArrayList<StudentVO> init() {
		File file = new File("C:\\test\\student.txt");
		FileReader fr = null;
		BufferedReader br = null;
		String s = null;
		ArrayList<StudentVO> VO = new ArrayList<StudentVO>();
		try {
			// 파일 스트림 연결
			fr = new FileReader(file);
			// 보조 스트림 연결
			br = new BufferedReader(fr);
			// read
			while ((s = br.readLine()) != null) {
				// parsing
				// 1.split
				String[] str = s.split(",");
				StudentVO sVO = new StudentVO();
				sVO.setName(str[0]);
				sVO.setNumber(Integer.parseInt(str[1]));
				sVO.setKor(Integer.parseInt(str[2]));
				sVO.setEng(Integer.parseInt(str[3]));
				sVO.setMath(Integer.parseInt(str[4]));
				sVO.setAll(sVO.getEng() + sVO.getKor() + sVO.getMath());
				sVO.setAvg((double) (sVO.getEng() + sVO.getKor() + sVO.getMath()) / 3);
				VO.add(sVO);

				// 3.StringTokenizer
//				StringTokenizer st = new StringTokenizer(s, ",");
//				while (st.hasMoreTokens()) {
//					StudentVO sVO = new StudentVO();
//					sVO.setName(st.nextToken());
//					sVO.setNumber(Integer.parseInt(st.nextToken()));
//					sVO.setKor(Integer.parseInt(st.nextToken()));
//					sVO.setEng(Integer.parseInt(st.nextToken()));
//					sVO.setMath(Integer.parseInt(st.nextToken()));
//					sVO.setAll(sVO.getEng() + sVO.getKor() + sVO.getMath());
//					sVO.setAvg((double) (sVO.getEng() + sVO.getKor() + sVO.getMath()) / 3);
//					VO.add(sVO);
//				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return VO;

	}
}


