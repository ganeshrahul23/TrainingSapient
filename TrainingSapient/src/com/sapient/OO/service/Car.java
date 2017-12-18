package com.sapient.OO.service;

public class Car {
	private int carId;
	private String carName;
	private double carPrice;

	public Car(int carId) throws Exception {
		System.out.println("One Argument Constructed");
		if(carId < 1000)
			throw new Exception("carId must be more than or equal to 1000");
		this.carId = carId;
	}

	public Car(int carId, String carName) throws Exception {
		this(carId);
		System.out.println("Two Argument Constructed");
		if(!carName.matches("[a-zA-Z]{3,10}"))
			throw new Exception("Car name must contain 3-10 alphabets");
		this.carName = carName;
	}
	
	public Car(int carId, String carName, double carPrice) throws Exception {
		this(carId, carName);
		System.out.println("Three Argument Constructed");
		this.carPrice = carPrice;
	}
			
}
