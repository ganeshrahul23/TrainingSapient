package com.pack1;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {
	public static void main(String[] args) {
		Emp e1 = new Emp(1001, "Ganesh");
		Emp e2 = new Emp(1001, "Ganesh");
		
		Set<Emp> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		
		for(Emp m : set){
			System.out.println(m);
		}
	}
}
