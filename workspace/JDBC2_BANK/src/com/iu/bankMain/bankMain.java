package com.iu.bankMain;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.iu.account.AccountDAO;
import com.iu.account.AccountDTO;
import com.iu.bankbook.BankBookController;
import com.iu.bankbook.BankBookDAO;
import com.iu.bankbook.BankBookDTO;
import com.iu.bankbook.BankBookService;
import com.iu.member.MemberDAO;
import com.iu.member.MemberDTO;
import com.iu.member.MemberFrontController;
import com.iu.member.MemberSession;
import com.iu.trade.TradeDAO;
import com.iu.trade.TradeDTO;
import com.iu.util.DBConnect;

public class bankMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BankBookController bankBookController = new BankBookController();
		MemberFrontController memberFrontController = new MemberFrontController();

		memberFrontController.start();
		bankBookController.start();
	}

}
