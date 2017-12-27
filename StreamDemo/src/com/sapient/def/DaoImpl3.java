package com.sapient.def;

import java.util.List;

public class DaoImpl3 implements IDao {

	@Override
	public void m1() {
		System.out.println("imlp3 ---> m1");

	}

	@Override
	public void m2() {
		System.out.println("imlp3 ---> m2");

	}

	@Override
	public void m3(List<String> lst) {

		IDao.super.m3(lst);
	}
	
	

}
