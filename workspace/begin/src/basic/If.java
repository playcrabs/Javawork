package basic;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//조건식의 결과가 boolean인 경우에 사용
		// if(조건식) {
		//			처리할 내용1;
		//			처리할 내용2;
		// }
		
		// if(조건식){
		//	조건에 일치하면 처리할 내용들
		// } else {
		//	그렇지 않은 경우 처리할 내용들
		// }
		
		// if(조건식){
		//	조건에 일치하면 처리할 내용들
		// } else if(조건식2) {
		//	조건2에 일치하면 처리할 내용들
		// } else if(조건식3) {
		//	조건3에 일치하면 처리할 내용들
		// } ... {
		// } else {
		//	 위의 조건들을 모두 만족하지 않는 경우에 처리할 내용들
		//	 생략가능 }
		//	}
		
		//total이 100이상이면 통과 출력
		//50이상이면 재검토 출력
		//그렇지 않으면 실패 출력
		int total = 60;
		
		//1. 삼항연산자
		System.out.println("1. 삼항연산자");
		System.out.println(total >= 100 ? "통과" : "실패");
		System.out.println("---------");
		
		//2. if문
		System.out.println("2. if문");
		if(total>=100) {
			System.out.println("통과");
		}
		System.out.println("---------");
		
		//3. if-else문
		System.out.println("3. if-else문");
		if(total>=100) {
			System.out.println("통과");
		} else {
			System.out.println("실패");			
		}
		System.out.println("---------");
		
		//4. if-else if-else문
		System.out.println("4. if-else if-else문");
		if(total>=100) {
			System.out.println("통과");
		} else if(50 <= total ){
			System.out.println("재검토");			
		} else {
			System.out.println("실패");
		}
		System.out.println("---------");
		
		//중첩 if문
		// if문의 블럭내에 또 다른 if문 사용
		// if(...){
		//		if(...){ } <<중첩된 if문
		// } else if(...){
		//		if(...){ } <<중첩된 if문
		// } else {
		//		if(...){ } <<중첩된 if문
		
		

	}

}
