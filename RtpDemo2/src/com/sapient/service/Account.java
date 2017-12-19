package com.sapient.service;

public abstract class Account {
	private int accId;
	private String accName;
	private double bal;
	
	
	
	public Account(int accId, String accName, double bal) {
		super();
		this.accId = accId;
		this.accName = accName;
		this.bal = bal;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}	
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public void display(){
		System.out.println("The Account Id is " + accId);
		System.out.println("The Account Name is " + accName);
		System.out.println("The Account Balance is " + bal);
	}
	
	public abstract String deposit(double amt);
	
}
