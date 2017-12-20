package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateSalary {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url,"system","Sapient123");
		
		String sql = "UPDATE sap_employee SET sal = ? WHERE eid = ?";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setDouble(1, 78444.22);
		st.setInt(2, 0);
		int row = st.executeUpdate();
		System.out.println(row + " rows affected");
		conn.close();
	}
}
