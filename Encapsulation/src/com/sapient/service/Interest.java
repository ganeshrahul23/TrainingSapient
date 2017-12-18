package com.sapient.service;

public class Interest {
	private double amount;
	private int years;
	private double rate;
	
	public void setAmount(double amount) throws Exception {
		if(amount < 5000)
			throw new Exception("The amount must be greater than 5000");
		this.amount = amount;
	}
	public void setYears(int years) throws Exception {
		if(years < 10 || years > 30)
			throw new Exception("The years must be between 10 and 30");
		this.years = years;
	}
	public void setRate(double rate) throws Exception {
		if(rate < 0 || rate > 5)
			throw new Exception("The rate must be between 0 and 5");
		this.rate = rate;
	}	
	
	public double calSimpleInterest() {	
		return amount * years * rate;
	}
	
	public double calComplexInterest() {		
		return amount + Math.pow((1+rate), years);
	}
		
}
