package com.sapient.client;

import com.sapient.service.Car;

public class ConstructorDemo {

	public static void main(String[] args) {
		try {
			Car c1 = new Car(1001);
			Car c2 = new Car(1002, "Audi");
			Car c3 = new Car(1003, "Ford", 1000000.00d);
		} catch (Exception e) {
			System.out.println(e.getMessage());			
		}

	}
}
