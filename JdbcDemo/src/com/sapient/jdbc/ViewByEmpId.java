package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ViewByEmpId {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url,"system","Sapient123");
		
		String sql = "SELECT * FROM sap_employee WHERE eid = ?";
		PreparedStatement st = conn.prepareStatement(sql);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Employee Id : ");
		int eid = Integer.parseInt(sc.nextLine());
		st.setInt(1, eid);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()){
			System.out.printf("%5d", rs.getInt("eid"));
			System.out.printf("%15s", rs.getString("ename"));
			System.out.printf("%10.2f", rs.getDouble("sal"));
			System.out.printf("%2d",rs.getInt("dept_id"));
			System.out.printf("%12s", rs.getDate("doj"));
			System.out.println();			
		}		
		conn.close();
	}
}
