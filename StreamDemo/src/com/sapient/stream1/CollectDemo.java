package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(2);
		lst.add(4);
		lst.add(3);
		lst.add(6);
		lst.add(1);
		Stream<Integer> s = lst.stream().filter(i -> i%2==0);
		List<Integer> lst2 = s.collect(Collectors.toList());
		
		lst.forEach(System.out::println);
		

	}

}
