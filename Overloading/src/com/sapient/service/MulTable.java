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
		showTable(1, 10);
	}
	
	public void display(int rows) {
		showTable(1, rows);		
	}
	
	public void display(int start, int end) throws Exception {
		if(end > 0 && start > 0 && end >= start)
			showTable(start, end);
		else
			throw new Exception("Start and End must be Positive and End must be greater than Start");
	}
	
	private void showTable(int start, int end) {
		for(int i=start; i<=end; ++i) {
			System.out.printf("%d x %d = %d\n", num, i, (num * i));
		}
	}
	
}
