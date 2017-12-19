package com.sapient.client;

import com.sapient.service.*;

public class ProductClient {
	
	public static void main(String[] args) {
		Product [] prod = new Product[4];
		prod[0] = new Computer(1001, "Acer", 50700.00, "4 TB");
		prod[1] = new Mobile(1001, "Nokia", 7500.00, "4 Mp");
		prod[2] = new Computer(1003, "HP Laptop", 7000.00, "2 TB");
		prod[3] = new Mobile(1004, "Iphone", 100000, "40 Mp");
		
		for(int i=0; i<100;i++)
			System.out.print("-");
		System.out.println();
		System.out.printf("%10s%20s%10s%10s%10s%20s%20s\n", "productId", "productName", "price", "hdd", "camera", "Range", "Type");
		for(int i=0; i<100;i++)
			System.out.print("-");
		System.out.println();
		
		for(Product p:prod){
			p.display();
		}
		
		for(int i=0; i<100;i++)
			System.out.print("-");
		System.out.println();
		
	}
}
