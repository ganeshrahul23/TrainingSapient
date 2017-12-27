package com.sapient.util;

import java.util.HashSet;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Set;

public class ExamUtil {
	public static final String DRIVER;
	public static final String URL;
	public static final String UNAME;
	public static final String PWD;
		
	static{
		ResourceBundle rb = ResourceBundle.getBundle("sap");
		DRIVER = rb.getString("drivername");
		URL = rb.getString("url");
		UNAME = rb.getString("uname");
		PWD = rb.getString("pwd");
	}
	
	public static Set<Integer> genUniqueNos(int n){
		Set<Integer> set= new HashSet<>();
		Random ran = new Random();
		while(set.size() < n){
			set.add(ran.nextInt(15)  + 1);
		}		
		return set;
	}
}
