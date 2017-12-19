package com.sapient.service;

public class ContractEmployee extends Employee {
	private int days;

	public ContractEmployee(int empId, String empName, double sal, int days) {
		super(empId, empName, sal);
		this.days = days;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.printf("%24d%10.2f%20s\n", days, calcSal(), getClass().getSimpleName());
	}

	@Override
	public double calcSal() {
		return (getSal() * days);
	}

}
