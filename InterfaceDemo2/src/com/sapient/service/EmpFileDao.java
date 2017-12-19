package com.sapient.service;

import java.util.ArrayList;
import java.util.List;

public class EmpFileDao implements Idao {

	@Override
	public List<String> viewEmployee() {
		System.out.println("This is EmpFileDao Instance");
		List<String> lst = new ArrayList<String>();
		lst.add("ram");
		lst.add("prem");
		return lst;
	}

}
