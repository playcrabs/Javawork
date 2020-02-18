package oop;

class Constructor{
	//생성자 Constructor
	//-클래스의 인스턴스를 생성할 때 단 한번만 호출되는 특수의 형태의 메소드
	//-객체의 구조를 인식시키고 생성되는 멤버변수들을 초기화하는 인스턴스 메소드
	// >인스턴스 생성시에 실행되어야 할 작업들을 정의
	//-클래스의 이름과 동일
	//-return타입 정의 불가
	// >void도 명시하면 안됨
	//-반드시 구현하지 않아도 됨
	// >생성자를 미구현시에 컴파일러에서 기본생성자를 추가해줌
	//-생성자 호출은 new키워드를 이용
	// 단, 같은 클래스의 다른 생성자는 this()를 사용
	//	    이때 반드시 생성자의 첫번째 줄에서 호출해야함
	
	//생성자 정의
	//접근제한자 생성자명/클래스명(매개변수타입 변수명,...,생략가능){
	//		  생성자에서 구현할 내용들
	// }
	
	//기본 생성자: 접근제한자 생성자명/클래스명(){}
	
	//문자열 타입의 인스턴스 멤버 변수 msg 선언
		String msg;
	
	//매개변수가 없는 기본생성자 오버로딩
	Constructor(){
		//현재 클래스의 문자클래스를 ...
		this("여기는 기본 생성자");
		System.out.println("기본생성자 호출됨");
		//this("여기는 기본 생성자");
		
	}
	
	//문자열하나를 매개변수로 넘겨받아 출력하는 생성자 작성
	public Constructor(String msg) {
		System.out.println("생성자의 매개변수:"+msg);
		//매개변수로 넘겨받은 문자열로 msg변수의 값을 초기화
		this.msg=msg;
	}
	
}//END class Constructor

public class ConstructorMain {
	public static void main(String[] args) {
		//Hello생성자를 매개변수로 Constructor 클래스의 객체 con2 생성
		Constructor con2 = new Constructor("헬로우 생성자");
		
		//constructor 클래스의 인스턴스 를 생성하여 con변수에 저장
		Constructor con = new Constructor(); //생성자가 호출되는 부분
		
		//constructor 클래스의 인스턴스 생성
		new Constructor();
		
		//con2의 msg변수의 값 출력
		//con의 msg 속성의 값 출력
		System.out.println(con2.msg);
		System.out.println(con.msg);
		
		
	}//END main()

}//END class
