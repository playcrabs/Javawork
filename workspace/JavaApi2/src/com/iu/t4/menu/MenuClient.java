package com.iu.t4.menu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MenuClient {

	public static void main(String[] args) {
		// client

		Scanner scanner = new Scanner(System.in);
		Socket sc = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		ArrayList<MenuVO> ar = new ArrayList<MenuVO>();
		MenuClientUtil util = new MenuClientUtil();
		MenuClientView mv = new MenuClientView();

		// new Socket("접속할 서버의 IP", 사용할포트번호)
		//
		try {
			sc = new Socket("211.238.142.215", 8282);
			System.out.println("접속 성공");

			os = sc.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);

			is = sc.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);

			boolean flag = true;
			while (true) {
				System.out.println("1. 점심");
				System.out.println("2. 저녁");
				System.out.println("3. 종료");
				String select = scanner.next();

				bw.write(select + "\r\n");
				bw.flush();

				if (select.equals("3")) {
					break;
				}

				String str = br.readLine();
				System.out.println(str);

				MenuVO menuVO = util.makeMenu(str);

				ar.add(menuVO);

			} // while 끝

			// 출력문 호출
			mv.view(ar);
			ar = new ArrayList<MenuVO>();
			MenuVO menuVO = new MenuVO();
			ar.add(menuVO);

			// 해시맵
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			for (MenuVO m: ar) {
				// 메뉴명으로 맵에 정보가 있는지 확인
				// 있으면 해당 메뉴의 value 1증가
				// 없으면 map에 추가 value 1추가
				boolean bl = map.containsKey(menuVO.getMenuName());
				System.out.println(bl);
				if (bl = true) {
				int count = map.get(m.getMenuName());
				count++;
				map.put(m.getMenuName(), 1);
				}
				if (bl = false) {
					map.put(menuVO.getMenuName(), menuVO.getMenuPrice()+1);
				}
			}

			Iterator<String> it  = map.keySet().iterator();
			while (it.hasNext()) {
				String key = it.next();
				System.out.println("메뉴명:"+key);
				System.out.println("갯수:"+map.get(key));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
