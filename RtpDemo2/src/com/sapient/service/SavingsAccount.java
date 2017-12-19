package com.sapient.service;

public class SavingsAccount extends Account {

	public SavingsAccount(int accId, String accName, double bal) {
		super(accId, accName, bal);
	}

	@Override
	public String deposit(double amt) {
		if(amt < 0){
			return "Not Deposited";
		}
		if(amt < 50000){
			setBal(getBal() + amt);
			return "Successfully Deposited";
		}
		return "Not Deposited";
	}

}
