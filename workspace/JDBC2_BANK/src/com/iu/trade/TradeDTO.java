package com.iu.trade;

import java.sql.Date;

public class TradeDTO {
	private Long accountNum;
	private Date tradeDate;
	private Long tradeAmount;
	private Long accountBalance;
	private String tradeIO;
	
	public Long getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(Long accountNum) {
		this.accountNum = accountNum;
	}
	public Date getTradeDate() {
		return tradeDate;
	}
	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}
	public Long getTradeAmount() {
//		if(this.getTradeIO().equals("O")) {
//			this.tradeAmount=this.tradeAmount*-1;
//		}
		return tradeAmount;
	}
	public void setTradeAmount(Long tradeAmount) {
		
		this.tradeAmount = tradeAmount;
	}
	public Long getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(Long accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getTradeIO() {
		return tradeIO;
	}
	public void setTradeIO(String tradeIO) {
		this.tradeIO = tradeIO;
	}
	
	

}
