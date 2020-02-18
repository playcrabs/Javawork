package oop2.ex;

//skill, Item 인터페이스 구현
public abstract class Player implements Skill, Item {
	private int x;
	private int y;
	private int heart;
	private int power;
	private int gold;
	private String name;
	
	//name을 매개변수로 넘겨받아서 초기화
	public Player(String name) {
		//heart는 Character인터페이스의 값 사용
		//power는 Character인터페이스의 값 사용
		this.name=name;
		heart = Character.HEART;
		power = Character.POWER;
		
		System.out.println("=====RPG GAME=====");
		System.out.println("캐릭터 이름 :" + name);
		System.out.println("HEART : ♥" + heart);
		//for (int i = 0; i < heart; i++) {System.out.print("♥");}
		System.out.println("POWER : ★" + power);
	}
		//heart의 값을 매개변수로 넘겨받아 변경하는 setHeart()작성
		//매개변수의 값을 멤버변수에 누적
		//[캐릭터 이름] HEART~~~증가 또는 ~~~~감소|현재 HEART : 하트그림
		public void setHeart(int heart) {
			System.out.println("["+name+"] HEART " + heart +
								(heart >=1 ? "증가" : "감소") +
								" | 현재  HEART : " + this.heart );
			this.heart += heart;
		}
	
		//power의 값을 매개변수로 넘겨받아 변경하는 setPower()작성
		//매개변수의 값을 멤버변수에 누적
		//[캐릭터 이름] POWER~~~증가 또는 ~~~~감소|현재 POWER : 별그림
		public void setPower(int power) {
			System.out.println("["+name+"] POWER " + power +
					(power >=1 ? "증가" : "감소") +
					" | 현재  POWER : " + this.power );
			this.power += power;
		}
		
		//gold의 값을 매개변수로 넘겨받아 변경하는 setGold() 작성
		//매개변수의 값을 멤버변수에 누적
		public void setGold(int gold) {
			this.gold += gold;
		}
		
		//name의 값을 반환하는 getName()작성
		public String getName() {
			return name;
		}
				
		//x와 y의 값을 매개변수로 넘겨받아 변경하는 setPosition() 작성
		//매개변수의 값으로 멤버변수값 변경
		public void setPosition(int x,int y) {
			this.x=x;
			this.y=y;
		}
		
}

//Player를 상속받는 하위클래스1,2 작성
//name을 매개변수로 받아서 부모 생성자에 전달하는 생성자 작성 //?
//부모 메소드 오버라이딩 1,2 하고 자체 메소드1
class Princess extends Player{

	public Princess(String name) {
		super(name);
	}
	@Override
	public void move(int x, int y) {
		System.out.println(getName()+"가 이동합니다.");
		System.out.println("x:"+x+"y:"+y);
		setHeart(1);
		setPosition(x, y);
	}
	@Override
	public void attack() {
		System.out.println(getName()+"가 공격합니다.");
		setPower(-1);
		setGold (1);
	}
	public void Heal() {
		System.out.println(getName()+"가 치유됩니다.");
		setHeart(3);
	}
	
}

class Knight extends Player{

	public Knight(String name) {
		super(name);
	}
	@Override
	public void move(int x, int y) {
		System.out.println(getName()+"가 이동합니다.");
		System.out.println("x:"+x+"y:"+y);
		setHeart(0);
		setPosition(x, y);
	}
	@Override
	public void attack() {
		System.out.println(getName()+"가 공격합니다.");
		setPower(3);
		setGold (0);
	}
	public void earn() {
		System.out.println(getName()+"가 보수를 받습니다.");
		setGold(3);
	}
	
}