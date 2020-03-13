package com.iu.bankbook;

public class BankBookDTO {
	//멤버변수의 변수명과 타입은 테이블의 컬럼과 동일
	//모든 멤버변수의 접근제어자는 private
	//getter|setter
	//생성자는 기본생성자 필요
	
	private String BOOK_NUMBER;
	private String BOOK_NAME;
	private String BOOK_CONTENTS;
	private Double BOOK_RATE;
	private int BOOK_SALE;
	
	public String getBOOK_NUMBER() {
		return BOOK_NUMBER;
	}
	public void setBOOK_NUMBER(String bOOK_NUMBER) {
		BOOK_NUMBER = bOOK_NUMBER;
	}
	public String getBOOK_NAME() {
		return BOOK_NAME;
	}
	public void setBOOK_NAME(String bOOK_NAME) {
		BOOK_NAME = bOOK_NAME;
	}
	public String getBOOK_CONTENTS() {
		return BOOK_CONTENTS;
	}
	public void setBOOK_CONTENTS(String bOOK_CONTENTS) {
		BOOK_CONTENTS = bOOK_CONTENTS;
	}
	public Double getBOOK_RATE() {
		return BOOK_RATE;
	}
	public void setBOOK_RATE(Double bOOK_RATE) {
		BOOK_RATE = bOOK_RATE;
	}
	public int getBOOK_SALE() {
		return BOOK_SALE;
	}
	public void setBOOK_SALE(int bOOK_SALE) {
		BOOK_SALE = bOOK_SALE;
	}
	
	

}
