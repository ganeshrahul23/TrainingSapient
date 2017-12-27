package com.props;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties props = new Properties();
		props.put("1001", "ram");
		props.put("1002", "tom");
		props.load(new FileReader("src\\sap.properties"));
		System.out.println(props.getProperty("uname"));
		System.out.println(props.getProperty("1001"));
		

	}

}
