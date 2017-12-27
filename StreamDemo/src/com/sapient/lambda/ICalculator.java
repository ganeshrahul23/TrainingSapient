package com.sapient.lambda;

@FunctionalInterface
public interface ICalculator {
	int doCalc(int a, int b);
	
	default void display(){
		
	}
}
