package com.sapient.test;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import com.sapient.dao.ExamDaoImpl;
import com.sapient.dao.IDao;
import com.sapient.vo.Question;

public class TestDao {

	public static void main(String[] args) {
		IDao dao = ExamDaoImpl.getInstance();
		Map<Integer, Question> map = dao.viewQuestions();
		System.out.println(map.size());
		
		Set<Integer> set = map.keySet();
		for(int qid : set){
			System.out.println(map.get(qid));
		}		
	}

}
