package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapDemo {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(2);
		lst.add(4);
		lst.add(3);
		lst.add(6);
		lst.add(1);
		
		Stream s = lst.stream().map(i -> i*i);
		s.forEach(System.out::println);

	}

}
