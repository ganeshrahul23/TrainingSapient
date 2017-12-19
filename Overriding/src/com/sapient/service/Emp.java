package com.sapient.service;

public class Emp implements Cloneable{
	private int eId;
	private String eName;
	public Emp(int eId, String eName) {
		super();
		this.eId = eId;
		this.eName = eName;
	}
	
	@Override
	public String toString() {
		return eId + "  " + eName;
	}

	@Override
	public boolean equals(Object obj) {
		Emp emp = (Emp)obj;
		if(this == emp)
			return true;
		else if (this.eId == emp.eId && this.eName.equals(emp.eName))
			return true;
		else
			return false;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbabe Collected " + eId);
	}

	@Override
	public Emp clone() throws CloneNotSupportedException {
		return (Emp)super.clone();
	}
	
	
	
	
}
