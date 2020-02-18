package basic;

public class BreakContinueReturnEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100 사이의 정수중에서 가장 큰 7의 배수 하나만 출력
		// 1~10 사이의 정수중에서 3~6을 제외하고 출력
		for (int i = 100; i > 1; i--) {
			if (i%7 == 0) {
			System.out.println("1~100 사이의 정수중에서 가장 큰 7의 배수= "+i);
			break;
		}
		}	//100부터 거꾸로 내려오기
		
		System.out.println("---------------------------------------");
		
		System.out.print("1~10 사이의 정수중에서 3~6을 제외: ");
		for (int j = 1; j <= 10; j++) {
			if (j>=3 && j<=6) {
				continue;
			}
			System.out.print(j+" ");
		}

	}

}
