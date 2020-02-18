package basic;
import java.util.*;

public class Arrray2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1차원배열이 여러개 모인것
		// 다차원 배열 선언
		// 데이터타입[][]	변수명;
		// 데이터타입		변수명[]][];
		
		// 다차원 배열 생성;
		// 변수명 = new 데이터타입[배열의 행 길이][배열의 열 길이];
		
		// 다차원 배열 초기화;
		// 변수명[행번호][열번호] = 데이터;
		
		// 정수형 2차원 배열 nums 선언
		int[][] nums;
		
		// 정수형 2차원 배열 nums 생성
		nums = new int[2][3];
		
		// 다차원 배열의 선언 및 생성
		// 데이터타입[][] 변수명 = {{},{},{}};
		// 데이터타입[][] 변수명 = new 데이터타입[][] {{},{},{}};
		
		//정수형 2차원 배열 nums를 
		// 10 20 30
		// 40 50 60 으로 초기화
		nums[0][0]=10;
		nums[0][1]=20;
		nums[0][2]=30;
		nums[1][0]=40;
		nums[1][1]=50;
		nums[1][2]=60;
		System.out.println(nums.length);
		System.out.println(nums[1].length);
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[1].length; j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		
		//문자열 2차원배열 2:2 list선언 및 생성
		String list[][]=new String[2][2];
		list[0][0]="on";
		list[0][1]="off";
		list[1][0]="off";
		list[1][1]="on";
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[1].length; j++) {
				System.out.print(list[i][j]+" ");
			}
			System.out.println();
		}
		
		//문자형 2차원배열 2:4 ch선언 및 생성
		char ch[][]= {{'a','b','c','d'},{'e','f','g','h'}};
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[1].length; j++) {
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
		}
		
		//가변길이 2차원 배열
		// 행과 열의 길이가 각각 다른 2차원 배열
		
		//가변길이 2차원배열의 선언 및 생성
		// 데이터타입[][] 변수명 = new 데이터타입[배열의 행길이][];
		
		//가변길이 2차원 문자열 배열 strArr
		String[][] strArr = new String[2][];
		strArr[0]=new String[2];
		strArr[1]=new String[3];
		
		strArr[0][0]="A";
		strArr[0][1]="B";
		strArr[1][0]="X";
		strArr[1][1]="Y";
		strArr[1][2]="Z";
		
		System.out.println(strArr.length);
		System.out.println(strArr[0].length);
		System.out.println(strArr[1].length);
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[i][j]+" ");
			}
			System.out.println();
		}

		Scanner sc = new Scanner(System.in);//입력받기가능
		
		int[][] Lotto = {{1,2,3,4,5,6},{1,2,3,4,5,6,7}};
		for (int i = 0; i < Lotto.length; i++) {
			for (int j = 0; j < Lotto[i].length; j++) {
				System.out.printf("%3d",Lotto[i][j]);
			}
			System.out.println();
		}
		
	}//END

}
