package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(2);
		lst.add(4);
		lst.add(3);
		lst.add(6);
		lst.add(1);
		
		Integer s = lst.stream().map(i -> i).reduce(0, (x,y) -> x+y);
		Integer s2 = lst.stream().reduce(0, (x,y) -> x-y);
		System.out.println(s + "  " + s2);
		Integer s3 = lst.stream().filter(i -> i%2==0).reduce(0, (x,y) -> x+y);
		System.out.println(s3);
	}

}
