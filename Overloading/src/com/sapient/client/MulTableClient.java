package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.MulTable;

public class MulTableClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		sc.close();		
		try {
			MulTable obj = new MulTable(num);
			obj.display();
			obj.display(7);
			obj.display(2, 6);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
