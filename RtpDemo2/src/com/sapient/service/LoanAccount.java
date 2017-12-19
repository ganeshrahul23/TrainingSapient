package com.sapient.service;

public class LoanAccount extends Account {

	public LoanAccount(int accId, String accName, double bal) {
		super(accId, accName, bal);
	}

	@Override
	public String deposit(double amt) {
		double bal = getBal();
		if(amt <= bal && bal > 0){
			setBal(bal - amt);
			return "Successfully Deposited";
		}else if(amt >bal && (bal - amt) > 0){
			setBal(0);
			return "Successfully Deposited";
		}
		return "Not Deposited";
	}

}
