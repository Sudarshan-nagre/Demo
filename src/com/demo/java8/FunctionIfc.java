package com.demo.java8;

@FunctionalInterface
public interface FunctionIfc {

	default void print() {
		System.out.println("This is default");
	}

	default void print1() {
		System.out.println("This is default");
	}
	
	private void show1() {
		
	}
	void show(int a, int b);
}

class DemoM{
	public static void main(String[] args) {
		FunctionIfc f = new FunctionIfc() {
			@Override
			public void show(int a, int b) {
				System.out.println("Addition : "+(a+b));
			}
		};
		f.show(10, 20);
		
		FunctionIfc f1 = (a, b)->{System.out.println("Addition : "+(a+b));};
		f1.show(20,30);
		
		Runnable t1 = ()->System.out.println("This is thread t1");
		Thread tt = new Thread(t1);
		tt.start();
		
	}
}
