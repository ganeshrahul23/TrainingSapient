package com.sapient.test;

import java.util.ArrayList;
import java.util.List;

import com.sapient.service.ExamSerImpl;
import com.sapient.service.IExamSer;
import com.sapient.vo.Question;

public class TestSer {

	public static void main(String[] args) {
		IExamSer ser = ExamSerImpl.getInstance();
		List<Question> lst = new ArrayList<>();
		lst.addAll(ser.generateQuestions());
		
		for(Question q : lst){
			System.out.println(q);
		}

	}

}
