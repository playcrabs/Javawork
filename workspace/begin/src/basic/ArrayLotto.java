package basic;
import java.util.*;

 
public class ArrayLotto {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// 로또 번호 생성기 1~45사이의 정수들 중에서 중복되지 않는 번호 6개
		// 모두 일치하면 1등
		// 5개가 일치하고 보너스 번호가 일치하면 2등
		// 5개가 일치하면 3등
		// 4개가 일치하면 4등
		// 3개가 일치하면 5등
		// 그 외엔 X
		//임의의 당첨번호 6개와 보너스 번호 1개 생성
		//나의 로또 번호 6개를 입력받아 당첨 여부 확인
		//입력받은 수가 1~45보다 크거나 작으면 다시 입력
		//같은 숫자를 입력받으면 다시 입력받는다
		
		
		//myLotto: 길이6의 배열
		//-1번째 숫자는 그냥 입력받지만, 2번째 입력받을때부터 전의 숫자랑 중복을 확인해야함
		//-myLotto배열의 첫번째부터 비교하면서 중복되면 다시 입력받아야함
		//	for(int i=0; i<myLotto.length; i++){
		//	System.out.print((i+1)+"번째 번호를 입력하세요: ");
		//	llotoUser[i] = sc.nextInt(); 
		//  (중복체크해야함:i가 0보다 커지면 비교, for문 다시 필요)
		// 		for(int j=0; j<i; j++){
		//			(중복값이 있으면 다시 입력 받음, 없으면 계속 입력받음)
		//		}
		//-comLotto도 똑같이 배열생성후, 보너스 번호(중복확인) 한개 더 생성
		//-com과 my배열을 비교해서 값을 하나씩 +
		//
		// })
		 

		Scanner sc = new Scanner(System.in);//입력받기가능
		int num; //사용자의 로또 번호
		int bonusNum; //사용자의 보너스 번호
		int bonusNumPc; //PC의 보너스 번호
		int sum = 0; //등수를 정할 함수
		int[] llotoUser = new int[5]; //사용자의 로또 번호 배열
		int[] llotoPc = new int[5]; //PC의 로또 번호 배열

		System.out.println("- - - - L o t t o - - - -");
		for (int i = 0; i < llotoUser.length; i++) { //사용자에게서 로또 번호 입력받기
			System.out.print((i+1)+"번째 번호를 입력하세요: ");
			llotoUser[i] = sc.nextInt();
		}
		
		System.out.print("보너스 번호를 입력하세요: ");
		bonusNum = sc.nextInt();
		
		System.out.print("사용자의 로또 번호:");
		for (int j = 0; j < llotoUser.length; j++) { //사용자 로또 번호 출력
			System.out.print(llotoUser[j]+" ");
		}

		System.out.println(bonusNum);
		for (int i = 0; i < llotoPc.length; i++) {
			llotoPc[i] = (int)(Math.random() * 45) + 1;	//PC로또 번호 랜덤 생성			
		}

		System.out.print("당첨 로또 번호:");
		for (int i = 0; i < llotoPc.length; i++) {
			System.out.print(llotoPc[i]+" "); //PC의 로또 번호 출력	
		}

		bonusNumPc = ((int)(Math.random() * 45) + 1);	//보너스 번호 생성, 출력
		System.out.println(bonusNumPc);
		for (int i = 0; i < llotoPc.length; i++) {		//배열비교
			if(llotoUser[i]==llotoPc[i]) {
				sum +=1;
			}
		}

		System.out.println("일치하는 숫자는:"+sum);		//일치하는 숫자의 갯수
		if(sum==6) {								//결과
			System.out.println("1등입니다!");	
		} else if(sum==5 && (bonusNum==bonusNumPc)) {
			System.out.println("2등입니다!");
		} else if(sum==5) {
			System.out.println("3등입니다!");
		} else if(sum==4) {
			System.out.println("4등입니다!");
		} else if(sum==3) {
			System.out.println("5등입니다!");
		} else {
			System.out.println("당첨되지 못했습니다.");
		}

	}

 

}