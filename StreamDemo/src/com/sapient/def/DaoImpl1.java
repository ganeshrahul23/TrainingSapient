package com.sapient.def;

import java.util.List;

public class DaoImpl1 implements IDao {

	@Override
	public void m1() {
		System.out.println("m1");

	}

	@Override
	public void m2() {
		System.out.println("m2");

	}
	
	public void m3(List<String> lst){
		lst.forEach(System.out::println);
	}
	


}
