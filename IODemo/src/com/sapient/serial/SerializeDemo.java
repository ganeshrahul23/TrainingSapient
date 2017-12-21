package com.sapient.serial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializeDemo {
	
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("employee.txt");	
		ObjectOutputStream oos = new ObjectOutputStream(fos);
				
		Emp emp1 = new Emp(1005, "peter", 56000);
		oos.writeObject(emp1);
		
		oos.close();
		fos.close();
		System.out.println("Serialized");
	}

}
