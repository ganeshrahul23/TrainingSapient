package com.sapient.service;

import java.math.BigInteger;

public class Calculator implements Interest, Factorial{
	
	private static Calculator calc = new Calculator();
	
	private Calculator() {
	}
	
	public static Basic getBasic(){
		Basic basic = calc;
		return basic;
	}

	public static Interest getInterest(){
		Interest inte = calc;
		return inte;
	}
	
	public static Factorial getFactorial(){
		Factorial fac = calc;
		return fac;
	}
	
	@Override
	public String convert2Binary(int num) {
		return Integer.toBinaryString(num);
	}

	@Override
	public double calSimpleInterest(double amount, int years, float rate) {
		return amount * years * rate;
	}

	@Override
	public double calComplexInterest(double amount, int years, float rate) {
		return amount + Math.pow((1+rate), years);
	}

	@Override
	public BigInteger findFact(int num) {
		BigInteger factorial = BigInteger.ONE;
		for(int idx = num; idx > 0; idx--) {
			factorial = factorial.multiply(BigInteger.valueOf(idx));
		}
		return factorial;
	}

	@Override
	public double doSum(int... num) {
		return Interest.super.doSum(num);
	}
	
	
	
}
