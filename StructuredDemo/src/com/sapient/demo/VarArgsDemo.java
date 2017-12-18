package com.sapient.demo;

public class VarArgsDemo {

	public static void main(String[] args) {
		System.out.println(sum());
		System.out.println(sum(1,2,3,4,5,6,7,8,9));
		System.out.println(sum(3,4));
	}
	
	public static int sum(int ...array) {
		int sum = 0;
		for(int i = 0; i<array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

}
