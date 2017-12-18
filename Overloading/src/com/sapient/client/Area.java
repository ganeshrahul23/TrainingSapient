package com.sapient.client;

public class Area {
	public static int calArea(int side) {
		return side * side;
	}
	
	public static double calArea(double side) {
		return side * side;
	}
	
	public static void main(String[] args) {
		System.out.println(calArea(10));
		System.out.println(calArea(10.34d));

	}

}
