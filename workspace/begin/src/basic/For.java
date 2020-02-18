package basic;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//특정한 명령들을 정해진 규칙에 따라 반복 처리
		//for(초기식; 조건식; 증감식){
		//	수행문1;
		//	수행문2;
		//	. . . }
		// 초기식: 가장 먼저 최초 1회만 수행 (다중 for문 제외)
		//		 2개 이상의 조건일 경우 콤마로 구분하여 지정 가능
		// 조건식: 초기식 다음으로 수행
		//		  반복 할때마다 한번씩 비교하여 계속 여부 결정
		// 즘감식: 반복을 수행할 때마다 조건식을 비교하기전에 항상 수행
		// 		  조건식에 사용되는 변수의 값을 증감시켜, 무한 반복의 되지않도록 함
		
		System.out.println("1\n2\n3\n4\n5");
		System.out.println("---");
		for (int i = 1; i < 6; i++) {
			System.out.println(i);
		}
		System.out.println("---");
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("---");
		for (int i = 1; i < 6; i++) {
			System.out.println("*");
		}
		//1~10까지 누적합계
		System.out.println("---");
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum = sum + i;
			//sum += i;
			System.out.println(i+"까지의 합:"+sum);
		}
		System.out.println("1부터 10까지의 합계:"+sum);

		System.out.println("---");
////		for(;;){System.out.println();} <<무한루프
////		for(int i= 1; ; ){System.out.println("?");} <<무한루프
//		for(int i= 1; i< 10; ){System.out.println("?");} <<무한루프
		for (int i = 1, j = 10; i < 6 ; i++, j*=2) {
			System.out.println(i + "" + j);			
		}
		
		System.out.println("---");
		for (int i=1; i<5; i++) {
			for (int j=1 ; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("---");
		char ch='A';
		for (int  i2= 0; i2< 5; i2++) {
			for (int j2 = 0; j2 < 6; j2++) {
				System.out.print(ch);
				ch++; //1씩 커지게 하기
				if(ch>90) {break;}
			}
			System.out.println();
		}
		

//		for (char ch = 'A';  ch< 'Z'; ch++) {
//			System.out.print(ch);
//		}
		
	}//END main()

}
