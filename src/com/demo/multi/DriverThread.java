package com.demo.multi;

public class DriverThread {

	public static void main(String[] args) {
		PrintNumber pn = new PrintNumber();
		
		MyThread4 t4 = new MyThread4(pn);
		t4.start();
		
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				pn.printGivenNumber(10);
			}
		};
		Thread t1 = new Thread(r1);
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				pn.printGivenNumber(20);
			}
		};
		Thread t2 = new Thread(r2);
		t2.start();
		
		Runnable r3 = new Runnable() {
			@Override
			public void run() {
				pn.printGivenNumber(25);
			}
		};
		Thread t3 = new Thread(r3);
		t3.start();
	}
}
