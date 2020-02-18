package basic;

public class WhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		// while문을 이용해 1부터 10사이 홀수들의 합
		int i=1;
		int sum=0;
		while(i<11) {
			sum += i;
			i+=2;
		}
		System.out.println("홀수의 합:"+sum);
	}

}
