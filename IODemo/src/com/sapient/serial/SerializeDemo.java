package com.sapient.serial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializeDemo extends ObjectOutputStream{
	
	protected SerializeDemo() throws IOException, SecurityException {
		super();
	}

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("employee.txt");	
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Scanner sc= new Scanner(System.in);
		
//		System.out.print("Enter Employee Id : ");
//		int eid = Integer.parseInt(sc.nextLine());
//		
//		System.out.print("Enter Employee Name : ");
//		String name = sc.nextLine();
//		
//		System.out.print("Enter Employee Salary : ");
//		double sal = sc.nextDouble();
		
		
		Emp emp1 = new Emp(1001, "Ram", 45000);
		Emp emp2 = new Emp(1002, "pram", 78000);
		Emp emp3 = new Emp(1003, "sam", 43576);
		oos.writeObject(emp1);
		oos.writeObject(emp2);
		oos.writeObject(emp3);
		oos.close();
		fos.close();
		System.out.println("Serialized");
	}

	@Override
	protected void writeStreamHeader() throws IOException {
		reset();
	}

}
