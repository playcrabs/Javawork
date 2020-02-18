package oop2.ex;

public class PlayGame {

	public static void main(String[] args) {
		//객체 1,2의 이동/공격/default/자체 메소드 호출
		Princess p =new Princess("공주");
		Knight k =new Knight("기사");
		
		System.out.println(p);
		System.out.println(k);
		System.out.println("===Game Start !! ===");
		
		p.attack();
		k.attack();
		//Item인터페이스의 공유메소드 호출

	}

}
