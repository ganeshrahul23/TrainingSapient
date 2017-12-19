package com.sapient.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class EmpFileDao implements Idao {
	
	EmpFileDao() {
	}

	@Override
	public List<String> viewEmployee() {
		System.out.println("This is EmpFileDao Instance");
		List<String> lst = new ArrayList<String>();
		String str = null;
		try{
			FileReader fr = new FileReader("emp.txt");
			BufferedReader br =new BufferedReader(fr);
			while((str = br.readLine()) != null){
				lst.add(str);
			}
			br.close();
			fr.close();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lst;
	}

}
