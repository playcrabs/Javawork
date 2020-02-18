package oop2.ex2;

import java.util.*;

public class MenuMain {
	// Scanner공유
	static final Scanner SCAN = new Scanner(System.in);

	public void menu() {
		System.out.println("- - - - - - REVIEW ALL - - - - - -");
		System.out.println("1. 가위 바위 보 게임");
		System.out.println("2. 로또");
		System.out.println("3. 빙고");
		System.out.println("4. RPG");
		System.out.println("5. 종료");
		System.out.print("선 택  >>");
	}

	// MAIN
	public static void main(String[] args) {
		MenuMain m = new MenuMain();
		m.menu();
		int s = SCAN.nextInt();
		//while문으로 돌리기
		while (true) {
			if (s == 1) {
				gbb g = new gbb();
				g.game1();
			} else if (s == 2) {

			} else if (s == 3) {

			} else if (s == 4) {

			} else if (s == 5) {
				System.exit(0);
			} else {
				System.out.println("다시 입력해 주십시오.");
			}	
		}
	}

}

class gbb {
	public static void game1()
	{
		// TODO Auto-generated method stub
		// 가위바위보 게임
		// 가위바위보를 숫자말고 한글로 입력받기
		Scanner sc = new Scanner(System.in);
		int num;
		int user1 = 0;
		String com1 = null;
		boolean a = true;

		// while? do while ok.
		do {
			System.out.println("- - - - 가 위 바 위 보 - - - -");
			System.out.println(" 1.사람 vs 컴퓨터 ");
			System.out.println(" 2.사람 vs 사람(준비 중) ");
			System.out.println(" 3.종료");
			System.out.print(" >>선택: ");
			num = sc.nextInt();

			game:do {
				menu: switch (num) {
				case 1:
					System.out.println("- - - - - - - - - - - - -");
					System.out.println(" 컴퓨터와 대결을 시작합니다! ");
					System.out.println(" 가위/바위/보 중 하나를 입력하세요:");
					System.out.print(" >> ");
					String user = sc.next();
					switch (user) {
					case "가위":
						user1 = 1;
						break;
					case "바위":
						user1 = 2;
						break;
					case "보":
						user1 = 3;
						break;
					default:
						System.out.println(" 잘못 입력하셨습니다. 다시 입력해주세요!");
						break menu;
					}
					int com = (int) (Math.random() * 3) + 1;
					switch (com) {
					case 1:
						com1 = "가위";
						break;
					case 2:
						com1 = "바위";
						break;
					case 3:
						com1 = "보";
						break;
					}
					System.out.println(" >> 컴퓨터: " + com1 + " vs. 사람: " + user);
					switch (user1 - com) {
					case 2:
					case -1:
						System.out.println(" >> YOU LOSE");
						System.out.print("게임을 다시 하겠습니까? >> ");
						String answer = sc.next();
						if ("y".equals(answer)) {
							break menu;
						} else {
							break game;
						}
					case 1:
					case -2:
						System.out.println(" >> YOU WIN");
						System.out.print("게임을 다시 하겠습니까? >> ");
						answer = sc.next();
						if ("y".equalsIgnoreCase(answer)) { // 대소문자구분X, continue-제일가까운 while문으로
							break menu;
						} else {
							break game;
						}
					default:
						System.out.println(" >> DRAW");
						System.out.print("게임을 다시 하겠습니까? >> ");
						answer = sc.next();
						if ("y".equals(answer)) {
							break menu;
						} else {
							break game;
						}
					}
				case 2:
					// 2.
					System.out.println("- - - - - - - - - - - - -");
					System.out.println(" 아직 준비중 입니다.\n");
					break game;
				case 3:
					// 3.
					System.out.println("- - - - - - - - - - - - -");
					System.out.println(" 게임을 종료합니다.");
					a = false;
					break game;
				default:
					System.out.println("- - - - - - - - - - - - -");
					System.out.println(" 메뉴에 없는 값이 선택되었습니다. 다시 입력해주세요.\n");
					break game;
				}
			} while (true);
		}while(a);
	} // END main();
}


