package basic;

public class variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//변수
		// 변하는 값 하나를 저장하는 기억공간의 이름
		// 가장 마지막에 저장된 값을 기억한다
		// 선언이 된 블록{} 내부에서만 사용이 가능하다
		// -지역변수: 특정 메소드 블럭 내부에 선언된 변스, 사용전 초기화 필요
		// -전역변수: 클래스의 멤버로 선언된 변수, 사용전 초기화 불필요, 지정 값으로 자동 초기화 됨
		// 동일 블록 내에서는 같은 이름 사용 불가
		// 자료형을 선언하여 사용
		// 한번 선언한 이후에는 값만 변경하여서 사용
		
		//naming convention 식별자 명명규칙
		// 대소문자 구분
		// True/true는 서로 다른 것으로 간주
		// 클래스는 대문자
		// 변수는 소문자
		// 상수는 대문자
		// -예약어 사용 불가 
		// True는 사용 가능하지만, true는 사용불가
		// -숫자로 시작 불가
		// top10은 가능, 7up은 불가
		// -특수문자 사용 불가
		// 단, _와 $는 사용 가능
		// -문자길이 제한은 없음
		
		// 변수의 종류	 	 1byte  2byte 4byte 8byte
		// 기본 자료형   	  문자: 		char
		// primitive-숫자: byte, short, int, long 
		// data type-숫자: 			  float,double 
		// 			  논리: boolean
		// 참조자료형: 기본 자료형 이외의 모든 자료형
		// reference
		// type 
		
		//상수 선언 및 초기화
		final double PI=3.14;
		//PI=3.14444; 상수이기때문에 값 변경이 불가능함
		final float PII;
		System.out.println(PI);
		//System.out.println(PII);
		
		//변수 선언 및 초기화 1
		//자료형 변수이름;
		//변수이름 = 값;
		int num1; //정수형 변수 num1 선언
		num1 =1; //정수형 변수 num1을 1로 초기화
		System.out.println(num1);
		System.out.println("num1");
		
		//정수형 변수 num1의 값을 100으로 변경
		//정수형 변수 num1의 값을 화면으로 출력
		//단, 출력형태는 num1:~~~
		num1 =100;
		System.out.println("num1:"+num1);
		
		//변수 선언 및 초기화 2
		//자료형 변수이름 = 값;
		//char level =A;	//문자는 단일 따옴표없이 저장 불가
		char level ='A';	//문자는 단일 따옴표를 붙여서 저장
		
		//변수 level의 값을 화면에 출력
		System.out.println("level:"+level);
		
		//변수 level의 값을 Z로 변경후 화면에 출력
		level='Z';
		System.out.println("level:"+level);
		
		System.out.println("------------");
		
		//변수 num1의 값을 3으로 변경
		//변수 num2를 선언하면서 4로 초기화
		//변수 num1과 2의 값을 sum에 저장
		//각 변수의 값을 다음과 같이 출력
		num1 = 3;
		int num2 = 4;
		int sum = num1+num2;
		System.out.println(num1+"+"+num2+"="+sum);
		
		//실수를 저장할 변수 avg선언
		//num1과 num2의 평균을 avg 변수에 저장
		//avg의 값을 "평균:~"의 형태로 출력
		double avg= (num1+num2)/2.0;
		//(num1+num2)/(double)2; -->형변환
		System.out.println("avg="+avg);
		
		//true/false값을 저장할 변수 result를 선언
		//result에 true 저장하고 값을 화면에 출력
		boolean result = true;
		System.out.println("result="+result);
		
		//num1이 num2 비교한 결과를 result에 저장하고 출력
		result= num1>num2;
		System.out.println("result="+result);		
	}

}
