package com.iu.t1.weather;

import java.util.Scanner;


public class WeatherService {
	//메소드명: search, 매개변수로 weatherVO[] 선언
	//도시명을 입력받으면, 그 도시의 정보를 찾아서 출력(해당 객체 WeatherVO를 리턴)
	//없으면 null을 리턴
	public WeatherVO search(WeatherVO [] weathers) {
		Scanner scan = new Scanner(System.in);
		System.out.print("도시명을 입력해주세요:");
        String city = scan.next();
		WeatherVO weatherVO = null;
        for (int i = 0; i < weathers.length; i++) {
			if(weathers[i].getArea().equals(city)) {
				weatherVO = weathers[i];
			}
		}
        
		return weatherVO;
	}
	
}
