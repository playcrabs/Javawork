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
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientEx {

	public static void main(String[] args) {
//		서버접속
//		1.점심메뉴
//		2.저녁메뉴
//		3.종료
//		합계 출력
		Scanner scan = new Scanner(System.in);
		Socket sc = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		// -----------------------------
		ServerSocket ss = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		boolean check = true;
		int count = 0;

		try {
			sc = new Socket("211.238.142.215", 8282);
			System.out.println("---서버와의 접속 성공");
			System.out.println("---Client");

			while (check) {
				System.out.println("1.점심메뉴");
				System.out.println("2.저녁메뉴");
				System.out.println("3.종료");
				System.out.print(">>");
				String message = scan.next();
				os = sc.getOutputStream(); // byte
				ow = new OutputStreamWriter(os); // char
				bw = new BufferedWriter(ow); // String
				bw.write(message + "\r\n");
				bw.flush();

				if (message.equals("3")) {
					System.out.println("종료합니다");
					check = false;
					break;
				}

				//입력받기
				is = sc.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);

				String message2 = br.readLine();
				System.out.println("Server:" + message2);
				
				String [] array = message2.split("-");
				count += Integer.parseInt(array[1]);
				System.out.println("총합:"+count);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				ow.close();
				os.close();
				br.close();
				ir.close();
				is.close();
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
