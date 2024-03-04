package com.demo.multi;

public class MyThread4 extends Thread{

	PrintNumber pn;

	public MyThread4(PrintNumber pn) {
		this.pn = pn;
	}

	public void run() {
		pn.printGivenNumber(5);
	}
}
