package basic;

public class Literals {
	static boolean onOff;
	static char ch;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//논리형 리터럴 - boolean 타입으로 선언
		//true나 false를 저장함, false가 기본값
		//다른 자료형으로 변환이 불가하며, 논리구현에 주로 사용됨
		boolean flag = true;
		System.out.println(flag);
		System.out.println(onOff);
		flag = 3 > 4;
		System.out.println(flag);	
		
		//문자 리터럴 - char 타입으로 선언
		//2byte, 유니코드(16진수) 문자열을 사용
		//ASCII 코드와 호환 (0~127 까지는 똑같음)
		//내부적으로 부호없는 정수의 형태로 저장
		//단일 따옴표로 문자를 둘러싸서 저장하고, 한문자만 저장 가능함
		char first = 'A';
		char second = 65;
		char third = '\u0041';
		char tab = '\t';
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println("|" + ch + "|");
		System.out.println("|" + tab + "|");
		System.out.println("|\t|"); //tab
		System.out.println("|\f|"); //form fee
		System.out.println("|\r|"); //carrige return
		System.out.println("|\n|"); //new line
		System.out.println("\"Hello\""); //화면에 따옴표를 표시하기 위해선 \"내용\"
		System.out.println("H\re\rl\rl\ro");
		
		//정수 리터럴 - byte, short, int, long
		//기본형 int
		//long은 숫자값 뒤에 L이나 1 표시
		//십진수는 그대로 사용, 이진수는 숫자앞에 0b 표시
		//8진수는 숫자앞에 0표시, 16진수는 숫자앞에 0x 표시
		byte b = 127;
		//b = 128; 1바이트가 넘어가는 값은 저장 불가능함
		b = -128;		//십진수
		short s = 0b11; //이진수
		int i = 02;		//8진수
		int ii = 0xA;	//16진수
		int iii = 1000000000;
		//iii = 10000000000;	100억 이상 저장 불가
		//long l = 1000000000;	L을 붙이지 않아 아직 int형임
		long l = 1000000000L;	//L을 끝에 표시(대소문자 상관X)
		System.out.println("b	s	i	ii");
		System.out.println(b+"\t"+s+"\t"+i+"\t"+ii);
		
		//실수 리터럴 - float,double
		//기본형은 double
		//float는 숫자값  뒤에 F나 l표시
		//double은 d를 표시
		//float f = 0.12345678;	F나 l을 표시 하지 않음
		float f = 0.1234567890123456789F;
		double d = 0.123456789012345678;
		System.out.println(f+"\r"+d);
		d = 0.123456789012345678F;
		System.out.println(f+"\r"+d);
		
		System.out.println();
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(3e6f);
		System.out.println(3E6);
		System.out.println(2e-3);
		
		System.out.println("----------------");
		System.out.printf("print()");
		System.out.println("println()");
		System.out.println("println()");
		System.out.printf("|%d|",123456);
		//System.out.printf("|%d|",0.1123456); 실행오류 발생
		//printf는 6자리까지밖에 출력 
		System.out.println("-----------------");
		
		System.out.printf("|%d|",123456);
		System.out.printf("|%f|",0.123456);
		System.out.printf("|%10f|\n", 0.123456789);
		System.out.printf("|%10d|\n", 123456);
		System.out.printf("|%,3d|\n", 123456);
		System.out.printf("|%,-3d|\n", 123456);
		System.out.printf("|%s|\n", "수요일");  //문자열 출력
		System.out.printf("|%10s|\n", "수요일");
		System.out.printf("|%-10s|\n", "수요일");
		System.out.printf("%5d | %-10s | %f\n", 
						  1234, "수요일", 3.14);
		
		
	} //END main()

}//END class
