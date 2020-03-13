package com.iu.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	public static Connection getConnection() throws Exception{
		String user = "user01";
		String password = "user01";
		String url = "jdbc:oracle:thin:@211.238.142.214:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";

		Class.forName(driver);

		Connection con = DriverManager.getConnection(url, user, password);
		
		return con;

	}

}
