package com.sapient.service;

public class MulTable {
	private int num;

	public MulTable(int num) throws Exception {
		super();
		if(num <= 0)
			throw new Exception("The Number must be greater than Zero");
		this.num = num;
	}
	
	public void display() {
		for(int i=1; i<=10; ++i) {
			System.out.printf("%d x %d = %d\n", num, i, (num * i));
		}
	}
	
}
