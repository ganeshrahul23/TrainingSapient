package com.sapient.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.sapient.vo.Question;

public class ExamDaoImpl implements IDao {
	
	static{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Override
	public Map<Integer, Question> viewQuestions() {
		
		Map<Integer, Question> map = new HashMap<>();		
		int qid;
		String qDesc;
		String optA;
		String optB;
		String optC;
		String answer;
		Question ques = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try (Connection conn = DriverManager.getConnection(url,"system","Sapient123")){
			String sql = "SELECT * FROM questions";
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			
			while(rs.next()){
				qid = rs.getInt("qid");
				qDesc = rs.getString("qdesc");
				optA = rs.getString("optiona");
				optB = rs.getString("optionb");
				optC = rs.getString("optionc");
				answer = rs.getString("answer");
				ques = new Question(qid, qDesc, optA, optB, optC, answer);
				map.put(qid, ques);
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}		
		return map;
	}

}
