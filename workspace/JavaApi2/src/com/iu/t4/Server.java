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

public class Server {

	public static void main(String[] args) {
		// 클라이언트와 접속이 되면 문자열을 받아서 출력 후 종료
		Scanner scan = new Scanner(System.in);
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

		try {
			System.out.println("---서버 대기중");
			ss = new ServerSocket(8282);
				sc = ss.accept();
				System.out.println("---클라이언트 연결 성공");
				System.out.println("---Server");

			while (check) {
				is = sc.getInputStream(); // byte
				ir = new InputStreamReader(is); // char
				br = new BufferedReader(ir); // String

				String message = br.readLine();
				System.out.println("Client:" + message);

				if (message.equals("bye")) {
					System.out.println("---종료");
					check = false;
				}

				// 출력 후, 서버에서 메세지 입력받아 클라이언트로 전송
				//System.out.println("---클라이언트와의 접속 성공");
				System.out.print("Server:");
				String message2 = scan.next();
				os = sc.getOutputStream();
				ow = new OutputStreamWriter(os);
				bw = new BufferedWriter(ow);
				bw.write(message2 + "\r\n");
				bw.flush();
				//System.out.println("---답장 성공");

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
