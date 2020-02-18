package oop;

public class Factorial {
	//정수형 하나를 매개변수로 받아서 팩토리얼 연산을 한 결과를
	//long 타입으로 반환하는 factorial()작성
	//기능: 매개변수값이 1이면 전달된 값 그대로 반환하고,
	//		그렇지않으면 재귀호출로 팩토리얼 연산을 수행하여 반환값을 계산
	public long factorial(int num) {
		System.out.println("num:"+num);
		long result = 0;
		if (num == 1 ) {
			result = 1;
		} else
			result = num * factorial(num-1);
		
		return result;
	}

}
