package com.sapient.service;

public class Bank implements Atm, Agent {
	
	private static Bank bank = new Bank();
	
	private Bank(){
		
	}

	public static Atm getAtm(){
		Atm atm = bank;
		return atm;
	}
	
	public static Agent getAgent(){
		Agent agent = bank;
		return agent;
	}
	
	@Override
	public void clearPdc() {
		System.out.println("Clear pdc");

	}

	@Override
	public void approveLoan() {
		System.out.println("approve loan");

	}

	@Override
	public void withdraw() {
		System.out.println("withdraw");

	}

	@Override
	public void deposit() {
		System.out.println("deposit");

	}

	@Override
	public void getBal() {
		System.out.println("get Balance");

	}

}
