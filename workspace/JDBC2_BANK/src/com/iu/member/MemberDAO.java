package com.iu.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.util.DBConnect;

public class MemberDAO {
	
	//login
	public MemberDTO login(MemberDTO memberDTO)throws Exception{
		
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		con = DBConnect.getConnection();
		
		String sql ="select * from member where memberId=? and memberPw=?";
		
		st = con.prepareStatement(sql);
		
		st.setString(1, memberDTO.getMemberID());
		st.setString(2, memberDTO.getMemberPW());
		
		rs = st.executeQuery();
		
		if(rs.next()) {
			memberDTO.setMemberName(rs.getString("memberName"));
			memberDTO.setMemberPhone(rs.getString("memberPhone"));
			memberDTO.setMemberEmail(rs.getString("memberEmail"));
		}else {
			memberDTO = null;
		}
		
		rs.close();
		st.close();
		con.close();
		
		return memberDTO;
		
	}
	
	//Delete
	public int delete(MemberDTO memberDTO)throws Exception{
		int result=0;
		Connection con = null;
		PreparedStatement st = null;
		
		con=DBConnect.getConnection();
		
		String sql = "delete member where memberId=?";
		
		st = con.prepareStatement(sql);
		
		st.setString(1, memberDTO.getMemberID());
		
		result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
		
	}
	
	
	//Insert
	public int insert(MemberDTO memberDTO)throws Exception{
		int result=0;
		Connection con = null;
		PreparedStatement st = null;
		
		con = DBConnect.getConnection();

		String sql="insert into member values (?,?,?,?,?)";
		
		st = con.prepareStatement(sql);
		
		st.setString(3, memberDTO.getMemberName());
		st.setString(1, memberDTO.getMemberID());
		st.setString(2, memberDTO.getMemberPW());
		st.setString(4, memberDTO.getMemberPhone());
		st.setString(5, memberDTO.getMemberEmail());
		
		result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
	}
	
	
	
	//List
	public ArrayList<MemberDTO> selectList() throws Exception{
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		ArrayList<MemberDTO> ar = new ArrayList<MemberDTO>();
		
		con = DBConnect.getConnection();
		
		String sql = "select * from member";
		
		st = con.prepareStatement(sql);
		
		rs = st.executeQuery();
		
		while(rs.next()) {
			MemberDTO memberDTO = new MemberDTO();
			memberDTO.setMemberID(rs.getString("memberID"));
			memberDTO.setMemberPW(rs.getString("memberPW"));
			memberDTO.setMemberName(rs.getString("memberName"));
			memberDTO.setMemberPhone(rs.getString("memberPhone"));
			memberDTO.setMemberEmail(rs.getString("memberEmail"));
			ar.add(memberDTO);
		}
		
		rs.close();
		st.close();
		con.close();
		
		return ar;
	}


}

