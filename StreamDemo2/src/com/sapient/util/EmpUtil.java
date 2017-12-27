package com.sapient.util;

import com.sapient.vo.Employee;

public class EmpUtil {
	public static void display(Employee emp){
		String res = "The eid is " + emp.getEid();
		res = res + "\nThe ename is " + emp.getEname();
		res = res + "\nThe Salary is " + emp.getEsal();
		res = res + "\n---------------------";
		System.out.println(res);

	}
}
