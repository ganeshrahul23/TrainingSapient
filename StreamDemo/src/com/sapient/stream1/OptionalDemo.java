package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		Optional<Integer> opt = lst.stream().findAny();
		System.out.println(opt);

	}

}
