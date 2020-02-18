package oop2.ex;

public interface Item {
	//정수형 값 100을 갖는 상수 POTION, 200을 갖는 상수 WEAPON
	//같은 패키지 내에서만 접근 가능한 공유메소드 helpItem() 작성 및 구현
	//매개변수 : 없음
	//반환값: 없음
	//기능: "[도움말] 아이템을 구매하려면 골드가 필요합니다." 출력
	final int POTION =100;
	final int WEAPON =200;
	static void helpItem() {
		System.out.println("[도움말] 아이템을 구매하려면 골드가 필요합니다.");
	}
}
