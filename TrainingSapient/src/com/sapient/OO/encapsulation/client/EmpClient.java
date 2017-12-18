package com.sapient.OO.encapsulation.client;

import com.sapient.OO.encapsulation.service.Emp;

public class EmpClient {

	public static void main(String[] args) {
		Emp emp = new Emp();
		try {
			emp.setName("Ganesh");
			emp.setAge(22);
			System.out.println(emp.getName() + "   " + emp.getAge() + "   " + emp.getBusUnit());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
