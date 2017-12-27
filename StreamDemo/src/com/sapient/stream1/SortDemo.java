package com.sapient.stream1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortDemo {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(2);
		lst.add(4);
		lst.add(3);
		lst.add(6);
		lst.add(1);
		
		Stream s = lst.stream().sorted();
		s.forEach(System.out::println);
		
		Stream s1 = lst.stream().sorted((i,j) -> j.compareTo(i));
		s1.forEach(System.out::println);
		
		Stream s2 = lst.stream().sorted(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		s2.forEach(System.out::println);

	}

}
