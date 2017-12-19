package com.sapient.service;

public abstract class Employee1 {
	private int empId;
	private String empName;
	
	public Employee1(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public void display(){
		
	}
	
	public abstract boolean isOutstanding();
}
