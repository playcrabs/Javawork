package com.iu.t7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.*;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class MapTest1 {

	public static void main(String[] args) {
	HashMap<String, String> map = new HashMap<String, String>();
	map.put("t1", "iu");
	map.put("t2", "suzi");
	
	System.out.println(map.get("t2"));
	
	map.put("key2", "Kim");
	
	//기존의 데이터를 없애고 새로운 값 삽입
	System.out.println(map.get("t2"));
	
	//map.clear();
	System.out.println("----method----");
	System.out.println(map.containsKey("t2"));
	System.out.println(map.size());
	
	//keySet() - 키 중복X
	Set<String> keys = map.keySet();
	System.out.println("----keySet----");
	for(String s : keys) {
		System.out.println(s);
		System.out.println(map.get(s));
	}
	


//	Iterator<String> k = map.keySet().iterator();
//	 while (k.hasNext()) {
//		 String s = k.next();
//		System.out.println(k.next());
//		
//	}
	
	}

}
