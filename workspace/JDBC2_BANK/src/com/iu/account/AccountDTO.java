package com.iu.account;

import java.sql.Date;

public class AccountDTO {
	private Long AccountNum;
	private String MemberID;
	private String BookNumber;
	private Long AccountBalance;
	private Date AccountDate;
	public Long getAccountNum() {
		return AccountNum;
	}
	public void setAccountNum(Long accountNum) {
		AccountNum = accountNum;
	}
	public String getMemberID() {
		return MemberID;
	}
	public void setMemberID(String memberID) {
		MemberID = memberID;
	}
	public String getBookNumber() {
		return BookNumber;
	}
	public void setBookNumber(String bookNumber) {
		BookNumber = bookNumber;
	}
	public Long getAccountBalance() {
		return AccountBalance;
	}
	public void setAccountBalance(Long accountBalance) {
		AccountBalance = accountBalance;
	}
	public Date getAccountDate() {
		return AccountDate;
	}
	public void setAccountDate(Date accountDate) {
		AccountDate = accountDate;
	}
	
	
	
	
}
