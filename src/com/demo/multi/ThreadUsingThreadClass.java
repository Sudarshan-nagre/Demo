package com.demo.multi;

public class ThreadUsingThreadClass extends Thread{
	
	@Override
	public void run() {
		for(int i=101;i<=200;i++)
			System.out.println("i : "+i);
	}
}
