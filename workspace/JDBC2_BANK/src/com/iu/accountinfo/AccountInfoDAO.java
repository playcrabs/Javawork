package com.iu.accountinfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.bankbook.BankBookDTO;
import com.iu.util.DBConnect;

//SELECT * FROM ACCOUNTINFO
public class AccountInfoDAO {
	public ArrayList<AccountInfoDTO> selectList() throws Exception {
		Connection con = DBConnect.getConnection();
		PreparedStatement st = null;
		ResultSet rs = null;

		ArrayList<AccountInfoDTO> ar = new ArrayList<AccountInfoDTO>();
		String sql = "SELECT * FROM ACCOUNTINFO";
		st = con.prepareStatement(sql);
		// st.executeQuery() //SELECT
		// st.executeUpdate() //UPDATE INSERT DELETE
		rs = st.executeQuery();

		while (rs.next()) {
			AccountInfoDTO accountInfoDTO = new AccountInfoDTO();
			accountInfoDTO.setACCOUNT_NUM(rs.getDouble(1));
			accountInfoDTO.setUSER_ID(rs.getString(2));
			accountInfoDTO.setBOOK_NUMBER(rs.getString(3));
			accountInfoDTO.setACCOUNT_BAL(rs.getString(4));
			accountInfoDTO.setACCOUNT_DAY(rs.getDate(5));
			
			ar.add(accountInfoDTO);
		}

		rs.close();
		st.close();
		con.close();

		System.out.println("연결 성공");
		return ar;

	}

}
