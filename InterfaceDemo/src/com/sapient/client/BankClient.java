package com.sapient.client;

import com.sapient.service.Atm;
import com.sapient.service.Agent;
import com.sapient.service.Bank;

public class BankClient {

	public static void main(String[] args) {
		Atm atm = Bank.getAtm();
		atm.deposit();
		atm.getBal();
		
		Agent agent = Bank.getAgent();

	}

}
