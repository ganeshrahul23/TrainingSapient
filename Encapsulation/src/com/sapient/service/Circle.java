package com.sapient.service;

public class Circle {
	private double radius;

	public Circle(double radius) throws Exception {
		super();
		if (radius <= 0)
			throw new Exception("Radius must be greater than Zero");
		this.radius = radius;
	}
	
	public double calcArea() {
		double area = Math.PI * radius * radius;
		return area;
	}

	public double calcPri() {
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}

}
