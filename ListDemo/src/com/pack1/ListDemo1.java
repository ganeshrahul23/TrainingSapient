package com.pack1;

import java.util.*;

public class ListDemo1 {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("Bruce Banner");
		lst.add("Tony Stark");
		lst.add("Natasha");
		lst.add("Thor");
		
		Collections.sort(lst);
		for(String str : lst){
			System.out.println(str);
		}
		
		Iterator<String> it = lst.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("Using ListIterator to iterate in reverse");
		
		ListIterator<String> it2 = lst.listIterator(lst.size());
		while(it2.hasPrevious()){
			System.out.println(it2.previous());
		}
		

	}

}
