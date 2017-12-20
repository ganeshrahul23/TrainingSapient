package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertEmployee {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url,"system","Sapient123");
		
		String sql = "INSERT INTO sap_employee VALUES (?, ?, ?, ?, ?)";
		PreparedStatement st = conn.prepareStatement(sql);
			
		st.setInt(1, 0);
		st.setString(2, "Parker");
		st.setDouble(3, 45678.34);
		st.setInt(4, 2);
		st.setString(5, "13-DEC-2012");
						
		int rows = st.executeUpdate();
		
		System.out.println(rows + " rows affected");
		conn.close();
	}
}
