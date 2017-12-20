package com.sapient.service;

public interface Basic {
	
	String convert2Binary(int num);
	
	default double doSum(int ...num){
		double sum = 0;
		for(double temp : num){
			sum += temp;
		}
		return sum;
	}
	
	default double doAve(int ...num){
		double ave = doSum(num) / num.length;	
		return ave;
	}		
}
