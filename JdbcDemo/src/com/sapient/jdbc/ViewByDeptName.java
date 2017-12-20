package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ViewByDeptName {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url,"system","Sapient123");
		
		String sql = "SELECT e.eid, e.ename, e.sal, d.dname FROM sap_employee e INNER JOIN dept d ON d.did = e.dept_id WHERE d.dname = ?";
		PreparedStatement st = conn.prepareStatement(sql);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Department Name : ");
		String dname = sc.nextLine().toLowerCase();
		
		st.setString(1, dname);
				
		ResultSet rs = st.executeQuery();
		
		while(rs.next()){
			System.out.printf("%5d", rs.getInt("eid"));
			System.out.printf("%15s", rs.getString("ename"));
			System.out.printf("%10.2f", rs.getDouble("sal"));
			System.out.printf("%15s",rs.getString("dname"));
			System.out.println();			
		}		
		conn.close();
	}
}
