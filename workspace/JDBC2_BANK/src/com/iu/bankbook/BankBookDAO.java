package com.iu.bankbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.util.DBConnect;

public class BankBookDAO {
	// 상품 판매 여부 업데이트
	public int update(BankBookDTO bankBookDTO) throws Exception {
		Connection con = DBConnect.getConnection();
		PreparedStatement st = null;

		ArrayList<BankBookDTO> ar = new ArrayList<BankBookDTO>();
		String sql = "UPDATE BANK SET BOOK_SALE=? WHERE BOOK_NUMBER=?";
		st = con.prepareStatement(sql);
		st.setInt(1, bankBookDTO.getBOOK_SALE());
		st.setString(2, bankBookDTO.getBOOK_NUMBER());

		int result = st.executeUpdate();

		st.close();
		con.close();

		return result;

	}

	public int insert(BankBookDTO bankBookDTO) throws Exception {
		Connection con = DBConnect.getConnection();
		PreparedStatement st = null;

		ArrayList<BankBookDTO> ar = new ArrayList<BankBookDTO>();
		String sql = "INSERT INTO BANK VALUES (?,?,?,?,?)";

		st = con.prepareStatement(sql);
		st.setString(1, bankBookDTO.getBOOK_NUMBER());
		st.setString(2, bankBookDTO.getBOOK_NAME());
		st.setString(3, bankBookDTO.getBOOK_CONTENTS());
		st.setDouble(4, bankBookDTO.getBOOK_RATE());
		st.setInt(5, bankBookDTO.getBOOK_SALE());

		int result = st.executeUpdate();

		st.close();
		con.close();

		return result;
	}

	public ArrayList<BankBookDTO> selectList() throws Exception {
		Connection con = DBConnect.getConnection();
		PreparedStatement st = null;
		ResultSet rs = null;

		ArrayList<BankBookDTO> ar = new ArrayList<BankBookDTO>();
		String sql = "SELECT * FROM BANKBOOK";
		st = con.prepareStatement(sql);
		// st.executeQuery() //SELECT
		// st.executeUpdate() //UPDATE INSERT DELETE
		rs = st.executeQuery();

		while (rs.next()) {
			BankBookDTO bankBookDTO = new BankBookDTO();
			bankBookDTO.setBOOK_CONTENTS(rs.getString(3));
			bankBookDTO.setBOOK_NAME(rs.getString(2));
			bankBookDTO.setBOOK_NUMBER(rs.getString(1));
			bankBookDTO.setBOOK_RATE(rs.getDouble(4));
			bankBookDTO.setBOOK_SALE(rs.getInt(5));
			ar.add(bankBookDTO);
		}

		rs.close();
		st.close();
		con.close();

		System.out.println("연결 성공");
		return ar;

	}

}
