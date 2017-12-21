package com.sapient.client;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.sapient.dao.DaoFactory;
import com.sapient.dao.Idao;
import com.sapient.exception.IdException;
import com.sapient.exception.NotFoundException;
import com.sapient.vo.Emp;

public class EmpClient {
	
	static Scanner sc =new Scanner(System.in);
	static Idao dao = DaoFactory.getDaoInstance();
	
	public static void main(String[] args) {
		String menu = null;
		String option = null;
		Menu emenu = null;
		do{
			System.out.println("Choose :\nADD");
			System.out.println("EDIT");
			System.out.println("REMOVE");
			System.out.println("VIEW");
			System.out.println("VIEWALL");
			menu = sc.nextLine();
			try{
				emenu = Menu.valueOf(menu.toUpperCase());
				processMenu(emenu);
			}catch (Exception e) {
				System.out.println("Invalid menu option");
			}			
			System.out.println("Press y to continue");
			option = sc.nextLine();
		}while(option.equals("y"));
	}
	
	public static void processMenu(Menu menu){
		switch (menu) {
		case VIEWALL : viewAll(); 
					   break;
		case VIEW: viewById();
		           break;
		case ADD: addEmp();
				  break;
		case EDIT:
		case REMOVE:
		}
		
	}
	
	public static void viewAll(){
		List<Emp> lst = dao.viewEmployee();
		for(Emp emp : lst){
			System.out.println(emp);
		}
	}
	
	public static void viewById(){
		System.out.print("Enter the employee Id :");
		Emp emp = null;
		try {
			emp = dao.viewEmployee(Integer.parseInt(sc.nextLine()));
		} catch (NotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(emp); 
	}
	
	public static void addEmp(){
		System.out.print("Enter the employee Id :");
		int eid = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter the employee name :");
		String name = sc.nextLine();
		
		System.out.print("Enter the employee salary :");
		double sal = Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter the employee dept_id :");
		int did = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter the employee doj(dd-mm-yyyy) :");
		String dat = sc.nextLine();
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");		
		LocalDate doj = LocalDate.parse(dat, df);
		
//		String[] day = sc.nextLine().split("-");		
//		LocalDate doj = LocalDate.of(Integer.valueOf(day[2]), Integer.valueOf(day[1]), Integer.valueOf(day[0]));
		
		Emp emp = new Emp(eid, name, sal, did, doj);
		try {
			dao.addEmployee(emp);
		} catch (IdException e) {
			e.printStackTrace();
		}
		
		
	}

}
