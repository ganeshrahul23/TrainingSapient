package com.pack7;

import java.util.concurrent.Callable;

public class MyCallabale implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for(int i=1; i<=500; ++i){
			sum += i;
			System.out.println("callable " + i);
		}
		return sum;
	}

}
