package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewAll {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url,"system","Sapient123");
		
		String sql = "SELECT * FROM sap_employee";
		PreparedStatement st = conn.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		while(rs.next()){
			System.out.printf("%5d", rs.getInt("eid"));
			System.out.printf("%15s", rs.getString("ename"));
			System.out.printf("%10.2f", rs.getDouble("sal"));
			System.out.printf("%2d",rs.getInt("dept_id"));
			System.out.printf("%12s", rs.getDate("doj"));
			System.out.println();			
//			System.out.print(rs.getInt("eid") + "\t");
//			System.out.print(rs.getString("ename") + "\t");
//			System.out.print(rs.getDouble("sal") + "\t");
//			System.out.print(rs.getInt("dept_id") + "\t");
//			System.out.println(rs.getDate("doj"));
		}		
		conn.close();				
	}

}
