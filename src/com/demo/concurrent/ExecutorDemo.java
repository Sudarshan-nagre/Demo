package com.demo.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorDemo {

	public static void main(String[] args) {

		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("This is my thread : 1");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Runnable r2 = new Runnable() {

			@Override
			public void run() {
				System.out.println("This is my thread : 2");
			}
		};
		
		Callable<String> c1 = new Callable<String>() {
			
			@Override
			public String call() throws Exception {
				System.out.println("This is callable...");
				return "This is callable thread";
			}
		};

		//ExecutorService service = Executors.newCachedThreadPool();
		ScheduledExecutorService service = Executors.newScheduledThreadPool(2);
		//service.schedule(r2, 10, TimeUnit.SECONDS);
		//service.scheduleAtFixedRate(r2, 2, 10, TimeUnit.SECONDS);
		Future<String> f = service.submit(c1);
		/*
		 * try { Thread.sleep(2000); } catch (InterruptedException e) {
		 * e.printStackTrace(); }
		 */
		
		if(f.isDone()) {
			try {
				String s = f.get();
				System.out.println(s);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		
		/*
		 *  service.execute(r2); service.shutdown();
		 */
		service.shutdown();
		service.execute(r2);
		try {
			service.awaitTermination(5, TimeUnit.SECONDS);//Ex
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		/*
		 * List<Runnable> l =service.shutdownNow(); System.out.println(l.size());
		 * 
		 * Runnable r = l.get(0); System.out.println(r.toString());
		 */

	}
}
