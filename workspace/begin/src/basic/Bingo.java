package basic;
import java.util.*;

public class Bingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 빙고판 만들기
		// -입력된 빙고판의 크기만큼 숫자 입력받기
		// -범위, 중복 체크하기 >> 저장
		// -가로,세로,대각선의 합?차?가 0이면 빙고
		// -숫자 입력받아서 빙고판 만들가도..?
		Scanner sc = new Scanner(System.in);
		System.out.println("- - - -B I N G O- - - -");
		
		int x,y,num=0;
		int size=0;
		int bingosum=0;
		int garo = 0,sero=0,cross1=0,cross2=0;

		//1.빙고판의 크기 입력받기
		System.out.print("빙고 크기를 입력하세요:");
		for (int i = 1; i < 2; i++) {
			size = sc.nextInt();
			if (size<1 || size>5) {
				System.out.print("2~5사이의 값으로 다시 입력해주세요:");
				i--;		//i값을 1감소 시킴
				continue;	//반복문을 다음 회차로
			} else {
				break;
			}
		}
		int[][] bingo = new int[size][size];

		//3.완성된 빙고판 출력
		System.out.println("빙고판이 완성되었습니다! 시작!");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				bingo[i][j]=i*size+j+1;
			}
		}
		
		//배열의 모든 요소를 1부터 size*size까지 초기화
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				x=(int)(Math.random()*size);
				y=(int)(Math.random()*size);
				int tmp=bingo[i][j];
				bingo[i][j]=bingo[x][y];
				bingo[x][y]=tmp;
			}
		}
		
		//4.숫자를 입력받아서 빙고게임시작
		System.out.println();
		//4.1입력받은 숫자에 해당하는 빙고판의 숫자를 0으로 변경
		do {
			//빙고판출력
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					System.out.printf("%02d ",bingo[i][j]);
				}
				System.out.println();
			}
			System.out.println();
			
			//빙고숫자입력
			System.out.printf("1~%d의 숫자를 입력하세요(종료:0): ",(size*size));
			String tmp = sc.next(); //다시는 nextLie안쓴다 ㅡㅡ
			num = Integer.parseInt(tmp);
			
			//입력받은 숫자와 같은 숫자가 저장된 요소를 찾아서 0을 저장
			outer:
				for (int i = 0; i < size; i++) {
					for (int j = 0; j < size; j++) {
						if (bingo[i][j]==num) {
							bingo[i][j] = 0;
							break outer;
						}
					}
				}
				
			// 빙고 판정
			End:
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {

					// 가로 판정
					if(j == 0) {
						int sum = 0;
						for(int y1=0; y1<size; y1++) {
							sum += bingo[i][y1];
						}
						if(sum == 0) {
							System.out.println(">>가로 빙고!");
							break End;
						}
					} 
					
					//세로 판정
					if(i == 0) {
						int sum = 0;
						for (int k = 0; k < size; k++) {
							sum += bingo[k][j];
						}
						if (sum ==0) {
							System.out.println(">>세로 빙고!");
							break End;
						}
					}
					
					//대각선 판정1
					if(i == j) {
						int sum = 0;
						for (int k = 0; k < size; k++) {
							sum += bingo[k][k];
						}
						if (sum ==0) {
							System.out.println(">>대각선 빙고!");
							break End;
						}
					}
					
					//대각선 판정2
					if(i+j==j) {
						int sum = 0;
						for (int k = 0; k < size; k++) {
							if (k+k==size-1) {
								sum++;
							}
							//sum += bingo[k][j]; //?????
						}
						if (sum ==0) {
							System.out.println(">>대각선 빙고!");
							break End;
						}
					}
				}
			}
			
		} while (num!=0);
		//가로세로대각선 방향에 배열을 만들고 누적시켜 빙고 계산
		
		
	}//END main();

}//END class