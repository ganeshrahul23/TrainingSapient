package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url,"system","Sapient123");
		
		String sql = "SELECT sum(sal) Total, avg(sal) Average, count(eid) Count FROM sap_employee";
		PreparedStatement st = conn.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()){
			System.out.printf("%10.2f", rs.getDouble("Total"));
			System.out.printf("%10.2f", rs.getDouble("Average"));
			System.out.printf("%5d", rs.getInt("Count"));
			System.out.println();			
		}		
		conn.close();
	}

}
