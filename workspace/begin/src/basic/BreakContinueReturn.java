package basic;

public class BreakContinueReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// break
		// 가장 가까운 반복문을 끝낼때
		
		// i가 5가되면 반복 중단
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
			if (i==5) {
				break;
			}
		}
		System.out.println();
		
		// continue
		// 반복문 내에서 continue 이하를 수행하지 않고 다음 반복으로 이동
		
		//3의 배수만 출력
		for (int i = 1; i < 11; i++) {;
			if (i%3!=0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println();
		
		////3의 배수아닌것만 출력
		for (int i = 1; i < 11; i++) {;
		if (i%3==0) {
			continue;
		}
		System.out.println(i);
		}
		
		// return
		// 수행을 중단
		
		//A~Z까지 출력
		char ch='A';
		for (int  i2= 0; i2< 5; i2++) {
			for (int j2 = 0; j2 < 6; j2++) {
				System.out.print(ch+" ");
				ch++; //1씩 커지게 하기
				if(ch>'Z') {
					return;
					//break;
					}
			}
			System.out.println();
		}
		
		outer: 
		for (int i = 1; i < 10; i++) {
			System.out.print(i+":");
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
				if(j==5) continue outer;
				//if(j==5) break outer;	
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		

	}

}
