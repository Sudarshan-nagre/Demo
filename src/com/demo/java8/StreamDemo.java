package com.demo.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("abc");
		list.add("mno");
		list.add("abc");
		list.add("pjd");
		list.add("pqr");
		System.out.println(list);

		list.stream().filter(a->a.startsWith("m")).forEach(System.out::println);
		
		List<String> startWithP = list.stream().filter(a->a.startsWith("p")).collect(Collectors.toList());
		System.out.println(startWithP);
		
		list.stream().map(str->str.toUpperCase()).forEach(System.out::println);
		
		System.out.println(list.stream().count());
		
		System.out.println("First : "+list.stream().findFirst().get());
		
		List<Integer> it = Arrays.asList(10,203,40,34,56,67,10,23,40,56);
		it.stream().sorted().forEach(System.out::println);
		
		System.out.println("----------");
		it.stream().skip(2).forEach(System.out::println);
		
		System.out.println("----------");
		System.out.println("Max : "+it.stream().sorted(Comparator.reverseOrder()).findFirst().get());
		
		System.out.println("----------");
		it.stream().distinct().forEach(System.out::println);
		
		System.out.println("----------");
		System.out.println("Second Max : "+it.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
		
		System.out.println("----------");
		it.stream().map(e->e*2).forEach(System.out::println);
		
		System.out.println("----------");
		int sum = it.stream().mapToInt(e->e).sum();
		System.out.println("Sum : "+sum);
		
		List<List<Integer>> flt = new ArrayList<>();
		flt.add(it);
		
		List<Integer> it1 = Arrays.asList(15,35,12,14,16);
		flt.add(it1);
		
		List<Integer> it2 = Arrays.asList(100,200,300);
		flt.add(it2);
		System.out.println("----------");
		System.out.println(flt);
		
		List<Integer> it3 = flt.stream().flatMap(e->e.stream()).collect(Collectors.toList());
		System.out.println(it3);
		
		String s = "sudarshannagre";
		Map<String, Long>  map = Arrays.stream(s.split(""))
								.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
		
		map.entrySet().stream().filter(ent->ent.getValue()>2).forEach(System.out::println);
		
		//String str = null;
		//System.out.println("Length : "+str.length());
		
		Optional<String> op = Optional.ofNullable("Sudarshan");
		if(op.isPresent() && !op.isEmpty()) {
			System.out.println("Op : "+op.get());
		}else {
			System.out.println("else");
		}
		
		byte arr[] = Base64.getEncoder().encode(s.getBytes());
		System.out.println("Encoded : " + new String(arr));
		
		System.out.println("Decoded : " + new String(Base64.getDecoder().decode("c3VkYXJzaGFubmFncmU=")));
	}

}
