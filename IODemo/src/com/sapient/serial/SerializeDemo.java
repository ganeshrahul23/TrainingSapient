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
		FileOutputStream fos = new FileOutputStream("employee.txt", true);	
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter Employee Id : ");
		int eid = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter Employee Name : ");
		String name = sc.nextLine();
		
		System.out.print("Enter Employee Salary : ");
		double sal = sc.nextDouble();
		
		
		Emp emp = new Emp(eid, name, sal);
		oos.writeObject(emp);
		oos.close();
		fos.close();
		System.out.println("Serialized");
	}

	@Override
	protected void writeStreamHeader() throws IOException {
		reset();
	}

}
