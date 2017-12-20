package com.sapient.serial;

import java.io.Serializable;

public class Emp implements Serializable{
	private int eId;
	private String ename;
	private double sal;
	
	public Emp(int eId, String ename, double sal) {
		super();
		this.eId = eId;
		this.ename = ename;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [eId=" + eId + ", ename=" + ename + ", sal=" + sal + "]";
	}
		
}
