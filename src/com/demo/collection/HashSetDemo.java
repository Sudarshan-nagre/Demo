package com.demo.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet set = new HashSet<>(10);
		set.add(10);
		set.add("abc");
		set.add('d');
		
		set.add(10);
		
		ArrayList list1 = new ArrayList<>(10);
		list1.add("abc");
		list1.add("mno");
		
		set.addAll(list1);
		
		System.out.println(set);
		//set.forEach(System.out::println);
		
		Iterator it =set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
		System.out.println(set);
		
	}

}
