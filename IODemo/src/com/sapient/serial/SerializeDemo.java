package com.sapient.serial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("employee.txt");	
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Emp emp = new Emp(1001, "Ram", 12333.22);
		oos.writeObject(emp);
		oos.close();
		fos.close();
		System.out.println("Serialized");
	}

}
