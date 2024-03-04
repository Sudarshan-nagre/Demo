package com.demo.multi;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class Operations extends Object{
	int amount = 1000;
	synchronized void withdraw(int amount) {//1500
		System.out.println("Ram is withdrawing : "+ amount);
		if(this.amount < amount) {
			System.out.println("Going to slip--- less amount waiting to deposit");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.amount = this.amount - amount;
		System.out.println("Withdraw completed...");
	}
	
	synchronized void deposit(int amount) {
		System.out.println("Going to deposit !!!");
		this.amount = this.amount + amount;
		System.out.println("Deposit completed !!!");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		notifyAll();
	}
	
	public static void main(String[] args) {
		Operations op = new Operations();
		
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				op.withdraw(1500);
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("After main sleep");
		
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				op.deposit(2000);
			}
		};
		Thread t2 = new Thread(r2);
		t2.start();
		
		Callable<String> t3 = new Callable<String>() {
			@Override
			public String call() throws Exception {
				return "Hello";
			}
		};
	}
}
