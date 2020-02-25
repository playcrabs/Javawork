package com.iu.t2;

import java.io.File;
import java.util.Calendar;
import java.util.Scanner;

public class FileEx1 {

	public void makeDir() {
		// 생성할 폴더명을 입력받아서 폴더를 생성
		// 중복된 폴더명이 발생시 경고, 생성여부확인
		Scanner scan = new Scanner(System.in);
		System.out.print("생성할 폴더명을 입력:");
		String name = scan.next();

		File file = new File("c:\\test", name);

		// 중복검사
		if (file.exists()) {
			// name.equals(file.getName())
			System.out.println("존재하는 폴더명 입니다.");
		} else {
			file.mkdir();
		}

	}

	public void randomMakeDir() {
		// 임의의 이름으로 자동으로 만들어지는 폴더
		// 중복된 이름이 존재해서는 안됨
		Calendar calander = Calendar.getInstance();
		System.out.println("폴더가 생성됩니다.");
		String name = calander.getTimeInMillis() + "";
		// String.valueOf(name);
		File file = new File("c:\\test", name);

		// 시간 생성
		System.out.println("생성한 폴더:" + file);
		file.mkdir();
	}

}