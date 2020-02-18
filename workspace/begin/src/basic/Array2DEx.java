package basic;

public class Array2DEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 시력계산
		System.out.println("no.\t왼쪽\t오른쪽\t평균");
		double eye[][] = {{1.2,1.5,},{0.2,0.8,},{1.8,1.3}};
		double sum=0;
		
		for (int i = 0; i < eye.length; i++) {
			System.out.print(i+1+"\t");
			for (int j = 0; j < eye[1].length; j++) {
				System.out.print(eye[i][j]+"\t");
			}
			sum = eye[i][0]+eye[i][1]; //평균출력
			System.out.printf("%.1f",sum/eye[i].length);
			System.out.println();
		}
		

	}

}
