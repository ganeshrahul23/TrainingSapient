package com.sapient.client;

import com.sapient.service.Calculator;
import com.sapient.service.Interest;

public class InterestClient {

	public static void main(String[] args) {
		Interest obj = Calculator.getInterest();	
		System.out.println(obj.calComplexInterest(5000, 2, 2.5f));

	}

}
