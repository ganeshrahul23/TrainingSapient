package com.sapient.vo;

import java.time.LocalDate;

public class Emp implements Comparable<Emp>{
	private int eId;
	private String empName;
	private double sal;
	private int deptId;
	private LocalDate doj;
	
	public Emp(int eId, String empName, double sal, int deptId, LocalDate doj) {
		super();
		this.eId = eId;
		this.empName = empName;
		this.sal = sal;
		this.deptId = deptId;
		this.doj = doj;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public int geteId() {
		return eId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getSal() {
		return sal;
	}

	public int getDeptId() {
		return deptId;
	}

	public LocalDate getDoj() {
		return doj;
	}

	@Override
	public String toString() {
		return "eId=" + eId + ", empName=" + empName + ", sal=" + sal + ", deptId=" + deptId + ", doj=" + doj;
	}

	@Override
	public int compareTo(Emp o) {
		Integer eid1 = this.eId;
		Integer eid2 = o.eId;
		return eid1.compareTo(eid2);
	}
	
	
	
	
}
