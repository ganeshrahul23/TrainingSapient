package com.sapient.client;

import com.sapient.service.*;

public class EmployeeClient {

	public static void main(String[] args) {
		Employee [] emp = new Employee[4];
		emp[0] = new OnRollEmployee(1001, "Ganesh", 36000.45);
		emp[1] = new ContractEmployee(1002, "Suresh", 1000.34, 120);
		emp[2] = new OnRollEmployee(1003, "Prakash", 56000.99);
		emp[3] = new ContractEmployee(1004, "Ramesh", 2000.56, 233);
		
		
		for(int i=0; i<79;i++)
			System.out.print("-");
		System.out.println();
		
		System.out.printf("%5s%10s%10s%10s%10s%4s%10s%20s", "empId", "empName", "sal", "da", "pf", "day", "NetSal", "Type");
		System.out.println();
		
		for(int i=0; i<79;i++)
			System.out.print("-");
		System.out.println();
		
		for(Employee e : emp){
			e.display();
		}

	}

}
