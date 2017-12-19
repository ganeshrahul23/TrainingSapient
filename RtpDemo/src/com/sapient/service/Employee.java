package com.sapient.service;

public abstract class Employee {
	private int empId;
	private String empName;
	private double sal;
	
	public Employee(int empId, String empName, double sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
	}

	public void display(){
		System.out.printf("%5d%10s%10.2f", empId, empName, sal);	
	}
	public double getSal() {
		return sal;
	}

	public abstract double calcSal();
	
}
