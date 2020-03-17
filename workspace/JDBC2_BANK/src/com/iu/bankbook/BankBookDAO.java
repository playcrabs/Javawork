package com.iu.bankbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.util.DBConnect;

public class BankBookDAO {
	
	public long seqSelect()throws Exception{
		Connection con=null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		String sql="select bankBook_seq.nextval from dual";
		
		con = DBConnect.getConnection();
		
		st = con.prepareStatement(sql);
		rs = st.executeQuery();
		rs.next();
		
		long num = rs.getLong(1);
		
		rs.close();
		st.close();
		con.close();
		
		return num;
	}
	
	
	//상품 판매 여부 업데이트
	public int update(BankBookDTO bankBookDTO)throws Exception{
		int result=0;
		
		Connection con = null;
		PreparedStatement st = null;
		
		con = DBConnect.getConnection();
		
		String sql = "update bankBook set bookSale=? where bookNumber=?";
		
		st = con.prepareStatement(sql);
		
		st.setInt(1, bankBookDTO.getBookSale());
		st.setString(2, bankBookDTO.getBookNumber());
		
		result = st.executeUpdate();
		
		st.close();
		con.close();
		
		
		return result;
	}
	
	//상품 추가
	public int insert(BankBookDTO bankBookDTO)throws Exception{
		Connection con = DBConnect.getConnection();
		PreparedStatement st = null;
		
		String sql = "insert into bankbook values(?,?,?,?,?)";
		
		st = con.prepareStatement(sql);
		
		st.setString(1, bankBookDTO.getBookNumber());
		st.setString(2, bankBookDTO.getBookName());
		st.setString(3, bankBookDTO.getBookContents());
		st.setDouble(4, bankBookDTO.getBookRate());
		st.setInt(5, bankBookDTO.getBookSale());
		
		int result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
	} 
	
	//전체 정보 조회
	public ArrayList<BankBookDTO> selectList() throws Exception {
		Connection con = DBConnect.getConnection();
		PreparedStatement st = null;
		ResultSet rs = null;
		
		ArrayList<BankBookDTO> ar = new ArrayList<BankBookDTO>();
		
		
		
		String sql="SELECT LPAD(bookNumber, 10, '0') as booknumber, bookname, bookcontents, bookrate, booksale FROM BANKBOOK";
		
		st = con.prepareStatement(sql);
		
		//st.executeQuery() //SELECT
		//st.executeUpdate()  //INSERT, UPDATE, DELETE
		rs = st.executeQuery();
		
		while(rs.next()) {
			BankBookDTO bankBookDTO = new BankBookDTO();
			bankBookDTO.setBookContents(rs.getString("bookContents"));
			bankBookDTO.setBookName(rs.getString("bookName"));
			bankBookDTO.setBookNumber(rs.getString("bookNumber"));
			bankBookDTO.setBookRate(rs.getDouble("bookRate"));
			bankBookDTO.setBookSale(rs.getInt("bookSale"));
			ar.add(bankBookDTO);
		}
		
		rs.close();
		st.close();
		con.close();
		
		return ar;
		
	}

}

