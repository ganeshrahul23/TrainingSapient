package com.pack1;

public class Emp implements Comparable<Emp>{
	public int eid;
	public String ename;



	public Emp(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}



	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + "]";
	}



	@Override
	public int compareTo(Emp o) {
		Integer e1 = this.eid;
		Integer e2 = o.eid;		
		return e1.compareTo(e2);
	}
		
}
