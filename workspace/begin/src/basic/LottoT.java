package basic;
import java.util.Arrays;
import java.util.Scanner;

public class LottoT {

	public static void main(String[] args) {

		System.out.println("- - - -L o t t o- - - -");
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);//입력받기가능
		int[] myLotto = new int[6]; //사용자의 로또 번호 배열
		int[] pcLotto = new int[7]; //PC의 로또 번호 배열
		int input = 0; //입력된 사용자로또 번호
		int bonus =0; //보너스 숫자
		int sum= 0; //일치하는 숫자의 갯수
		String result;
		
		//사용자의 로또번호 입력받기 - 강사님Ver.
		for (int i = 0; i < myLotto.length; i++) {
			System.out.print((i+1)+"번째 번호를 입력하세요: ");
			input =sc.nextInt();
			if (input<1 || input>45) {
				System.out.println("1~45사이의 값으로 다시 입력해주세요:");
				i--;		//i값을 1감소 시킴
				continue;	//반복문을 다음 회차로
			} else {
				myLotto[i]=input;//입력받은 숫자를  myLotto배열에 저장
				for (int j = 0; j < i; j++) {
					if (myLotto[i]==myLotto[j]) {
						System.out.println(" 이미 입력한 숫자입니다. ");
						i--;	//i의 값1 감소
						break;	//중복 확인 반복 종료
					}
				}
			}
		}
		
		//PC로또 번호 생성
		for (int i = 0; i < pcLotto.length; i++) {
			pcLotto[i] = (int)(Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (pcLotto[i]==pcLotto[j]) {
					i--;
					break; //중복확인반복종료
				}
			}
		}
		
		//보너스 번호
		bonus=pcLotto[6];
		
		//배열 정렬
		Arrays.sort(myLotto);
		Arrays.sort(pcLotto, 0 , pcLotto.length-1);
		
		System.out.println("- - - -번호 확인- - - -");
		//사용자 로또 번호 확인
		System.out.print("사용자 로또 번호:");
		for(int i:myLotto) {
			System.out.print(i+" ");}
		
		//PC로또 번호 확인
		System.out.print("\nPC로또 번호:");
		for(int i:pcLotto) {
			System.out.print(i+" ");}
		
		//번호 비교
		for (int i = 0; i < myLotto.length; i++) {
			for (int j = 0; j < pcLotto.length-1; j++) {
				if (myLotto[i]==pcLotto[j]) {
					sum ++;
					break;
				}
			}
		}
		
		//당첨확인
		System.out.println();
		System.out.println("- - - -당첨 확인- - - -");	
		System.out.println("일치하는 수의 개수:"+sum);
		switch (sum) {
		case 6:	result = "1등입니다!"; break;
		case 5: result = "3등입니다!";
			for (int i = 0; i < myLotto.length; i++) {
			if (myLotto[i]==bonus) {result = "2등입니다!";}
		}						  break;
		case 4: result="4등입니다!"; break;
		case 3: result="5등입니다!"; break;
		default: result="당첨되지 못했습니다..."; break;
		}
		System.out.println(result);
		
	}//END main();

}
