package com.demo.multi;

public class ThreadDriver {

	public static void main(String[] args) {
		ThreadUsingRunnable tr = new ThreadUsingRunnable();
		Thread t1 = new Thread(tr);
		System.out.println("t1 : "+t1.getState());
		System.out.println("T1 Name : "+t1.getName());
		t1.setName("MyThread1");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		System.out.println("t1 : "+t1.getState());
		System.out.println("T1 Name : "+t1.getName());
		//tr.run();
		
		ThreadUsingThreadClass t2 = new ThreadUsingThreadClass();
		System.out.println("t2 : "+t2.getState());
		System.out.println("T2 Name : "+t2.getName());
		t2.setName("MyThread2");
		System.out.println("T2: Priority : "+t2.getPriority());
		t2.start();
		System.out.println("T2 Name : "+t2.getName());
		System.out.println("t2 : "+t2.getState());
		//tt.run();
		System.out.println("This is main");
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				for(int i=201;i<=300;i++)
					System.out.println("i : "+i);
			}
		};
		Thread t3 = new Thread(r);
		t1.setPriority(Thread.MIN_PRIORITY);
		t3.start();
		System.out.println("t1 : "+t1.getState());
		try {
			Thread.sleep(22000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("t1 : last : "+t1.getState());
	}
}
