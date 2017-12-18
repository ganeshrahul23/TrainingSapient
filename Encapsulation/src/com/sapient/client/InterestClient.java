package com.sapient.client;

import com.sapient.service.Interest;
import java.util.Scanner;

public class InterestClient {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the amount :");
		double amt = sc.nextDouble();
		System.out.println("Enter the Rate :");
		double rate = sc.nextDouble();
		System.out.println("Enter the Years :");
		int years = sc.nextInt();
		sc.close();
		Interest obj = new Interest();
		try {
			obj.setAmount(amt);
			obj.setRate(rate);
			obj.setYears(years);
			System.out.println("The Simple Interest is " + obj.calSimpleInterest());
			System.out.println("The Complex Interest is " + obj.calComplexInterest());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
