package com.sapient.stream1;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;
public class ForEachDeno {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(2);
		lst.add(4);
		lst.add(3);
		lst.add(6);
		lst.add(1);
		//Stream<Integer> s = lst.stream();
		//s.forEach(System.out::println);
		System.out.println("Using Method Reference");
		lst.stream().forEach(System.out::println);
		System.out.println("Using Lambda Expression");
		lst.stream().forEach(s -> System.out.println(s));

	}

}
