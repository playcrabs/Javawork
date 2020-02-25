package com.iu.t2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	public void read() {
		// 파일 내용 자바로 출력
		// 1. 파일 정보를 저장하는 객체 생성
		File file = new File("c:\\test", "test.txt");
		FileReader fr = null;
		BufferedReader br = null;
		String str = null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			//같은 결과물
			while ((str=br.readLine()) != null) {
				System.out.println(str);
			}
//			while (true) {
//				str = br.readLine();
//				if (str == null) {
//					break;
//				}
//				System.out.println(str);
//			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
