package com.sapient.service;

import java.util.*;
import java.util.List;

public class EmpMemDao implements Idao {

	EmpMemDao() {
		// Instance cannot be created in another package since access is package private
	}
	@Override
	public List<String> viewEmployee() {
		System.out.println("This is EmpMemDao Instance");
		List<String> lst = new ArrayList<String>();
		lst.add("ram");
		lst.add("sam");
		return lst;
	}

}
