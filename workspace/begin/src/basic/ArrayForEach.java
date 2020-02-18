package basic;

public class ArrayForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		String[] strArr = new String[]{"Hello","Hi","Bye"};
		System.out.println("strArr의 출력:"+strArr[0]);
		System.out.println("strArr의 출력:"+strArr[1]);
		System.out.println("strArr의 출력:"+strArr[2]);
		System.out.println();
		
		for (int i = 0; i < strArr.length; i++) {
			System.out.println("strArr["+i+"]번째의 출력: "+strArr[i]);
		}
		System.out.println();
		
		for(String s : strArr) {
			System.out.println(s);
		}
		
		int[] iArr= new int[]{1,2,3,4,5};
		for(int i : iArr) {
			System.out.println(i);
		}
		
		for (int i : iArr) {
			System.out.println(i);
		}

	}

}
