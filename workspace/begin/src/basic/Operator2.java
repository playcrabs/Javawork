package basic;
import java.util.*;

public class Operator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//아이디가 admin이면 "관리자 페이지", 그렇지 않으면 "일반 사용자 페이지" 츨력
		String s1 = "haha";
		String s2 = "hahahahah";
		String s3 = new String ("haha");
		String s4 = new String ("haha");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		String str1 = (s1.equals(s2)) ? "t" : "f";
		String str2 = (s1.equals(s3)) ? "t" : "f";
		String str3 = (s3.equals(s4)) ? "t" : "f";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----시스템 로그인-----");
		System.out.print("아이디: ");
		String id = sc.next();
		String who = (id.equals("admin")) ? "관리자 페이지" : "일반 사용자 페이지";
		//String who = (id == "admin") ? "관리자 페이지" : "일반 사용자 페이지"; -불가
		System.out.println(who);

	}

}
