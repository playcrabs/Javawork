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

public class StudentDAO {
	
	private Scanner sc;
	
	public StudentDAO() {
		sc = new Scanner(System.in);
	}
	
	
	private String makeInfo(StudentVO studentVO) {
		StringBuffer sb = new StringBuffer();
		sb.append(studentVO.getName());
		sb.append(",");
		sb.append(studentVO.getNum());
		sb.append(",");
		sb.append(studentVO.getKor());
		sb.append(",");
		sb.append(studentVO.getEng());
		sb.append(",");
		sb.append(studentVO.getMath());
		sb.append("\r\n");
		return sb.toString();
	}
	
	
	public void deleteStudent(ArrayList<StudentVO> ar) {
		
		System.out.println("삭제 번호 입력");
		int num = sc.nextInt();
		//입력한 번호와 학생 한명의 번호가 같은지 검사
		//같으면 삭제
		boolean check=false;
		for(int i=0;i<ar.size();i++) {
			if(ar.get(i).getNum()==num) {
				ar.remove(i);
				//i=ar.size()*100;
				check=true;
				break;
			}//if 끝
			
		}//for 끝
		
		if(check) {
			
			FileWriter fileWriter= null;
			
			try {
				fileWriter = new FileWriter("c:\\test\\student.txt", !check);
				
				for(StudentVO studentVO: ar) {
				
					String s = this.makeInfo(studentVO);
					fileWriter.write(s);
					fileWriter.flush();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					fileWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
		}
		
		
		
	}
	
	public StudentVO addStudent() {
		//학생의 이름, 번호, 국어, 영어 , 수학
		//student.txt에 추가
		//name,num,kor,eng,math
		StudentVO studentVO = new StudentVO();
		System.out.println("이름 입력");
		studentVO.setName(sc.next());
		System.out.println("번호 입력");
		studentVO.setNum(sc.nextInt());
		System.out.println("국어 입력");
		studentVO.setKor(sc.nextInt());
		System.out.println("영어 입력");
		studentVO.setEng(sc.nextInt());
		System.out.println("수학 입력");
		studentVO.setMath(sc.nextInt());
		studentVO.setTotal(studentVO.getKor()+studentVO.getEng()+studentVO.getMath());
		studentVO.setAvg(studentVO.getTotal()/3.0);
		
		//String result = studentVO.getName()+","
		FileWriter fw=null;
		
		try {
			fw=new FileWriter("c:\\test\\student.txt", false);
			String s = this.makeInfo(studentVO);
			fw.write(s);
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
	
	
	public ArrayList<StudentVO> init(){
		//student.txt 내용을 읽어서
		//파싱 후 VO객체에 멤버변수로 초기화 후
		//ArrayList에 담아서 리턴
		
		//파일읽기 준비
		File file = new File("c:\\test\\student.txt");
		
		FileReader fr=null;
		BufferedReader br=null;
		String s=null;
		ArrayList<StudentVO> ar = new ArrayList<StudentVO>();
		try {
			//파일 스트림 연결
			fr = new FileReader(file);
			//보조 스트림 연결
			br = new BufferedReader(fr);
			
			//한줄 읽기
			while((s=br.readLine()) != null) {
			//파싱
				StringTokenizer st =  new StringTokenizer(s, ",");	
				StudentVO studentVO = new StudentVO();
				studentVO.setName(st.nextToken());
				studentVO.setNum(Integer.parseInt(st.nextToken()));
				studentVO.setKor(Integer.parseInt(st.nextToken()));
				studentVO.setEng(Integer.parseInt(st.nextToken()));
				studentVO.setMath(Integer.parseInt(st.nextToken()));
				studentVO.setTotal(studentVO.getKor()+studentVO.getEng()+studentVO.getMath());
				studentVO.setAvg(studentVO.getTotal()/3.0);
				ar.add(studentVO);
//				
//				String [] str = s.split(",");
//				StudentVO studentVO = new StudentVO();
//				studentVO.setName(str[0]);
//				studentVO.setNum(Integer.parseInt(str[1]));
//				studentVO.setKor(Integer.parseInt(str[2]));
//				studentVO.setEng(Integer.parseInt(str[3]));
//				studentVO.setMath(Integer.parseInt(str[4]));
//				studentVO.setTotal(studentVO.getKor()+studentVO.getEng()+studentVO.getMath());
//				studentVO.setAvg(studentVO.getTotal()/3.0);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return ar;
		
		
		
	}

}
