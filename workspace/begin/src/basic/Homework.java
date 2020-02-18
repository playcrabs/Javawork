package basic;
import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("- - - -B I N G O- - - -");
		Scanner scanner =new Scanner(System.in);
		int size;
		int x=0, y=0, num=0;
		
		//1.빙고판의 크기 입력받기
		System.out.print("빙고 크기를 입력하세요(1~6):");
		size = scanner.nextInt();
		
		int[][] bingo = new int[size][size];
		
		//배열의 모든 요소를 1부터  size*size까지
		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++) {
				bingo[i][j] = i*size + j + 1;
			}
		//배열에 저장된 값을 뒤섞는다
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				x = (int)(Math.random()*size);
				y = (int)(Math.random()*size);
				//bingo[i][j]와 임의로 선택된 값을 바꾼다
				int tmp = bingo[i][j];
				bingo[i][j]=bingo[x][y];
				bingo[x][y]=tmp;
			}
		}
		
		do {
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					System.out.printf("%2d ",bingo[i][j]);
				}
				System.out.println();
			}
			System.out.println();
			
			System.out.printf("%d까지의 숫자를 입력해주세요:",size*size);
			String tmp=scanner.nextLine();
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
		} while (num!=0);
				
			

		
	}//END main();

}//END class
