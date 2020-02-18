package oop2;

public class accessModifier {
	//접근 제어자
	//클래스, 메소드. 변수, 생성등 접근을 제한하기 위해 사용
	//public: 접근제한X
	//protected: 같은 클래스/패키지, 하위클래스
	//defult: 같은 클래스/패키지
	//private: 같은 클래스, 변수의 값을 액세스하는 메소드를 public을 만들어서 사용
	
	//private로 선언된 멤버변수의 값을 저장하는 메소드
	//변수의 이름을 대문자로 만들면 안됨
	//-public void setNum(String num){
	//		this.num = num;
	//	}
	
	//private로 선언된 멤버변수의 값을 읽는 메소드
	//-public String getNum(){
	//		return num;
	//	}
	
	public 		String name;
	protected	int age;
				char level;
	private 	String num;
	
	//num의 값을 외부에서 액세스 할 수 있도록 setter/getter 작성
	public void setNum(String num) {
		this.num=num;
	}
	public String getNum() {
		return num;
	}
	
	
	
}
