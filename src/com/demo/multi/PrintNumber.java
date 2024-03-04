package com.demo.multi;

public class PrintNumber {

	//synchronized void printGivenNumber(int n){
	 void printGivenNumber(int n){
		System.out.println(Thread.currentThread().getName());
		synchronized(this){
			for(int i=1;i<=n;i++) {
				System.out.println(Thread.currentThread().getName()+" : "+i);
			}
		}
	}
	 
	 static {
		 System.out.println("this is static block");
	 }
}
