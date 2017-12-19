package com.sapient.client;

import com.sapient.service.Emp;

public class EmpClient {

	public static void main(String[] args) {
		Emp e1 = new Emp(1001, "Rama");
		Emp e2 = new Emp(1002, "Amar");
		Emp e3 = new Emp(1001, "Rama");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		
		e1 = null;
		//e2 = null;
		e3 = null;
		System.gc();
		
	}

}
