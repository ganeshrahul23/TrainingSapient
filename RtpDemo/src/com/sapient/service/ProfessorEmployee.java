package com.sapient.service;

public class ProfessorEmployee extends Employee1 {
	private int rating;

	public ProfessorEmployee(int empId, String empName, int rating) {
		super(empId, empName);
		this.rating = rating;
	}

	@Override
	public boolean isOutstanding() {
		return (rating >= 5);
	}
	
	@Override
	public void display() {
		super.display();
	}

}
