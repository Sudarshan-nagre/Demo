package com.demo.collection;

import java.util.HashMap;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("a");
		set.add("abc");
		set.add("A");
		set.add("pqr");
		set.add("mno");
		set.add("aaa");
		set.add("aab");
		set.add("bbb");
		
		System.out.println(set.ceiling("AA"));
		System.out.println(set.floor("abc"));
		
		System.out.println(set);
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(12, "abc");
		map.put(32, "abc");
		map.put(null, "String");
		System.out.println(map);
		System.out.println(map.get(null));
	}
}
