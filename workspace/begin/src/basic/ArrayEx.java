package basic;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 국어 성적 99 , 88, 77, 66, 33을 저장하는 배열 변수 korArr
		int sum = 0;
		int j=0;
		int[] korArr =new int[]{99, 88, 77, 66, 33};
		System.out.println("- - - - 국 어 점 수 - - - -");
		for (int i = 0; i < korArr.length; i++) {
			System.out.println(i+"번의 국어 점수:"+korArr[i]);
			sum += korArr[j];	
			j++;
		}
		System.out.println("전체 인원 수:"+korArr.length);
		System.out.println("국어 성적의 합계:"+sum);
		System.out.printf("국어 성적의 평균:%.2f",sum/(double)korArr.length);
	}

}
