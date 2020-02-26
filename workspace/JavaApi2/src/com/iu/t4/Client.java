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
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// 서버와 연결해서 Hello문자열 전송
		// java = ip:port -> Socket
		// 가격을 받아오면 - 기준으로 잘라서 뒤에있는 값을 더해 출력
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

		// 서버와 접속
		try {
			sc = new Socket("211.238.142.215", 8282); // 221
			System.out.println("---서버와의 접속 성공");
			System.out.println("---Client");

			while (check) {
				System.out.print("Client:");
				String message = scan.next();
				os = sc.getOutputStream(); // byte
				ow = new OutputStreamWriter(os); // char
				bw = new BufferedWriter(ow); // String
				bw.write(message + "\r\n");
				bw.flush();
				//System.out.println("---메세지 전송 성공");

				if (message.equals("bye")) {
					System.out.println("---종료");
					check = false;
				}

				// 서버로부터 메세지를 받아 출력
				//System.out.println("---답장 대기중");
				is = sc.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);

				String message2 = br.readLine();
				System.out.println("Server:" + message2);

				if (message2.equals("bye")) {
					System.out.println("---종료");
					check = false;
				}

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
		System.out.println("---클라이언트 종료");
	}

}
