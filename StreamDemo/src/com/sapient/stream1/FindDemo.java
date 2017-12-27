package com.sapient.stream1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindDemo {

	public static void main(String[] args) {
		List<String> lst1 = Arrays.asList("ram","rajan","sam","rakesh","sanjeev");
		Optional opt = lst1.stream().filter(s -> s.startsWith("r")).findAny();
		if(opt.isPresent()){
			System.out.println("element found");
		}

	}

}
