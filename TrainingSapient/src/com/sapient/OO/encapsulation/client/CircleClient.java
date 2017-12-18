package com.sapient.OO.encapsulation.client;

import java.util.Scanner;

import com.sapient.OO.encapsulation.service.Circle;

public class CircleClient {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Radius : ");
		int radius = sc.nextInt();
		sc.close();
		try {
			Circle cir = new Circle(radius);
			System.out.println("The area of the circle is " + cir.calcArea());
			System.out.println("The Perimeter of the circle is " + cir.calcPri());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
