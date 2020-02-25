package com.iu.t2;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public void write() {
		FileWriter fw = null;
		try {
			String str = "sql World\r\n";
			fw = new FileWriter("c:\\test\\test2.txt", true);
			fw.write(str);
			//버퍼를 강제로 비우는 메소드
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
