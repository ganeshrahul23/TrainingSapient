package com.sapient.demo;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println("The Factorial is " + findFact(num));
	}
	public static BigInteger findFact(int num) {
		BigInteger factorial = BigInteger.ONE;
		for(int idx = num; idx > 0; idx--) {
			factorial = factorial.multiply(BigInteger.valueOf(idx));
		}
		return factorial;
	}
	
}
