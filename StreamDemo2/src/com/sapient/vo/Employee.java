package com.sapient.vo;

public class Employee implements Comparable<Employee>{
	private int eid;
	private String ename;
	private Double esal;
	
	public Employee(int eid, String ename, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public Double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	@Override
	public int compareTo(Employee o) {
		Integer e1 = this.eid;
		Integer e2 = o.eid;
		return e1.compareTo(e2);
	}
	
	
			
}
