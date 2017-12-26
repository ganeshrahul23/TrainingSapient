package com.sapient.lambda;

public class CalcImpl {
	
	public static void main(String[] args) {
		
		ICalculator add = (a, b)->{return a+b;};
		ICalculator sub = (a, b)->a-b;
		ICalculator mul = (int a, int b)->{return a*b;};
		
		System.out.println(add.doCalc(4, 5));
		System.out.println(sub.doCalc(56, 50));
		System.out.println(mul.doCalc(25, 25));
				
	}


}
