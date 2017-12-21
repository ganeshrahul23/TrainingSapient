package com.sapient.create;

public class Emp {
	
	static{
		System.out.println("I am in Static Block");
	}
	
	public Emp(){
		System.out.println("Emp Constructor");
	}
	
	public void display(){
		System.out.println("Instance method Display..");
	}
}
