package com.demo.collection;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;
import java.util.function.Consumer;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();//15
		
		ArrayList list1 = new ArrayList<>(10);
		list1.add("abc");
		list1.add("mno");
		System.out.println("List 1 : "+list1);
		
		ArrayList list2 = new ArrayList<>(list);
		
		list.add("abc");
		list.add(123);
		list.add("pqr");
		//list.addAll(list1);
		list.addAll(1, list1);
		
		System.out.println("contains : "+list.contains(1213));
		
		System.out.println("remove : "+list.remove(2));
		
		System.out.println("containsAll : "+list.containsAll(list1));
		
		System.out.println(list.get(0));
		
		System.out.println("equals : "+list.equals(list));
		
		System.out.println(list);
		System.out.println(list.size());
		
		/*
		 * for(Object o : list) { System.out.println(o); }
		 */
		
		list.forEach(System.out::println);
		
		Vector v = new Vector<>();
		v.addElement("ajhfj");
		v.add("asjfj");
		
		System.out.println("Vector : "+v);
		
		Stack s = new Stack<>();
		s.add(12);
		s.addElement(21);
		s.push(43);
		
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s);
		
		System.out.println("----ListIterator-------");
		
		ListIterator li = list.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
			li.add(10);
		}
		System.out.println("----------------");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
