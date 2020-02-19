package com.iu.t1.weather;

public class WeatherVO {
	//데이터를 운반하는 요소
	//지역명,온도,날씨,습도
	//모든 멤버변수는 private, 데이터타입은 String
	private String area;
	private String temp;
	private String wea;
	private String hum;
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	public String getWea() {
		return wea;
	}
	public void setWea(String wea) {
		this.wea = wea;
	}
	public String getHum() {
		return hum;
	}
	public void setHum(String hum) {
		this.hum = hum;
	}
	
	
	
}
