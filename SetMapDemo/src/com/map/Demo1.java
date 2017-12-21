package com.map;
import java.util.*;
import java.util.Map.Entry;

import com.pack1.*;

public class Demo1 {

	public static void main(String[] args) {
		Map<Integer, Emp> map = new HashMap<Integer, Emp>();
		Emp e1 = new Emp(1001, "Ganesh");
		Emp e2 = new Emp(1002, "Ranesh");
		Emp e3 = new Emp(1003, "Suresh");
		Emp e4 = new Emp(1002, "Suresh");
		
		map.put(e1.getEid(), e1);
		map.put(e2.getEid(), e2);
		map.put(e3.getEid(), e3);
		map.put(e4.getEid(), e4);
		
//		Scanner sc = new Scanner(System.in);
//		int eid = sc.nextInt();
//		
//		if(map.containsKey(eid)){
//			System.out.println("The employee name is " + map.get(eid).getEname());
//		}else{
//			System.out.println("Not Found");
//		}
		
		Set<Integer> set = map.keySet();
		for(Integer key : set){
			System.out.println(key +  " "  + map.get(key));
		}
		
		System.out.println();
		
		Collection<Emp> col = map.values();
		for(Emp e : col){
			System.out.println(e);
		}
		
		System.out.println();
		
		Set<Entry<Integer, Emp>> ent = map.entrySet();
		System.out.println(ent);
		

	}

}
