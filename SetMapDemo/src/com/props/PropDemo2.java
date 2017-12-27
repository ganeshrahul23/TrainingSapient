package com.props;

import java.util.Properties;
import java.util.Set;

public class PropDemo2 {

	public static void main(String[] args) {
		Properties props = System.getProperties();
		Set<Object> keys = props.keySet();
		for(Object obj:keys){
			System.out.println(obj.toString() + " " + props.getProperty(obj.toString()));
		}

	}

}
