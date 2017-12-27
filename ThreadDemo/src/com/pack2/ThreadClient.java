package com.pack2;

public class ThreadClient {

	public static void main(String[] args) {
		MyRunnable r1 = new MyRunnable();
		Thread t1 = new Thread(r1);
		
		MyRunnable r2 = new MyRunnable();
		Thread t2 = new Thread(r2);
		
		Runnable r3 = () -> {
			for(int i = 1; i<= 1000; i++){
				System.out.println(Thread.currentThread().getName() + " " + i);
			}
		};
		Thread t3 = new Thread(r3);
		
		t1.setName("ram");
		t2.setName("sammy");
		t3.setName("dassssss");
		
		t1.start();
		t2.start();
		t3.start();
		
		for(int i = 1; i<= 1000; i++){
			System.out.println(Thread.currentThread().getName() + " " + i);
		}

	}

}
