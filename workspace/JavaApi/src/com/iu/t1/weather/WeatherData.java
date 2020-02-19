package com.iu.t1.weather;

public class WeatherData {
	private String data;
	public WeatherData() {
		//생성자, WeatherData객체 생성시 호출
		//지역명,온도,날씨,습도
		data = "seoul,28,눈,60,jeju,35,비,90";
		data = data + ",busan,-52,흐림,10,incheon,95,맑음,5" ;	
	}

	//메서드 공식 - 접근제어자 리턴타입 메소드이름([매개변수선언]){}
	//makeInfo()메소드 - data파싱, weatherVO[] 리턴
	public WeatherVO[] makeInfo(){
		String [] ar = data.split(",");
		WeatherVO wVO = null ;
		//WeatherVO wVO = new WeatherVO(); >>4바이트 할당
		WeatherVO[] weathers = new WeatherVO[4];
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			wVO = new WeatherVO();
			wVO.setArea(ar[i]);
			wVO.setHum(ar[++i]);
			wVO.setTemp(ar[++i]);
			wVO.setWea(ar[++i]);
			weathers[count]=wVO;
			count++;
		}
		
		return weathers;
	}
}
