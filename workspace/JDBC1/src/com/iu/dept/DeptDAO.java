package com.iu.dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DeptDAO {
	public DeptDTO selectOne(DeptDTO deptDTO) {
		DeptDTO dto = null;
		String user = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@192.168.56.101:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";

		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		// 데이터를 담는 ArrayList
		ArrayList<DeptDTO> ar = new ArrayList<DeptDTO>();

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			System.out.println("로그인 성공");
			String query = "SELECT * FROM DEPT WHERE = (?)";
			st = con.prepareStatement(query);
			st.setInt(1, deptDTO.getDeptno());
			rs = st.executeQuery();
			if(rs.next()) {
				dto = new DeptDTO();
				dto.setDeptno(rs.getInt("deptno"));
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("Loc"));
			} 

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				st.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return deptDTO;
	}

	public ArrayList<DeptDTO> selectList() {
		// 1.정보
		String user = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@192.168.56.101:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";

		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		// 데이터를 담는 ArrayList
		ArrayList<DeptDTO> ar = new ArrayList<DeptDTO>();

		// 2.메모리 로딩
		try {
			// 3.로그인 연결
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			System.out.println("로그인 성공");
			// 4.쿼리문 작성
			String query = "SELECT * FROM DEPT ORDER BY DEPTNO ASC";
			// 5.쿼리문 미리보내기
			st = con.prepareStatement(query);
			// 6.?값 세팅
			// 7.최종전송
			rs = st.executeQuery(); // select문만
			// 1개의 next row를 읽고 true|false
			// 데이터가 있으면 rs의 어딘가에 row저장
			while (rs.next()) {
				DeptDTO deptDTO = new DeptDTO();
				int deptno = rs.getInt("deptno");
				deptDTO.setDeptno(deptno);
				String dname = rs.getString("dname");
				deptDTO.setDname(dname);
				String loc = rs.getString("loc");
				deptDTO.setLoc(loc);

				ar.add(deptDTO);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				st.close();
				con.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// 8.close
		return ar;
	}

	public int delete(DeptDTO deptDTO) {
		// 지우기
		String user = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@192.168.56.101:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";

		Connection con = null;
		PreparedStatement st = null;
		int result = 0;

		try {
			Class.forName(driver);
			System.out.println("메모리 로딩 성공");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("로그인 성공");

			String query = "DELETE DEPT WHERE DEPTNO=(?)";
			st = con.prepareStatement(query);
			st.setInt(1, deptDTO.getDeptno());

			result = st.executeUpdate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				st.close();
				con.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return result;
	}

	public int insert(DeptDTO deptDTO) {
		// 1.접속할때 필요한 정보
		// ip, port, id, pw, sid
		String user = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@192.168.56.101:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";

		Connection con = null;
		PreparedStatement st = null;
		int result = 0;
		// 2. driver를 객체생성 메모리에 로딩
		try {
			Class.forName(driver);
			System.out.println("메모리 로딩 성공");

			// 3. 로그인 후 Connection 반환
			con = DriverManager.getConnection(url, user, password);
			System.out.println("로그인 성공");
			// 4. Query문 작성
			String query = "INSERT INTO DEPT VALUES (?,?,?)";
			// 5. PreparedStatement Query문 미리 전송
			st = con.prepareStatement(query);
			// 6. ? 값 세팅
			st.setInt(1, deptDTO.getDeptno());
			st.setString(2, deptDTO.getDname());
			st.setString(3, deptDTO.getLoc());

			// 7. 최종 ? 전송 후 결과를 처리
			result = st.executeUpdate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				st.close();
				con.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return result;

	}

}
