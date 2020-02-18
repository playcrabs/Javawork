package basic;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while (조건식) {
		// 조건식의 결과가  true일 경우에 처리할 문장1
		// 조건식의 결과가  true일 경우에 처리할 문장2
		//			. . .	
		// }
		
		//while(조건식)
		// 조건식의 결과가 true인 경우에 처리할 문장1
		
		int i = 1;
		while(i <= 5) {
			System.out.println(i);
			i++;
		}
		System.out.println();
		
		int j = 5;
		while(j >= 1) {
			System.out.println(j);
			j--;
		}
		
		i = 1;
		int sum =0;
		while(i <= 10) {
			sum += i;
			System.out.println( i++ +"까지의 합: "+sum);
			//i++;
		}
		System.out.println("----------------");
		System.out.println("1부터 10까지의 합: "+sum);
		System.out.println();
		
//		while(true) {
//			System.out.println("?");
//		}	무한루프
		
		//최소 1회 수행을 보장하는 while문
		// do(조건식){
		// 반복 처리할 내용1
		// 반복 처리할 내용2
		//		...
		// } while(조건식);
		
		//10부터 1까지 카운트 다운, 1일때  fire출력
		i=10;
		do {
			System.out.println(i--);
			//i--;
			if (i==0) {
				System.out.println("Fire!");
			}
		} while (i >= 1);
		System.out.println();
		
		char upper = 'A';
		char lower = (char)(upper+32);
		System.out.println(lower+1.5);
		lower += 1.5;
		System.out.println(lower);
		
	}//END

}
