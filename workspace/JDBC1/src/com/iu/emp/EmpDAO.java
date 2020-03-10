package com.iu.emp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EmpDAO {
	//직원을 선택해 직원의 Sal, Comm을 입력받아 수정하는  update 
	public ArrayList<EmpDTO> update(EmpDTO empDTO) {
		// 1.접속할때 필요한 정보
		String user = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@192.168.56.101:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";

		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		ArrayList<EmpDTO> ar = new ArrayList<EmpDTO>();
		// 2. driver를 객체생성 메모리에 로딩
		try {
			Class.forName(driver);
			// 3. 로그인 후 Connection 반환
			con = DriverManager.getConnection(url, user, password);
			// 4. Query문 작성
			String query = "UPDATE EMP SET SAL=?,COMM=? WHERE ENAME=?";
			// 5. PreparedStatement Query문 미리 전송
			st = con.prepareStatement(query);
			// 6. ? 값 세팅
			st.setString(3, empDTO.getEname());
			st.setDouble(1, empDTO.getSal());
			st.setDouble(2, empDTO.getComm());
			// 7. 최종 ? 전송 후 결과를 처리
			rs = st.executeQuery();

			ar.add(empDTO);

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
		return ar;
		
	}
	
	//사원번호를 입력받아서 삭제 delete
	public ArrayList<EmpDTO> delete(EmpDTO empDTO) {
		// 1.접속할때 필요한 정보
		String user = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@192.168.56.101:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";

		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		ArrayList<EmpDTO> ar = new ArrayList<EmpDTO>();
		// 2. driver를 객체생성 메모리에 로딩
		try {
			Class.forName(driver);
			// 3. 로그인 후 Connection 반환
			con = DriverManager.getConnection(url, user, password);
			// 4. Query문 작성
			String query = "DELETE FROM EMP WHERE EMPNO=?";
			// 5. PreparedStatement Query문 미리 전송
			st = con.prepareStatement(query);
			// 6. ? 값 세팅
			st.setDouble(1, empDTO.getEmpno());
			// 7. 최종 ? 전송 후 결과를 처리
			rs = st.executeQuery();

			ar.add(empDTO);

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
		return ar;
		
	}
	
	//데이터를 받아서 직원을 추가하는 insert (dept=10,20,30, hiredate=현재시간)
	public static ArrayList<EmpDTO> insert(EmpDTO empDTO) {
		// 1.접속할때 필요한 정보
		String user = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@192.168.56.101:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";

		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		ArrayList<EmpDTO> ar = new ArrayList<EmpDTO>();
		// 2. driver를 객체생성 메모리에 로딩
		try {
			Class.forName(driver);
			// 3. 로그인 후 Connection 반환
			con = DriverManager.getConnection(url, user, password);
			// 4. Query문 작성
			String query = "INSERT INTO EMP VALUES(?,?,?,?,sysdate,?,?,?)";
			// 5. PreparedStatement Query문 미리 전송
			st = con.prepareStatement(query);
			// 6. ? 값 세팅
			st.setDouble(1, empDTO.getComm());
			st.setString(2, empDTO.getEname());
			st.setString(3, empDTO.getJob());
			st.setDouble(4, empDTO.getDeptno());
			st.setDouble(5, empDTO.getEmpno());
			st.setDouble(6, empDTO.getMgr());
			st.setDouble(7, empDTO.getSal());
			// 7. 최종 ? 전송 후 결과를 처리
			rs = st.executeQuery();

			ar.add(empDTO);

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
		return ar;
	}

	// 전체 직원의 월급+COMM의 합계 조회 countsal2
	public ArrayList<EmpDTO> countSal2() {
		// 1.접속할때 필요한 정보
		String user = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@192.168.56.101:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";

		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		ArrayList<EmpDTO> ar = new ArrayList<EmpDTO>();
		// 2. driver를 객체생성 메모리에 로딩
		try {
			Class.forName(driver);
			// 3. 로그인 후 Connection 반환
			con = DriverManager.getConnection(url, user, password);
			// 4. Query문 작성
			String query = "SELECT SUM(SAL+NVL(COMM,0)) AS S FROM EMP";
			// 5. PreparedStatement Query문 미리 전송
			st = con.prepareStatement(query);
			// 6. ? 값 세팅
			// 7. 최종 ? 전송 후 결과를 처리
			rs = st.executeQuery();
			rs.next();
			// 숫자로도 선택가능
			Double sal = rs.getDouble(1);
			System.out.println(sal);

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
		return ar;
	}

	// 전체 직원의 월급의 합계를 조회
	public ArrayList<EmpDTO> countSal() {
		// 1.접속할때 필요한 정보
		String user = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@192.168.56.101:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";

		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		ArrayList<EmpDTO> ar = new ArrayList<EmpDTO>();
		// 2. driver를 객체생성 메모리에 로딩
		try {
			Class.forName(driver);
			// 3. 로그인 후 Connection 반환
			con = DriverManager.getConnection(url, user, password);
			// 4. Query문 작성
			String query = "SELECT SUM(SAL) FROM EMP";
			// 5. PreparedStatement Query문 미리 전송
			st = con.prepareStatement(query);
			// 6. ? 값 세팅
			// 7. 최종 ? 전송 후 결과를 처리
			rs = st.executeQuery();
			rs.next();
			Double sal = rs.getDouble("SUM(SAL)");
			System.out.println(sal);

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
		return ar;
	}

	// 사원 이름 검색해서 리스트 뽑아오기
	public ArrayList<EmpDTO> searchList(String search) {
		// 1.접속할때 필요한 정보
		String user = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@192.168.56.101:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";

		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		ArrayList<EmpDTO> ar = new ArrayList<EmpDTO>();
		// 2. driver를 객체생성 메모리에 로딩
		try {
			Class.forName(driver);
			// 3. 로그인 후 Connection 반환
			con = DriverManager.getConnection(url, user, password);
			// 4. Query문 작성
			String query = "SELECT * FROM EMP WHERE ENAME LIKE ?";
			// 5. PreparedStatement Query문 미리 전송
			st = con.prepareStatement(query);
			// 6. ? 값 세팅
			st.setString(1, "%" + search + "%");
			// 7. 최종 ? 전송 후 결과를 처리
			rs = st.executeQuery();

			while (rs.next()) {
				EmpDTO empDTO1 = new EmpDTO(); // 생성
				Integer empno = rs.getInt("empno");
				empDTO1.setEmpno(empno);
				Integer mgr = rs.getInt("mgr");
				empDTO1.setMgr(mgr);
				Integer deptno = rs.getInt("deptno");
				empDTO1.setDeptno(deptno);
				Double sal = rs.getDouble("sal");
				empDTO1.setSal(sal);
				Double comm = rs.getDouble("comm");
				empDTO1.setComm(comm);
				String ename = rs.getString("ename");
				empDTO1.setEname(ename);
				String job = rs.getString("job");
				empDTO1.setJob(job);
				Date hiredate = rs.getDate("hiredate");
				empDTO1.setHiredate(hiredate);

				ar.add(empDTO1);
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
		return ar;
	}

	// 전체 직원정보 조회
	public ArrayList<EmpDTO> selectList() {
		// 1.접속할때 필요한 정보
		String user = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@192.168.56.101:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";

		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		ArrayList<EmpDTO> ar = new ArrayList<EmpDTO>();
		// 2. driver를 객체생성 메모리에 로딩
		try {
			Class.forName(driver);
			// 3. 로그인 후 Connection 반환
			con = DriverManager.getConnection(url, user, password);
			// 4. Query문 작성
			String query = "SELECT * FROM EMP";
			// 5. PreparedStatement Query문 미리 전송
			st = con.prepareStatement(query);
			// 6. ? 값 세팅
			// 7. 최종 ? 전송 후 결과를 처리
			rs = st.executeQuery();

			while (rs.next()) {
				EmpDTO empDTO = new EmpDTO(); // 생성
				Integer empno = rs.getInt("empno");
				empDTO.setEmpno(empno);
				Integer mgr = rs.getInt("mgr");
				empDTO.setMgr(mgr);
				Integer deptno = rs.getInt("deptno");
				empDTO.setDeptno(deptno);
				Double sal = rs.getDouble("sal");
				empDTO.setSal(sal);
				Double comm = rs.getDouble("comm");
				empDTO.setComm(comm);
				String ename = rs.getString("ename");
				empDTO.setEname(ename);
				String job = rs.getString("job");
				empDTO.setJob(job);
				Date hiredate = rs.getDate("hiredate");
				empDTO.setHiredate(hiredate);

				ar.add(empDTO);
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
		return ar;
	}

}
