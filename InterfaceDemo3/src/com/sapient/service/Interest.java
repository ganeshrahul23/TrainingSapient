package com.sapient.service;

public interface Interest extends Basic{
	double calSimpleInterest(double amount, int years, float rate);
	public double calComplexInterest(double amount, int years, float rate);
}
