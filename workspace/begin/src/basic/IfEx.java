package basic;
import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int kor, math, eng, all;
		String name, grade;
		double avg;
		//성적계산기
		//등급처리: A+(95) A0(90) B+(85) B(80) C0(70) C+(75) D+(65) D0(60) F
		System.out.println("-----성적 계산기-----");
		System.out.print(" 학생 이름: "); name = sc.next();
		System.out.print(" 국어 점수: "); kor = sc.nextInt();
		System.out.print(" 수학 점수: "); math = sc.nextInt();
		System.out.print(" 영어 점수: "); eng = sc.nextInt();
		System.out.println("-----------------");
		all = kor+math+eng;
		avg = all/3.0;
		System.out.println(" 총점: " + all);
		System.out.printf(" 평균: %.2f\n" ,avg);
		if(avg>=90) {
			grade = "A";	if(avg>=95) grade += "+";
							else 		grade += "0";
		} else if(avg>=80){ 
			grade = "B";	if(avg>=85) grade += "+";
							else 		grade += "0";
		} else if(avg>=70){
			grade = "C";	if(avg>=75) grade += "+";
							else 		grade += "0";
		} else if(avg>=60){
			grade = "D";	if(avg>=65) grade += "+";
							else 		grade += "0";			
		} else {			
			grade = "F";
		}		
		System.out.println(" 등급: " + grade );
	}

}
