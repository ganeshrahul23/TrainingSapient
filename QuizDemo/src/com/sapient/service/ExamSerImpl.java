package com.sapient.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import com.sapient.dao.ExamDaoImpl;
import com.sapient.dao.IDao;
import com.sapient.test.TestDao;
import com.sapient.vo.Answer;
import com.sapient.vo.Question;

public class ExamSerImpl implements IExamSer {
	
	private static IExamSer ser = new ExamSerImpl();	
	private ExamSerImpl(){
		
	}
	public static IExamSer getInstance(){
		return ser;
	}
	
	private static Map<Integer, Question> qmap = null;	
	//private static IDao dao = null;
	static{
		IDao dao = ExamDaoImpl.getInstance();
		qmap = dao.viewQuestions();
	}

	@Override
	public List<Question> generateQuestions() {
		Set<Integer> qids = genRandomQues(5);
		List<Question> lst = new ArrayList<>();	
		for(Integer qno : qids){
			lst.add(qmap.get(qno));
		}
		return lst;
	}
	
	private Set<Integer> genRandomQues(int n){
		Set<Integer> set= new HashSet<>();
		Random ran = new Random();
		while(set.size() < n){
			set.add(ran.nextInt(15)  + 1);
		}		
		return set;
	}

	@Override
	public int evaluate(List<Answer> alist) {
		Answer ans = null;
		int score = 0;
		Question ques = null;
		for(Answer answer : alist){
			ques = qmap.get(answer.getQid());
			if(ques.getAnswer().equalsIgnoreCase(answer.getAnswer()))
				++score;
		}
		return score;
	}
}
