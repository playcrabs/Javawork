package basic;
import java.util.Scanner;

public class TypeCastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		System.out.print("임의의 아스키 코드 숫자 하나를 입력해 주세요: "); //65>>A
		int i = scan.nextInt();
		char c = (char)i;
		//code = (char) code; -정해놓은 경우
		System.out.println("입력하신 아스키 코드에 해당하는 문자: "+c);

		System.out.print("임의의 문자 하나를 입력해 주세요: ");  //A>>65\
		String ss= scan.next();
		char cc=ss.charAt(0);
		int ii = (int)cc;
		System.out.println("입력하신 문자의 아스키코드: "+ii);		

	}

}
