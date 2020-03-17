package com.iu.bankbook;

public class BankBookDTO {
	//멤버변수의 변수명과 타입은 테이블의 컬럼과 동일
	//모든 멤버변수의 접근제어자는 private
	//getter|setter
	//생성자는 기본생성자 필요
	
	private String BookNumber;
	private String BookName;
	private String BookContents;
	private Double BookRate;
	private int BookSale;
	public String getBookNumber() {
		return BookNumber;
	}
	public void setBookNumber(String bookNumber) {
		BookNumber = bookNumber;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getBookContents() {
		return BookContents;
	}
	public void setBookContents(String bookContents) {
		BookContents = bookContents;
	}
	public Double getBookRate() {
		return BookRate;
	}
	public void setBookRate(Double bookRate) {
		BookRate = bookRate;
	}
	public int getBookSale() {
		return BookSale;
	}
	public void setBookSale(int bookSale) {
		BookSale = bookSale;
	}
	
	

}
