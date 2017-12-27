package com.sapient.client;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.sapient.util.EmpUtil;
import com.sapient.vo.Employee;

public class ViewBySal {

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
		lst.add(null);
		System.out.println("Sort by EID");
		Stream<Employee> s = lst.stream().filter(e -> e!=null).sorted();
		s.forEach(EmpUtil::display);
		System.out.println("Sort by Ename");
		lst.stream().filter(e -> e!=null)
					.sorted((e1, e2) -> e1.getEname().compareTo(e2.getEname()))
					.forEach(EmpUtil::display);
		System.out.println("Sort by Esal");
		lst.stream().filter(e -> e!=null)
		.sorted((e1, e2) -> e1.getEsal().compareTo(e2.getEsal()))
		.forEach(EmpUtil::display);
		


	}

}
