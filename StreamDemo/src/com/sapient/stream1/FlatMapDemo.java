package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo {

	public static void main(String[] args) {
		List<String> lst1 = new ArrayList<>();
		lst1.add("Q");
		lst1.add("R");
		lst1.add("B");
		lst1.add("E");
		lst1.add("P");
		lst1.add("A");
		lst1.add("C");
		List<String> lst2 = new ArrayList<>();
		lst2.add("T");
		lst2.add("X");
		lst2.add("Z");
		lst2.add("U");
		lst2.add("P");
		lst2.add("Y");
		lst2.add("W");
		
		Stream<List<String>> s = Stream.of(lst1, lst2);
		//s.forEach(System.out::println);
		
		Stream<String> s1 = s.flatMap(lst -> lst.stream());
		s1.forEach(System.out::println);
		
		
		
	}

}
