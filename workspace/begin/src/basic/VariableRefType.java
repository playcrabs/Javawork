package basic;

public class VariableRefType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		//참조 자료형 변수의 선언
		String name;
		
		//참조 자료형 변수의 생성
		//name = new String("Kim");
		name = new String();
		System.out.println(name);
		
		//참조 자료형 변수의 값 변경
		name = "Lee";
		System.out.println(name);
		
		//String 타입의 참조 자료형 변수 str을 선언 및 생성
		String str = new String();
		System.out.println(str);
		str = "str data";
		System.out.println(str);
		
		//String 타입의 참조 자료형 변수 str2을 선언 및 생성하면서 초기화
		String str2 = new String("str2");
		System.out.println(str2);
		
		//java.util.Date 타입의 참조 자료형 변수 now 생성
		java.util.Date now = new java.util.Date();
		System.out.println(now);
		System.out.println(now.toLocaleString());
		
		//문자열 변수  str3을 선언하면서 Hello로 초기화
		String str3 = "Hello";
		System.out.println(str3);
	}

}
