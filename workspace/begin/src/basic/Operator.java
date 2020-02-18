package basic;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//증감 연산자 
		// ++ : 피연산자의 값을 1 증가
		// -- : 피연산자의 값을 1 감소
		
		int i = 5;
		System.out.println(i);		//5
		System.out.println(++i);	//6,선증가
		System.out.println(i);		//6
		System.out.println(i++);	//6,후증가
		System.out.println(i);		//7
		System.out.println();
		
		i = 5;
		System.out.println(i);		//5
		System.out.println(--i);	//4,선감소
		System.out.println(i);		//4
		System.out.println(i--);	//4,후감소
		System.out.println(i);		//3
		System.out.println();
		
		//부호 연산자 +, -
		i = 5;
		System.out.println(-i);		//-5, 피연산자에 *(-1)
		System.out.println(+i);		//5, 피연산자에*(1)
		System.out.println();
		
		//논리 부정 연산자 !
		// true <-> false 로 변경
		boolean result = 3 > 4;
		System.out.println(result);		//false
		System.out.println(!result);	//true
		result = !result;
		System.out.println(result);		//true
		System.out.println();
		
		//비트 전환 연산자 ~
		// 정수를 2진수로 표현 시에 1은 0, 0은 1로 변경
		i = 10;
		System.out.println(i);
		System.out.println(~i);		//10을 2진수로 변경 후, 0과 1 변경, 다시 10진수로
		System.out.println();
		
		//반올림
		float PI = 3.141592f;
		System.out.println(PI);									//3.141592
		System.out.printf("%.2f\n",PI);							//3.14
		System.out.println(Math.round(PI));						//3
		System.out.println(Math.round(3.5));					//4
		System.out.println(Math.round(PI * 1000) / 1000f);		//3.142,
		System.out.println();
		
		//나머지 연산자 %
		// 나누기 한 나머지를 반환
		i = 3;
		System.out.println( 5 / 2 );	//2
		System.out.println( 5 % 2 );	//1
		System.out.println( -5 % 2 );	//-1
		System.out.println();
		
		//쉬프트 연산자 >> <<
		// 2의 제곱으로 곱하거나 나눔
		// 곱셈 또는 나눗셈조가 빠름
		i = 4;
		System.out.println(i);			//4
		System.out.println(i << 1);		//8, 10진수를 2진수로 변경 한 후 옆으로 이동
		System.out.println(i >> 1);		//2
		System.out.println( i >>> 1 );	//2
		System.out.println();
		
		i = -4;
		System.out.println(i);			//-4
		System.out.println(i << 1);		//-8, 10진수를 2진수로 변경 한 후 옆으로 이동
		System.out.println(i >> 1);		//-2
		System.out.println( i >>> 1 );	//214748346
		System.out.println();
		
		//비교 연산자 
		// > < 초과, 미만
		// >= <= 이상, 이하
		// == != 동일, 다름
		// -비교한 결과 true, false 값을 반환
		// -기본형은 모든 비교 연산자 사용 가능
		// -참조형은 ==, =! 만 사용 가능
		System.out.println( 3 < 4 );	//True
		System.out.println( 3 > 4 );	//False
		System.out.println( 3 <= 4 );	//True
		System.out.println( 3 >= 4 );	//False
		System.out.println( 3 == 4 );	//False
		System.out.println( 3 != 4 );	//True
		System.out.println();
		
		//i의 홀짝 결과를  result 변수에 저장
		i=5;
		result = ((i%2) == 0);
		System.out.println("i는 짝수: " + result );		//false
		result = ((i%2) != 0);
		System.out.println("i는 짝수아님: " + result );		//true
		System.out.println();
		
		//비트 연산자 
		// 피연산자를 비트 단위로 실행
		// 실수형을 제외한 모든 기본형에 사용 가능
		// & : AND 연산자 - 피연산자가 모두 1인 경우에 1
		// | : OR 연산자 - 피연산자 중 어느 한 쪽이 1이면 1
		// ^ : XOR 연산자 - 피연산자가 서로 다를 때 1
		System.out.println( 4 & 2 );	//0
		System.out.println( 4 | 2 );	//6
		System.out.println( 4 ^ 2 );	//6
		System.out.println();
		
		//논리 연산자
		// 피연산자가  true 또는 false 인 경우 사용
		// || : OR 연산자 - 두 개의 조건 중 어느 한 쪽이 true이면 true
		// && : AND 연산자 - 두 개의 조건 모두 true인 경우 true
		//				  || 보다 우선 순위가 높음
		System.out.println( 3>4 && 2>1 );	//false, Dead code(앞이 false)
		System.out.println( 3>4 || 2>1 );	//true
		
		//ch의 값이 대문자인지 소문자인지 비교한 결과를 result에 저장
		char ch = 'a';
		result = ch>=65 && ch<=90;	//범위 지정 할때, 숫자가 아니고 'A'를 써도 됨
		System.out.println("ch는 대문자: " + result);
		result = ch>=97 && ch<=122;
		System.out.println("ch는 소문자: "+ result);
		result = (ch>=65 && ch<=90) || (ch>=97 && ch<=122);
		System.out.println("ch는 영어임: " + result);
		result = (ch>=65 && ch<=90) && (ch>=97 && ch<=122);
		System.out.println("ch는 영어가 아님: " + result);
		System.out.println();
		
		//삼항 연산자	조건식 ? 1 : 2
		// 조건식의 연산결과가 true이면 1을 반환, False면  2를 반환
		ch = (3>4) ? 'Y' : 'N';
		System.out.println("3은 4보다 크다? " + ch);
		System.out.println();
		
		//성적 계산기
		//평균이 60점 이상이면 합격 그렇지 않으면 불합격
		//평균은 소수점 이하 2자리까지만 표시
		int kor = 90;
		int eng = 80;
		int math = 75;
		float all = (kor + eng + math);
		//double avg = all/3.0;
		String pass = all >= 60 ? "합격" : "탈락";
		
		System.out.println("- - - - 성 적 표 - - - -");
		System.out.println(" 국어: " + kor);
		System.out.println(" 영어 : " + eng);
		System.out.println(" 수학 : " + math);
		System.out.println("- - - - - - - - - - -");
		System.out.println(" 총점: "+ ( kor + eng + math ));
		System.out.printf(" 평균: %.2f \n", all / 3);
		System.out.println(" 합격 여부 :" + pass);
		System.out.println("- - - - - - - - - - -");
		System.out.println();
		
		//대입 연산자  =, op=
		// 오른쪽 피연산자의 값을 왼쪽 피연산자에 저장
		//i 값을 1 증가시켜서 i에 누적 저장을 3가지 방법
		i = 5;		System.out.println(i);
		
		i = i + 1;	System.out.println(i);	
		++i;		System.out.println(i);	
		i += 1;		System.out.println(i);	

		i = i - 1;	System.out.println(i);	
		--i;		System.out.println(i);	
		i -= 1;		System.out.println(i);	
		
		
	}

}
