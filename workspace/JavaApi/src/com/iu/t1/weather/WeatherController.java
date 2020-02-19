package com.iu.t1.weather;

import java.util.Scanner;

public class WeatherController {
	public void start() {
		//1.날씨정보 초기화
		//2.날씨정보 출력
		//3.프로그램 종료
		Scanner scan = new Scanner(System.in);
//		for (int i = 0; i < 1; i++) {
//			System.out.println("1.날씨정보 초기화");
//			System.out.println("2.날씨정보 출력");
//			System.out.println("3.프로그램 종료");
//			System.out.print("번호를 입력해주세요:");
//	        int num = scan.nextInt();
//	        
//	        if (num == 1) {
//	        	System.out.println("날씨 정보를 초기화합니다.");
//	        	i--;}
//	        if (num == 2) {
//	        	System.out.println("날씨 정보를 출력합니다.");
//	        	i--;}
//	        if (num == 3) {
//	        	System.out.println("종료합니다.");
//	        	System.exit(0);}
//		}
		boolean check = true;
		WeatherData weatherDate = new WeatherData();
		WeatherView weatherView = new WeatherView();
		WeatherService weatherService = new WeatherService();
		WeatherVO [] weatherVOs = null;
		WeatherVO weatherV =null;
		while (check) {
			System.out.println("1.날씨정보 초기화");
			System.out.println("2.날씨정보 출력");
			System.out.println("3.날씨정보 검색");
			System.out.println("4.프로그램 종료");
			System.out.print("번호를 입력해주세요:");
	        int num = scan.nextInt();
	        System.out.println("----------------------");
	        switch (num) {
			case 1:
	        	System.out.println("<<날씨 정보를 초기화합니다>>");
	        	weatherVOs = weatherDate.makeInfo();
				break;
			case 2:
	        	System.out.println("<<날씨 정보를 출력합니다>>");
	        	weatherView.view(weatherVOs);
				break;
			case 3:
			    System.out.println("<<날씨 정보를 검색합니다>>");
			    weatherV = weatherService.search(weatherVOs);
			    weatherView.view(weatherV);
				break;
			default:
				System.out.println("<<종료합니다>>");
				check=false;
				break;
			}
			
		}
		
		
		
	}
}
