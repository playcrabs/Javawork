package com.iu.dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DeptDAO {
	
	//메소드 선언 공식
	//접근제어자 [그외제어자] 리턴타입 메소드명([매개변수 선언]){}
	public void delete(DeptDTO deptDTO) {
		//지우기
		String user = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@192.168.56.101:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		Connection con = null;
		PreparedStatement st = null;
		
		try {
			Class.forName(driver);
			System.out.println("메모리 로딩 성공");
			con =DriverManager.getConnection(url, user, password);
			System.out.println("로그인 성공");
			
			String query = "DELETE DEPT WHERE DEPTNO=(?)";
			st = con.prepareStatement(query);
			st.setInt(1, deptDTO.getDeptno());
			
			int result = st.executeUpdate();
			if (result > 0) {
				System.out.println(result+"행 이(가) 삭제되었습니다.");
			} else {
				System.out.println(result+"행 이(가) 삭제되었습니다.");
			}
			
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
	}
	
	public void insert(DeptDTO deptDTO) {
		//1.접속할때 필요한 정보
		//ip, port, id, pw, sid
		String user = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@192.168.56.101:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		Connection con = null;
		PreparedStatement st = null;
		
		//2. driver를 객체생성 메모리에 로딩
		try {
			Class.forName(driver);
			System.out.println("메모리 로딩 성공");
			
			//3. 로그인 후 Connection 반환
			con = DriverManager.getConnection(url, user, password);
			System.out.println("로그인 성공");
			//4. Query문 작성
			String query = "INSERT INTO DEPT VALUES (?,?,?)";
			//5. PreparedStatement Query문 미리 전송	
			st = con.prepareStatement(query);
			//6. ? 값 세팅
			st.setInt(1 ,deptDTO.getDeptno());
			st.setString(2, deptDTO.getDname());
			st.setString(3, deptDTO.getLoc());
			
			//7. 최종 ? 전송 후 결과를 처리
			int result = st.executeUpdate();
			if (result > 0) {
				System.out.println(result+"개 행 이(가) 업데이트되었습니다.");
			} else {
				System.out.println(result+"개 행 이(가) 업데이트되었습니다.");
			}
			
			
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
		
		
		
	}

}
