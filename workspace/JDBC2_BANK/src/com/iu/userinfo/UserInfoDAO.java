package com.iu.userinfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.util.DBConnect;

//SELECT * FROM ACCOUNTINFO
public class UserInfoDAO {
		public ArrayList<UserInfoDTO> selectList() throws Exception {
			Connection con = DBConnect.getConnection();
			PreparedStatement st = null;
			ResultSet rs = null;

			ArrayList<UserInfoDTO> ar = new ArrayList<UserInfoDTO>();
			String sql = "SELECT * FROM USERINFO";
			st = con.prepareStatement(sql);
			rs = st.executeQuery();

			while (rs.next()) {
				UserInfoDTO userInfoDTO = new UserInfoDTO();
				userInfoDTO.setUSER_ID(rs.getString(1));
				userInfoDTO.setUSER_PASSWORD(rs.getString(2));
				userInfoDTO.setUSER_NAME(rs.getString(3));
				userInfoDTO.setUSER_PHONE(rs.getString(4));
				userInfoDTO.setUSER_EMAIL(rs.getString(5));			
				
				ar.add(userInfoDTO);
			}

			rs.close();
			st.close();
			con.close();

			System.out.println("연결 성공");
			return ar;
		}
}
