package basic;
import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//가위바위보 게임
		//가위바위보를 숫자말고 한글로 입력받기 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("- - - - 가 위 바 위 보 - - - -");
		System.out.println(" 1.사람 vs 컴퓨터 ");
		System.out.println(" 2.사람 vs 사람(준비 중) ");
		System.out.println(" 3.종료");
		System.out.print(" >>선택: ");
		int num = sc.nextInt();
		int user1 = 0;
		String com1 = null;
		
		switch (num) {
		case 1 : 
			//1.
			System.out.println("- - - - - - - - - - - - -");
			System.out.println(" 컴퓨터와 대결을 시작합니다! ");
			System.out.println(" 가위/바위/보 중 하나를 입력하세요:");
			System.out.print(" >> ");
			String user = sc.next();
			switch (user) {
			case "가위" : user1=1; 	break;
			case "바위" : user1=2;	break;
			case "보"  : user1=3; 	break;
			default : System.out.println(" 잘못 입력하셨습니다.");
			}
			int com = (int)(Math.random() * 3) + 1;
			switch (com) {
			case 1 : com1="가위";		break;
			case 2 : com1="바위";		break;
			case 3 : com1="보";		break;
			default : System.out.println(" 잘못 입력하셨습니다.");
			}
			System.out.println(" >> 컴퓨터: "+ com1 +" vs. 사람: " + user);
			switch (user1-com) {
			case 2 : case -1: System.out.println(" >> YOU LOSE");	break;
			case 1 : case -2: System.out.println(" >> YOU WIN");	break;
			default: 		  System.out.println(" >> DRAW");		break;
			}
			break;
		case 2 : 
			//2.
			System.out.println("- - - - - - - - - - - - -");
			System.out.println(" 아직 준비중 입니다.");
			System.exit(0);
			break;
		case 3 :
			//3.
			System.out.println("- - - - - - - - - - - - -");
			System.out.println(" 게임을 종료합니다.");
			System.exit(0);
		default :
			System.out.println("- - - - - - - - - - - - -");
			System.out.println(" 메뉴에 없는 값이 선택되었습니다. 종료합니다.");
			System.exit(0);
		}
		sc.close();
		
	}//END main()

}