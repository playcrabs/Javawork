
package oop2;

public abstract class Food {

	//속성 1,2

	private String color;

	private int money;

	public String getColor() {return color;}

	public void setColor(String color) {this.color = color;}

	public int getMoney() {return money;}

	public void setMoney(int money) {this.money = money;}

	//기능 1,2

	public void whatColor() {

		System.out.println(color+"색 입니다.");

	}

	public void whatMoney() {

		System.out.println("가격은"+money+"원 입니다.");

	}

	Food(){}

}



//Pizza

class Pizza extends Food{

	String taste;

	public Pizza(String taste) {

		super();

		this.taste = taste;

	}

	//GetterSetter

	public String getTaste() {

		return taste;

	}

	public void setTaste(String taste) {

		this.taste = taste;

	}

	Pizza(){}

	public String toString() {

		return "색은"+getColor()+

				"\n가격은 "+getMoney()+"원"+

				"\n맛은 "+getTaste();

	}

}