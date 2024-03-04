package com.demo.collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList<>();
		ll.add("qbc");
		ll.addFirst("123");
		ll.add(1, "asjf");
		ll.add("123");
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		ll.forEach(System.out::println);
		
		ll.remove();
	}
}
