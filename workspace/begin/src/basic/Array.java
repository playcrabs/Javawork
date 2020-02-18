package basic;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열
		// 동일한 자료형들을 연속된 공간에 저장
		// 저장된 데이터의 위치는 인덱스를 이용하여 접근
		// 한 번 생성된 이후 크기 변경이 불가함
		// 더 큰 공간이 필요하면 새로운 배열을 만들어 복사
		// 많은 데이터들을 저장할 공간을 한꺼번에 생성
		// 자바에서 배열은 하나의 객체로 인식함
		// 길이 값을 같는 멤버변수와 여러 메소드들을 가짐
		// 배열을 선언하고 생성하지 않은 경우엔  null로 초기화 됨
		// null: 변수가 참조하는 객체가 없을 경우의 초기값
		//		  참조형 변수에만 저장이 가능함
		// 1차원부터 무한대의 다차원배열이 생성가능
		// 2차원 이상의 배열은 배열의 배열구조
		
		// 1차원 배열의 선언
		// 데이터타입[] 변수명;
		// 데이터타입	  변수명[];
		
		// 1차원 배열의 생성
		// 변수명 = new 데이터타입[배열의 크기n];
		
		// 1차원 배열의 생성 및 선언
		// 데이터타입[]	 변수명 = new 데이터타입[배열의 크기n];
		
		// 1차원 배열의 선언, 생성 및 초기화
		// 데이터타입[]	 변수명 = { 내용1, 내용2, 내용3 . . . , }; 
		// 데이터타입[]	 변수명 = new 데이터타입[]{내용,내용...};
		
		// 정수형 1차원 배열 numArr 선언
		int[] numArr;	//int numArr[];
		
		// 문자형 1차원 배열 chars 선언
		char chars[];	//char[] chars;
		
		// 정수형 데이터 5개를 저장할 1차원 배열 numArr 생성
		numArr = new int[5];
		
		// 문자형 데이터 3개를 저장할 1차원 배열 chars 선언
		chars = new char[3];
		
		// 문자열 데이터 4개를 저장할 1차원배열 strArr을 선언 및 생성
		String[] strArr = new String[4];
		
		// numArr 배열의 모든 데이터를 100으로 초기화
		numArr[0]=100;
		numArr[1]=100;
		numArr[2]=100;
		numArr[3]=99;
		numArr[4]=100;
		
		// for문을 이용하여 numArr의 값을 출력
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(i+"번째 배열의 값: "+numArr[i]);
		}

		System.out.println("배열의 길이 정보를 이용해 numArr의 값 출력");
		System.out.println("배열 변수 출력: "+numArr.length);
		System.out.println("cahrs 배열의길이:"+chars.length);
		System.out.println("strArr 배열의길이:"+strArr.length);
		System.out.println("배열 변수 출력: "+numArr); //객체의 주소
		
		chars[0]='H';
		chars[1]='i';
		chars[2]='!';
		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i]);
		}
		System.out.println("------");
		
		strArr[2]="hello";
		for (int i = 0; i < strArr.length; i++) {
			System.out.println("strArr의 "+i+"번째 값: "+strArr[i]);
		}
		
		//문자열 배열 bloodType을 선언하여 A/B/O/AB 초기화
		String[] bloodType = new String[]{"A","B","O","AB"};
		//bloodType = {"1","2","3","4"}; 선언이 된이후 초기화 가 불가능함
		System.out.println("bloodType배열의 길이:" +bloodType.length);
		bloodType =new String[]{"에이","비","오","에이비"};
		
		//명령행 커맨드로 문자열을 입력받기
		System.out.println(args[0]);
		System.out.println(args.length);
		
	}//END Main()
	
}
