package com.iu.trade;

import java.sql.Date;

public class TradeDTO {
	private Double ACCOUNT_NUM;
	private Date TRADE_DAY;
	private Double TRADE_AMOUNT;
	private String ACCOUNT_BALANCE;
	private String TRADE_IO;
	public Double getACCOUNT_NUM() {
		return ACCOUNT_NUM;
	}
	public void setACCOUNT_NUM(Double aCCOUNT_NUM) {
		ACCOUNT_NUM = aCCOUNT_NUM;
	}
	public Date getTRADE_DAY() {
		return TRADE_DAY;
	}
	public void setTRADE_DAY(Date tRADE_DAY) {
		TRADE_DAY = tRADE_DAY;
	}
	public Double getTRADE_AMOUNT() {
		return TRADE_AMOUNT;
	}
	public void setTRADE_AMOUNT(Double tRADE_AMOUNT) {
		TRADE_AMOUNT = tRADE_AMOUNT;
	}
	public String getACCOUNT_BALANCE() {
		return ACCOUNT_BALANCE;
	}
	public void setACCOUNT_BALANCE(String aCCOUNT_BALANCE) {
		ACCOUNT_BALANCE = aCCOUNT_BALANCE;
	}
	public String getTRADE_IO() {
		return TRADE_IO;
	}
	public void setTRADE_IO(String tRADE_IO) {
		TRADE_IO = tRADE_IO;
	}
	
	
	

}
