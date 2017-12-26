package com.sapient.client;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.sapient.vo.Employee;

public class EmpSalary {

	public static void main(String[] args) {
		Employee[] emp = new Employee[5];
		emp[0] = new Employee(1003, "Ganesh", 23456);
		emp[1] = new Employee(1005, "Bruce", 45674);
		emp[2] = new Employee(1002, "Banner", 19993);
		emp[3] = new Employee(1001, "Tony", 34636);
		emp[4] = new Employee(1004, "Stark", 64564);
		List<Employee> lst = new ArrayList<>();
		for(Employee e:emp){
			lst.add(e);
		}
		double sum = lst.stream().map(e -> e.getEsal()).reduce(0.0, (x,y) -> (x+y));
		System.out.println("The total salary is " + sum);
		
		double sum1 = lst.stream().mapToDouble(e -> e.getEsal()).sum();
		System.out.println("The total salary is " + sum1);

	}

}
