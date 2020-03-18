package com.iu.account;

import java.util.ArrayList;

public class AccountView {
	public void view(ArrayList<AccountDTO> ar) {
		for(AccountDTO accountDTO : ar) {
			System.out.println("계좌번호:"+accountDTO.getAccountNum());
			System.out.println("잔액:"+accountDTO.getAccountBalance());
		}
	}
}
