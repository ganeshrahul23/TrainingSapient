package com.pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		Emp e1 = new Emp(1002, "Ganesh");
		Emp e2 = new Emp(1001, "Ramesh");
		List<Emp> lst = new ArrayList<>();
		lst.add(e1);
		lst.add(e2);
		Collections.sort(lst);
		
//		for(Emp m : lst){
//			System.out.println(m);
//		}
		
		Collections.sort(lst, new Comparator<Emp>() {

			@Override
			public int compare(Emp o1, Emp o2) {
				return o1.ename.compareTo(o2.ename);
			}
			
		});
		System.out.println(lst);
		
		Collections.sort(lst, new Comparator<Emp>() {

			@Override
			public int compare(Emp o1, Emp o2) {
				Integer e1 = o1.eid;
				Integer e2 = o2.eid;
				return e1.compareTo(e2);
			}
		});
		
		System.out.println(lst);

	}

}
