package com.sapient.def;

public class ClientA {
	public static void main(String[] args) {
		IDao dao = new DaoImpl1();
		dao.m1();
		dao.m2();
		
	}
}
