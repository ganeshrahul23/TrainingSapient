package com.sapient.service;

import java.util.ResourceBundle;

public class EmpUtil {
	private static ResourceBundle rb;
	private static Idao dao;
	
	static{
		rb = ResourceBundle.getBundle("sap");
		try {
			Class cls = Class.forName(rb.getString("cname"));//Load the class programattically
			dao = (Idao)cls.newInstance();//To Create a new Instance
		} catch (Exception e) {
				System.out.println(e.getMessage());
		}
	}
	
	public static Idao getDaoInstance(){		
		return dao;
	}
}
