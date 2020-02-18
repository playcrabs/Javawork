package oop2;

class Product{
	int price;
	int bounsPoint;
}

class TV extends Product{	}
class Computer extends Product{	}
class Audio extends Product{	}

class Buyer{
	int money = 10000;
	int bonusPoint = 0;
	
//	//TV객체를 매개변수로 받고 반환값은 없는 buy()작성
//	public void buy(TV tv) {
//		System.out.println("TV를 구매합니다.");
//	}
//	//Computer 인스턴스를 매개변수로 받고 반환값은 없는 buy() 오버로딩
//	public void buy(Computer com) {
//		System.out.println("Computer를 구매합니다.");
//	}
//	//Audio객체를 참조변수로 받고 반환값은 없는 buy() 오버로딩
//	public void buy(Audio audio) {
//		System.out.println("Audio를 구매합니다.");
//	}
	
	public void buy(Product product) {
		System.out.println(product.getClass().getName()+"를 구매합니다.");
	}
	
}

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		TV tv = new TV();
		Computer com = new Computer();
		Audio audio = new Audio();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
	}

}
