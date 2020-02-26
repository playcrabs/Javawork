package com.iu.t4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SeverEx {

	public static void main(String[] args) {
//		클라이언트접속
//		1오면 점심메뉴 랜덤 출력, 전송
//		2오면 저녁	     ...	...	
//		3오면 종료
//		lunch.txt/dinner.txt 에 메뉴 넣어서 뽑기

		String menu = "삼겹살-10, 갈비-10, 초밥-10, 치킨-10, 햄버거-10, 피자-10, 족발-10, 굶기-0";
		String[] menus = menu.split(",");

		String menu2 = "곱창-10, 회-10, 양꼬피-10, 마라탕-10, 짜장면-10, 볶음밥-10, 쌀국수-10, 굶기-0";
		String[] menus2 = menu2.split(",");

		ServerSocket ss = null;
		Socket sc = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		// -----------------------------
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		boolean check = true;

		System.out.println("서버 대기중...");
		try {
			ss = new ServerSocket(8282);
			sc = ss.accept();
			System.out.println("클라이언트 연결 성공");
			System.out.println(">>Server");

			while (check) {
				os = sc.getOutputStream();
				ow = new OutputStreamWriter(os);
				bw = new BufferedWriter(ow);
				is = sc.getInputStream(); // byte
				ir = new InputStreamReader(is); // char
				br = new BufferedReader(ir); // String
				String message = br.readLine();
				System.out.println("Client:" + message);
				if (message.equals("1")) {
					//System.out.println("점심메뉴 랜덤");
					bw.write("추천 메뉴는 " + menus[(int) (Math.random() * 7) + 1] + "\r\n");
					//System.out.println("저녁메뉴 추천:" + menus[(int) (Math.random() * 7) + 1]);
					bw.flush();
				}
				if (message.equals("2")) {
					//System.out.println("저녁메뉴 랜덤");
					bw.write("추천 메뉴는 " + menus2[(int) (Math.random() * 7) + 1] + "\r\n");
					//System.out.println("저녁메뉴 추천:" + menus2[(int) (Math.random() * 7) + 1]);
					bw.flush();
				}
				if (message.equals("3")) {
					//System.out.println("종료");
					bw.write("종료합니다.\r\n");
					//System.out.println("종료합니다");
					bw.flush();
					check = false;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				ir.close();
				is.close();
				bw.close();
				ow.close();
				os.close();
				sc.close();
				ss.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
