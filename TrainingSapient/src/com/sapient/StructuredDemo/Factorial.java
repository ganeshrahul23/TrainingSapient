package com.sapient.StructuredDemo;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println("The Factorial is " + findFact(num));
	}
	
	public static int findFact(int num) {
		int factorial = 1;
		for(int idx = num; idx > 0; idx--) {
			factorial = factorial * idx;
		}
		return factorial;
	}

}
