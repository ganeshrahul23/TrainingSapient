package com.sapient.service;

public abstract class Product {

	private int productId;
	private String productName;
	private double price;
	
	public Product(int productId, String productName, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	
//	public void setPrice(double price) {
//		this.price = price;
//	}

	public double getPrice() {
		return price;
	}

	public void display(){
		System.out.printf("%10d%20s%10.2f", productId, productName, price);
	}
		
	public abstract String isExpensive();
	
}
