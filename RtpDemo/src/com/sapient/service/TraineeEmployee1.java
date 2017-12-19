package com.sapient.service;

public class TraineeEmployee1 extends Employee1 {
	
	private int percentage;
	
	public TraineeEmployee1(int empId, String empName, int percentage) {
		super(empId, empName);
		this.percentage = percentage;
		
	}

	@Override
	public boolean isOutstanding() {	
		return (percentage >= 90);
	}

	@Override
	public void display() {
		super.display();
	}
	
}
