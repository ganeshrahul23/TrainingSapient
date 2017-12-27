package com.pack7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableClient {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService pool = Executors.newCachedThreadPool();
		
		MyCallabale c1 = new MyCallabale();
		System.out.println("line 1");
		System.out.println("line 2");
		
		Future<Integer> future = pool.submit(c1);
		System.out.println(future.get());

	}

}
