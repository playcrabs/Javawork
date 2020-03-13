package com.iu.accountinfo;

import java.sql.Date;

public class AccountInfoDTO {
	private Double ACCOUNT_NUM;
	private String USER_ID;
	private String BOOK_NUMBER;
	private String ACCOUNT_BAL;
	private Date ACCOUNT_DAY;
	
	public Double getACCOUNT_NUM() {
		return ACCOUNT_NUM;
	}
	public void setACCOUNT_NUM(Double aCCOUNT_NUM) {
		ACCOUNT_NUM = aCCOUNT_NUM;
	}
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	public String getBOOK_NUMBER() {
		return BOOK_NUMBER;
	}
	public void setBOOK_NUMBER(String bOOK_NUMBER) {
		BOOK_NUMBER = bOOK_NUMBER;
	}
	public String getACCOUNT_BAL() {
		return ACCOUNT_BAL;
	}
	public void setACCOUNT_BAL(String aCCOUNT_BAL) {
		ACCOUNT_BAL = aCCOUNT_BAL;
	}
	public Date getACCOUNT_DAY() {
		return ACCOUNT_DAY;
	}
	public void setACCOUNT_DAY(Date aCCOUNT_DAY) {
		ACCOUNT_DAY = aCCOUNT_DAY;
	}
}
