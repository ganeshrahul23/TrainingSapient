package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class AggDemo {
	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(2);
		lst.add(4);
		lst.add(3);
		lst.add(6);
		lst.add(1);

		long size = lst.stream().filter(i -> i>=4).count();
		System.out.println("The size is " + size);
		
		OptionalInt opt1 = lst.stream().mapToInt(i -> i).min();
		System.out.println(opt1.getAsInt());
	}
}
