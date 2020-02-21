package com.iu.t6;

import java.util.ArrayList;
import com.iu.t1.weather.WeatherVO;

public class ListTest2 {

	public static void main(String[] args) {		
		ArrayList<String> ar= new ArrayList<String>();
		ar.add("first");	//String타입
		ar.add("second");
		
		String s = ar.get(0);
		
		ArrayList<Integer> ar1 = new ArrayList<>();	//int형이 아닌 ref type인 Integer
		ar1.add(12);
		
		ArrayList<WeatherVO> wVo = new ArrayList<WeatherVO>();

	}

}
