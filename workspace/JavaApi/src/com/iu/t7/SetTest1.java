package com.iu.t7;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet
		HashSet<String> hs = new HashSet<String>();
		 hs.add("t1");
		 hs.add("t2");
		 hs.add("t3");
		 hs.add("t4");
		 hs.add("t1");
		 System.out.println("Size:"+hs.size());
		for(String s : hs) {
			System.out.println(s);
		}
		
		
		Iterator<String> ar = hs.iterator();	//ierator, Generic-String, 	컬렉션 데이터를 열거해 또 하나의 집합으로 만듬
		while ( ar.hasNext() ) {
			System.out.println(ar.next());
		} 

		
		 

	}

}
