package com.iu.t2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamTest1 {
	public void keyInput2() throws IOException {
		System.out.print("입력:");
		InputStream is = System.in;	//키보드 연결, Byte처리
		InputStreamReader ir = new InputStreamReader(is); //char타입 변환
		BufferedReader br = new BufferedReader(ir);
		String str = br.readLine();
		System.out.print("출력:"+str);
		
		br.close();
		ir.close();
		is.close();
	}
	
	public void keyInput() throws IOException {
		System.out.print("입력:");
		InputStream is = System.in;
		int result = is.read();
		char ch = (char)result;
		System.out.print("출력:"+ch);
		
		//연결 끊기
		is.close();
	}

}
