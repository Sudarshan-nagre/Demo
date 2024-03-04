package com.demo.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TeeingDemo {

	public static void main(String[] args) {
		var result = Arrays.asList("Sudarshan","Shiv","Pooja","Sneha","Shyam","Ajay","Madhuri")
		.stream().collect(Collectors.teeing(Collectors.filtering(n->n.startsWith("S"), Collectors.toList()),
				Collectors.filtering(n->!n.startsWith("S"), Collectors.toList()), 
				(l1,l2)->{
					Map<String, List<String>> m = new HashMap<>();
					m.put("Start With 'S'", l1);
					m.put("Other ", l2);
					return m;
				}));
		System.out.println(result);
		
		var result1 = Arrays.asList("Sudarshan","Shiv","Pooja","Sneha","Shyam","Ajay","Madhuri")
				.stream().collect(Collectors.teeing(Collectors.filtering(n->n.length()>=5, Collectors.toList()),
						Collectors.filtering(n->n.length()<5, Collectors.toList()), 
						(l1,l2)->{
							List<List<String>> list = new ArrayList<>();
							list.add(l1);
							list.add(l2);
							return list;
						}));
				System.out.println(result1);
	}

}
