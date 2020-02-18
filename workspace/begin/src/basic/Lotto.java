package basic;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		//숫자는 1~45사이
	
	Scanner sc = new Scanner(System.in);//입력받기가능
	int[] myLotto = new int[6]; //사용자의 로또 번호 배열
	int[] pcLotto = new int[7]; //PC의 로또 번호 배열
	int input = 0; //입력된 사용자로또 번호
	int sum= 0; //일치하는 숫자의 갯수

		//사용자의 로또 번호 입력받기 - myVer.
		for (int i = 0; i < myLotto.length; i++) {
			System.out.print((i+1)+"번째 번호를 입력하세요: ");
			input =sc.nextInt();
			if (1<=input && input<=45) {
				input=myLotto[i];
			} else {
				System.out.print("1~45사이의 값으로 다시 입력해주세요:");
				input =sc.nextInt();
				input=myLotto[i];
			}
			for (int j = 0; j < i; j++) {
				if (myLotto[j] == myLotto[i]) {
					System.err.println("중복된 값입니다. 다시입력해 주세요:");;
					input =sc.nextInt();
					input=myLotto[i];					
				}
			}
		}
				
		//PC로또 번호 생성
		for (int i = 0; i < pcLotto.length; i++) {
			pcLotto[i] = (int)(Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
						pcLotto[i]=input;//입력받은 숫자를  myLotto배열에 저장
						for (int k = 0; k < i; k++) {
							if (myLotto[i]==myLotto[k]) {
								System.out.println(" 이미 입력한 숫자입니다. ");
								i--;	//i의 값1 감소
								break;	//중복 확인 반복 종료
						}
					}
				}
			}
		
		System.out.println();
		System.out.print("PC 로또 번호:");
		for (int i = 0; i <pcLotto.length; i++) {
			System.out.print(pcLotto[i]+" ");
		}
		
		//각자의 로또 번호 출력
		System.out.print("당첨 로또 번호:");
		for (int i = 0; i <myLotto.length; i++) {
			System.out.print(myLotto[i]+" "); 
		}
		
		//사용자와 PC의 로또 번호 비교
//		if () {
//			sum++;
//		}
		
		System.out.println();
		System.out.println("일치하는 숫자는:"+sum);		//일치하는 숫자의 갯수
		if(sum==6) {								//결과
			System.out.println("1등입니다!");	
//		} else if(sum==5 && (myLotto==pcLotto[7])) {
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
