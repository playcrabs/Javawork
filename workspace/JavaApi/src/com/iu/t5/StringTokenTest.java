package com.iu.t5;
import java.util.*;

public class StringTokenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String token = "seoul,28,눈,60";
		StringTokenizer st = new StringTokenizer(token,",");
		
		System.out.println("토큰의 갯수:"+st.countTokens());
		
		while ( st.hasMoreTokens()  ) {
			String s = st.nextToken();
			System.out.println(s);
		}
	}

}
