package com.pack6;

public class ThreadClient {
	
	public static void main(String args[]) {
		Que obj = new Que();
		Producer p = new Producer(obj);
		p.start();
		Consumer c = new Consumer(obj);
		c.start();
		
	}
}