package com.iu.userinfo;

import java.util.ArrayList;

public class UserInfoView {
	public void view(ArrayList<UserInfoDTO> ar) {
		for (UserInfoDTO userInfoDTO : ar) {
			System.out.println("USER_ID			:"+userInfoDTO.getUSER_ID());
			System.out.println("USER_PASSWORD	:"+userInfoDTO.getUSER_PASSWORD());
			System.out.println("USERT_NAME		:"+userInfoDTO.getUSER_NAME());
			System.out.println("USER_PHONE		:"+userInfoDTO.getUSER_PHONE());
			System.out.println("USER_EMAIL		:"+userInfoDTO.getUSER_EMAIL());
			System.out.println("------------------------------");
		}
	}
}
