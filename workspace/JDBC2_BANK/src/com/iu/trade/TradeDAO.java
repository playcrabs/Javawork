package com.iu.trade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.userinfo.UserInfoDTO;
import com.iu.util.DBConnect;

public class TradeDAO {
	//SELECT * FROM TRADE
	public ArrayList<TradeDTO> selectList() throws Exception {
		Connection con = DBConnect.getConnection();
		PreparedStatement st = null;
		ResultSet rs = null;

		ArrayList<TradeDTO> ar = new ArrayList<TradeDTO>();
		String sql = "SELECT * FROM TRADE";
		st = con.prepareStatement(sql);
		rs = st.executeQuery();

		while (rs.next()) {
			TradeDTO tradeDTO = new TradeDTO();
			tradeDTO.setACCOUNT_NUM(rs.getDouble(1));
			tradeDTO.setTRADE_DAY(rs.getDate(2));
			tradeDTO.setTRADE_AMOUNT(rs.getDouble(3));
			tradeDTO.setACCOUNT_BALANCE(rs.getString(4));
			tradeDTO.setTRADE_IO(rs.getString(5));

			ar.add(tradeDTO);
		}

		rs.close();
		st.close();
		con.close();

		System.out.println("연결 성공");
		return ar;
	}
}
