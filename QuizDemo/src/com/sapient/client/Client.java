package com.sapient.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sapient.service.ExamSerImpl;
import com.sapient.service.IExamSer;
import com.sapient.vo.Answer;
import com.sapient.vo.Question;

public class Client {

	public static void main(String[] args) {
		IExamSer ser = ExamSerImpl.getInstance();
		List<Question> lst = ser.generateQuestions();
		int i = 1;
		Scanner sc = new Scanner(System.in);
		String str = null;
		List<Answer> answer = new ArrayList<>();
		for(Question ques : lst){
			System.out.println(i + " : " +ques.getqDesc());
			System.out.println("Option A : " + ques.getOptA());
			System.out.println("Option B : " + ques.getOptB());
			System.out.println("Option C : " + ques.getOptC());
			System.out.println("=====================================================");
			i = i + 1;
			str = sc.nextLine();
			answer.add(new Answer(ques.getQid(), str));			
		}
		
		int score = ser.evaluate(answer);
		
		System.out.println("Score is " + score);

	}

}
