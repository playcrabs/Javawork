package programmers;
import java.util.Scanner;

public class StarSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("n을 입력:");
        int n = sc.nextInt();
        System.out.print("m을 입력:");
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
        	
			for (int j = 0; j < m; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
