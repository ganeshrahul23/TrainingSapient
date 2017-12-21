package com.sapient.wrapper;

public class Boxing {
	public static void main(String[] args) {
		Integer a = new Integer(10);
		Integer b = new Integer(20);
		
		int res = a.intValue() + b.intValue();
		Integer c = new Integer(res);
		
		System.out.println(c);
	}
}
