package com.iu.t5;
import java.util.*;

import com.iu.t1.weather.WeatherVO;

public class StringTokenTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =0;
		
		StringBuffer sb = new StringBuffer();
		sb.append("seoul,28,눈,60");
		sb.append("jeju,35,비,90");
		sb.append("busan,-52,흐림,10");
		sb.append("incheon,95,맑음,5");
		
		StringTokenizer st = new StringTokenizer(sb.toString());
		WeatherVO [] weatherVO = new WeatherVO[st.countTokens()/4];
		while(st.hasMoreTokens()) {
			WeatherVO wVO = new WeatherVO();
			wVO.setArea(st.nextToken());
			wVO.setHum(st.nextToken());
			wVO.setTemp(st.nextToken());
			wVO.setWea(st.nextToken());
			weatherVO[i]=wVO;
			i++;
		}
		
		for (WeatherVO w : weatherVO) {
			System.out.println("도시:"+w.getArea());
			System.out.println("온도:"+w.getHum());
			System.out.println("날씨:"+w.getWea());
			System.out.println("습도:"+w.getTemp());
		}

	}

}
