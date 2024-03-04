package com.demo.collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PQDemo {
	
	public static void main(String[] args) {
		Student st1 = new Student(101, "Ram", "xyz");
		Student st2 = new Student(102, "Jai", "pune");
		Student st3 = new Student(103, "Shyam", "abc");
		Student st4 = new Student(101, "Ram", "pune");

		Comparator<Integer> no = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1>o2)
					return 1;
				if(o1<o2)
					return -1;
				else				
					return 0;
			}
		};
		
		PriorityQueue<Student> pq = new PriorityQueue<Student>();
		pq.add(st1);
		pq.add(st2);
		pq.add(st3);
		pq.offer(st4);
		
		System.out.println(pq);
		
		System.out.println(pq.element());
		
		pq.forEach(System.out::println);
		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.add(10);
		ad.add(20);
		ad.addFirst(5);
		ad.addLast(30);
		System.out.println(ad);
		
		ad.removeFirst();
		System.out.println(ad);
		
		List l = Arrays.asList(1,2,3,4,5,6,7);
		System.out.println(l);
		
		int a[] = {12,34,23,2,43,34};
		int b[] = {12,34,23,2,43};
		System.out.println(Arrays.compare(a, b));
		
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 34));
		
		for(int i : a) {
			System.out.println(i);
		}
		
	}

}
