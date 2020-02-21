package com.iu.t6;

import java.util.ArrayList;
import java.util.WeakHashMap;

import com.iu.t1.weather.WeatherVO;

public class ListTes1 {

	public static void main(String[] args) {
		//ArrayList
		ArrayList ar = new ArrayList();
		
		//Data추가 add
		ar.add("first");
		ar.add(2);	//ar.add(new Integer(2)); >> auto Boxing
		ar.add(3.12);
		ar.add(new WeatherVO());
		ar.add(1, 'A');
		
		ar.set(1, 'B');		//해당인덱스, 번호 내용에 삽입
		
		ar.remove(0);		//해당 인덱스 삭제
		
		//ar.clear();		//내용 전부 삭제
		
		//길이 size()
		System.out.println("ar.size():"+ar.size());
		
		System.out.println("ar이 비어있는가? "+ar.isEmpty());
		
		//
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(i+1+"번째:"+ar.get(i));
		}
		
	}

}
