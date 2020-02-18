package oop;

public class VariableInit {
	//변수의 초기화
	//-변수에 처음 값을 저장하는 것
	
	int num;	 //멤버변수: 기본값으로 자동 초기화
	int sum = 5; //지역변수: 사용 전 반드시 초기화 필요
	
	//멤버 변수: 명시적 초기화(explicit initialization)
	
	//생성자를 이용한 멤버 변수의 초기화
	//num과 sum의 값을 매개변수로 받아서 초기화
	VariableInit(int sum, int num){
		this.num = num;
		this.sum = sum;
		System.out.println("생성자 호출됨");
	}
	
	//초기화 블럭
	//-클래스 초기화 블럭
	//	static{		}
	static {
		System.out.println("클래스 초기화 블럭");
	}
	
	//-인스턴스 초기화 블럭
	//	생성자에서 공통적으로 수행되는 작업 사용
	//	인스턴스가 생성될 때마다 (생성자보다 먼저) 실행 됨
	//	{	}
	{	System.out.println("인스턴스 초기화블럭");		}
	
}
