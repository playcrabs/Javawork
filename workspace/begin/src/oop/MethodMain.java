package oop;

class Method{
	//메소드 정의-------------------------------------------------
	//접근제한자 리턴타입 메소드 이름 (형식매개변수타입 변수명, ... (생략가능)){
	//		   메소드 내부에서 처리할 내용들
	//		   리턴타입은 반환값이 있는 경우에는 반환 데이터 타입을 표시
	//					      없는 경우에는 void표시
	//return 반환값 또는 반환값이 저장된 변수; //리턴타입이 명시된 경우에 사용
	//}
	
	//메소드 호출--------------------------------------------------
	//	메소드(실매개변수, ...생략 가능);
	
	//1.반환값이 없고 매개변수가 없는 method() 작성
	//	기능; 반환값X, 매개변수X 출력
	public void method() {
		System.out.println("반환값X, 매개변수X");
	}
	
	//2.반환값이 없고 문자열 하나를 매개변수로 받는 method()작성
	//	기능: 반환X, 매개변수O
	//	매개변수의 값: ~~~출력
	public void method(String arg) {
		System.out.println("반환값X, 매개변수O");
		System.out.println("매개변수의 값:"+arg);
	}
	
	//3.정수형 데이터를 매개변수로 넘겨받아서 
	//	2배한 값을 반환하는 method() 작성
	//	추가기능: 반환값O, 매개변수O
	//			매개변수의 값:~~~~
	//			반환값	:~~~~~ 
	public int method(int arg) {
	System.out.println("반환값O, 매개변수O");
	System.out.println("매개변수의 값:"+arg);
	System.out.println("반환값:"+(arg*2));
	
	return (arg*2);
	}
	
	//4.매개변수는 받지않고 실수형 데이터를 반환하는 method작성
	//	기능은 반환값 O, 매개변수 X
	//		 반환값: 0.05 출력
//	public double method() { >>반환타입이 다르더라도 매개변수의 형태가 같다면 이름이 달라야한다
		public double todayrate() {
		System.out.println("반환값O, 매개변수X");
		
		return 0.05;
	}
		
	//5.정수형 데이터 3개를 매개변수로 넘겨받아 합계를 반환하는 .
	//	sum() 작성
	public int sum(int q, int w, int e) {
		System.out.println("반환값O, 매개변수 3개");
		//int sum=arg+arg2+arg;
		return q+w+e; //return sum;
	}
	
	//6.이름, 혈액형, 별자리를 매개변수 하나로 넘겨받아서 
	//	화면에 출력받는 method작성
	public void method3(String[] info) {
		for (int i = 0; i < info.length; i++) {
			System.out.print(info[i]+" \t");
		}
		return;
	}
	
	//#.EX
	public void exex(String[] ex) {
		for (int i = 0; i < ex.length; i++) {
			System.out.print(ex[i]);
		} //ex1, ex2, ex3....
		return;
	}
	
	//7.이름이랑 성적(국영수)을 받는 method작성
	public void grade(String name,int[]score) {
		int sum = 0;
		System.out.print("이름:"+name);
		for (int i:score) {
			System.out.print(i+"\t");
			sum += i;	
		}
		System.out.println("총점:"+sum);
	}
	
	//8.임의의 정수들을 매개변수 1개로 받아서 합산하는 method작성
	//public void name(int[] all) {
		public void name(int ... all) {  //
		int sum=0;
		System.out.println("총점:");
		for (int i:all) {
			sum += i;	
		}
		System.out.println(all.length+"개의 합계:"+sum);
	}
	
		
}//END Method

public class MethodMain {
	public static void main(String[] args) {
		//Method클래스의 반환값이 없고 매개변수가 없는 메소드 호출
		Method m = new Method();
		System.out.println("-----XXX-----");
		System.out.println();
		
		System.out.println("--------반환값 X, 매개변수는 정수형 배열--------");
		//int[] all=new int[]{};
		//m.name(all);
		//m.name(new int[]{})
		m.name(1,2,3,4,5);
		
		System.out.println("------반환값X, 매개변수2개-------");
		String name= "신우";
		int[] score=new int[] {10,20,30,40};
		m.grade(name, score);
		//m.grade("이름",new int[]{10,20,30,40})
		System.out.println();

		System.out.println("-----EX-----");
		String[] ex=new String[] {"예시","입니다"};
		System.out.println("반환값이 있음, 매개변수는 for");
		m.exex(ex);
		System.out.println();
		
		
		System.out.println("-------이름,별자리,혈액형------");
		String[] info = new String[]{"name","star","O"};
		System.out.print("반환값O, 매개변수 1개");
		System.out.println("\n이름\t별자리\t혈액형\t");
		m.method3(info);
		System.out.println();
		
		//Method 클래스의 정수형을 매개변수로 받아서 반환하는 메서드를 호출하여
		//반환되는 값을 result변수애 저장한 후 return data: ~~~로 출력
		//단, 매개변수의 값은 33로 지정
		System.out.println("-----Method call 33-----");
		int result=m.method(33);
		System.out.println("return data:"+result);
		
		//Method클래스의 정수형을 매개변수로 받아서 반환하는 메소드 호출
		//단, 매개변수의 값은 3로 지정
		System.out.println("-----Method call 3-----");
		m.method(3);
				
		//Method클래스의 반환값이 없고 매개변수가 있는 메소드 호출
		//단, 매개변수의 값은 argument로 지정
		System.out.println("-----argument-----");
		m.method("argument");
		
		//Method 클래스의 매개변수는 없고, 실수형을 반환하는 메소드 호출
		System.out.println("-----Method call-----");
		double rrate=m.todayrate();		
		System.out.println(rrate);
		
		//Method 클래스의 매개변수는 없고, 실수형을 반환하는 메소드를 호출하여
		//반환되는 값을 rate에 저장한 후, 이 값을 이용하여
		//오늘의 대출 이율~~%로 출력
		System.out.println("-----todayrate-----");
		double rate=m.todayrate();		
		System.out.println((int)(rate*100)+"%"); //%.0f%%\n
		
		//Method 클래스의 인스턴스 mm을 생성
		//mm을 이용하여 정수형 데이터 3개를 매개변수로 받는 메소드를 호출하여
		//반환되는 값을 화면에 출력
		System.out.println("-----매개변수 3개의 합------");
		int mm=m.sum(3,3,3);
		//int sum=arg+arg2+arg;
		System.out.println(mm);
		//syso(mm.method(3,3,3));
		
		
	}

}
