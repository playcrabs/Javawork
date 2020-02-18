package basic;
import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//가위바위보 게임
		Scanner sc = new Scanner(System.in);
		
		System.out.println("- - - - 가 위 바 위 보 - - - -");
		System.out.println(" 1.사람 vs 컴퓨터 ");
		System.out.println(" 2.사람 vs 사람(준비 중) ");
		System.out.println(" 3.종료");
		System.out.print(" >>선택: ");
		int num = sc.nextInt();
		
		switch (num) {
		case 1 : 
			//1.
			System.out.println("- - - - - - - - - - - - -");
			System.out.println(" 컴퓨터와 대결을 시작합니다! ");
			System.out.println( "가위(1)/바위(2)/보(3) 중 하나를 입력하세요:");
			System.out.print(" >>");
			int user = sc.nextInt();
			int com = (int)(Math.random() * 3) + 1;
			System.out.println(" >> 컴퓨터: "+ com +" vs. 사람: " + user);
			switch (user-com) {
			case 2 : case -1:
				System.out.println(" >> YOU LOSE");
				break;
			case 1 : case -2:
				System.out.println(" >> YOU WIN");
				break;
			case 0:
				System.out.println(" >> DRAW");
				break;
			}
			break;
		case 2 : 
			//2.
			System.out.println("- - - - - - - - - - - - -");
			System.out.println(" 아직 준비중 입니다.");
			break;
		case 3 :
			//3.
			System.out.println("- - - - - - - - - - - - -");
			System.out.println(" 게임을 종료합니다.");
			System.exit(0);
		default :
			System.out.println("- - - - - - - - - - - - -");
			System.out.println(" 메뉴에 없는 값이 선택되었습니다. 종료합니다.");
		}
		
	}//END main()

}
