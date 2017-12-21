package com.pack1;

public class Emp {
	private int eid;
	private String ename;
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
	public int hashCode() {
		return eid;
	}
	@Override
	public boolean equals(Object obj) {
		Emp emp = (Emp) obj;
		if(eid == emp.eid)
			return true;
		else
			return false;
	}
	public int getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
	
	
	
	
}
