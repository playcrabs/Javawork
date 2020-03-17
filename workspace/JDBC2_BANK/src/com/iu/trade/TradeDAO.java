package com.iu.trade;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.iu.util.DBConnect;

public class TradeDAO {
	
	//insert
	public int insert(TradeDTO tradeDTO, Connection con)throws Exception{
		
		PreparedStatement st = null;
		int result=0;
		
		
		
		String sql="insert into trade values (?, sysdate, ?, ?, ?)";
		
		st = con.prepareStatement(sql);
		
		st.setLong(1, tradeDTO.getAccountNum());
		st.setLong(2, tradeDTO.getTradeAmount());
		st.setLong(3, tradeDTO.getAccountBalance());
		st.setString(4, tradeDTO.getTradeIO());
		
		result = st.executeUpdate();
		
		st.close();
		
		return result;
	}
	
	
	
	
	
	//list

}
