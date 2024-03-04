package com.demo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EHDemo {
	public static void main(String[] args) {
		var st1 = new Student(101, "Ram", "xyz");
		var st2 = new Student(102, "Jai", "pune");
		var st3 = new Student(103, "Shyam", "abc");
		var st4 = new Student(101, "Ram", "pune");
		
		List<Student> studentMap = new ArrayList();
		studentMap.add(st1);
		studentMap.add(st3);
		studentMap.add(st4);
		studentMap.add(st2);
		System.out.println(studentMap);
		System.out.println("-----------------------------------");
		Collections.sort(studentMap);//using Comparable
		System.out.println(studentMap);
		
		Comparator<Student> basedOnName = new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getName().compareTo(s2.getName());
			}
		};
		
		Comparator<Student> basedOnAdd = new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getAdd().compareTo(s2.getAdd());
			}
		};
		
		System.out.println("-----------------------------------");
		Collections.sort(studentMap,(s1,s2)->{return s1.getName().compareTo(s2.getName());});//using Comparator
		System.out.println(studentMap);
	}
}
