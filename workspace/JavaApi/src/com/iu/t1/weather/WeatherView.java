package com.iu.t1.weather;

public class WeatherView {
	//메소드명 view
	//매개변수로 WeatherVO[] 받아서 모든 날씨 정보를 출력
	
	public void view(WeatherVO [] weathers) {
		for (int i = 0; i < weathers.length; i++) {
			WeatherVO weatherVO = weathers[i];
			this.view(weatherVO);
		}
		
	}
	
	//오버로딩
	//클래스 내에서 선언된 메소드명이 같고 매개변수의 데이터타입/갯수가 다름
	public WeatherVO view(WeatherVO weatherVO) {
		if ( weatherVO != null ) {
			System.out.println("도시:"+weatherVO.getArea());
			System.out.println("온도:"+weatherVO.getHum());
			System.out.println("날씨:"+weatherVO.getWea());
			System.out.println("습도:"+weatherVO.getTemp());
		}
		return null;
	}
}
