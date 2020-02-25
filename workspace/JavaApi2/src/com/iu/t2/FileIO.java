package com.iu.t2;

import java.io.File;

public class FileIO {

	public void FileInfo() {
		// 파일의 정보를 담고있는 객체 생성
		// 파일의 위치, 이름
		File file = new File("C:\\test", "hello.txt");
		// file = new File("c:\\test\\hello.txt");
		// file = new File("c:\\test\\hello");

		// 파일의 존재 여부
		System.out.println(file.exists());
		// 파일명
		System.out.println(file.getName());
		// 경로명(상대경로,절대경로)
		System.out.println(file.getPath());
		System.out.println(file.getPath());
		// 해당 패스에서 디렉토리(폴더)가 존재하는지 확인. 없으면 false 리턴
		System.out.println(file.isDirectory());
		// 해당 파일이 있는지 확인. 없으면 false 리턴
		System.out.println(file.isFile());

		System.out.println("-----파일리스트-----");
		file = new File("c:\\test");
		System.out.println(file.isDirectory());
		String[] names = file.list();

		System.out.println("-----디렉토리여부-----");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
			file = new File("C:\\test\\" + names[i]);
			if (file.isDirectory()) {
				System.out.println("디렉토리입니다.");
			}
			if (file.isFile()) {
				System.out.println("디렉토리가 아닙니다.");
			}
		}

		System.out.println("-----파일명출력------");
		file = new File("c:\\test");
		File[] files = file.listFiles();
		for (File f : files) {
			System.out.println(f.getName());
		}

		System.out.println("-----존재여부확인-----");
		file = new File("c:\\test");
		File file2 = new File(file, "hello.txt");
		System.out.println(file2.exists());
		file2 = new File(file, "t1");
		System.out.println(file2.exists());

		System.out.println("-----파일생성-----");
		file = new File("c:\\test\\t2");
		file.mkdir();
		// false
		file = new File("c:\\test\\t3\\s1");
		System.out.println(file.mkdirs());

		System.out.println("-----FileEx1-----");
		FileEx1 fe = new FileEx1();
		fe.makeDir();
		fe.randomMakeDir();
		System.out.println("완료");

	}

	public void fileDelete() {
		//지우려는 파일안에 파일있으면 안지워짐
		File file = new File("c:\\test\\hello.txt");
		System.out.println("-----파일삭제-----");
		file.delete();
		System.out.println("");
	}
}
