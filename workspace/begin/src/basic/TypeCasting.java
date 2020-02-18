package basic;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//type casting 
		//값의 타입을 다른 타입으로 벼환
		//boolean을 제외한 기본형 사이에 가능
		//기본형과 참조형은 불가
		//묵시적 형변환
		//-값의 범위가 작은 타입을 큰 타입으로 변경하는 경우
		//-자동으로 형변환되므로 생략 가능
		//명시적 형변환
		//-값의 범위가 큰 타입을 작은타입으로 변경하는 경우
		//-값 손실이 발생할 수 있음
		//(변경하려는 타입)변수 또는 데이터
		
		//명시적 형변환
		float f = 1.6f;
		//int i = f; 불가능, float를  int로 형변환 할 수 없음
		int i = (int)f;
		System.out.println(i); 	//값 손실이 발생
		
		//묵시적 형변환
		int ii = 4;
		float ff = ii;
		System.out.println(ff);
		
		double d = i;
		System.out.println(i);
		
		byte a = 10;
		byte b = 20;
		byte c = 10 + 20;
		c = (byte)(a + b); //int형으로 연산이 이루어진걸 담을 수 없음
		System.out.println(c);
		
		i = 1000000000;
		long l = i * (long)10;
		System.out.println(l);
		
	}

}
