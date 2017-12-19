package com.sapient.service;

public class OnRollEmployee extends Employee {
	
	private double da,pf;

	public OnRollEmployee(int empId, String empName, double sal, double da, double pf) {
		super(empId, empName, sal);
		this.da = da;
		this.pf = pf;
	}

	@Override
	public void display() {
		super.display();
		System.out.printf("%10.2f%10.2f%14.2f%20s\n", da, pf, calcSal(), getClass().getSimpleName());
	}

	@Override
	public double calcSal() {
		return (getSal() + da - pf);
	}

}
