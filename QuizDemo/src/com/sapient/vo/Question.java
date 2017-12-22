package com.sapient.vo;

public class Question {
	private int qid;
	private String qDesc;
	private String optA;
	private String optB;
	private String optC;
	private String answer;
	
	public Question(){
		
	}
	public Question(int qid, String qDesc, String optA, String optB, String optC, String answer) {
		super();
		this.qid = qid;
		this.qDesc = qDesc;
		this.optA = optA;
		this.optB = optB;
		this.optC = optC;
		this.answer = answer;
	}

	public int getQid() {
		return qid;
	}

	public String getqDesc() {
		return qDesc;
	}

	public String getOptA() {
		return optA;
	}

	public String getOptB() {
		return optB;
	}

	public String getOptC() {
		return optC;
	}

	public String getAnswer() {
		return answer;
	}
	@Override
	public String toString() {
		return "qid=" + qid + ", qDesc=" + qDesc + ", optA=" + optA + ", optB=" + optB + ", optC=" + optC
				+ ", answer=" + answer;
	}
	
	
		
}
