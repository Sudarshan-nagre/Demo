package com.demo.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		set.add(10);
		set.add(12);
		set.add(13);
		
		set.add(10);
		
		ArrayList<Integer> list1 = new ArrayList<>(10);
		list1.add(14);
		list1.add(18);
		
		set.addAll(list1);
		
		System.out.println(set);
	}

}
