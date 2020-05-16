package com.wealth.certificate.dumps_1z0_809.question043.ext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MyCollectObject2 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		Supplier<List<Integer>> supplier = new Supplier<List<Integer>>() {
			@Override
			public List<Integer> get() {
				return new ArrayList<Integer>();
			}
		};

		BiConsumer<List<Integer>, Integer> accumulator = new BiConsumer<List<Integer>, Integer>() {
			@Override
			public void accept(List<Integer> myList, Integer element) {
				myList.add(element);
			}
		};

		BiConsumer<List<Integer>, List<Integer>> combiner = new BiConsumer<List<Integer>, List<Integer>>() {
			@Override
			public void accept(List<Integer> m1, List<Integer> m2) {
				m1.addAll(m2);
			}
		};

		System.out.println("Collect with interface");
		list.stream().collect(supplier, accumulator, combiner).forEach((e)->System.out.println(e));
		
		System.out.println("Collect with lambda");		
		list.stream().collect( 
			() -> {return new ArrayList<Integer>();}
			, (List<Integer> m, Integer e) -> m.add(e)
			, (List<Integer> m1, List<Integer> m2) -> m1.addAll(m2)
		).forEach((e)->System.out.println(e));
		
		System.out.println("Collect with lambda + method ref");		
		list.stream().collect( 
			ArrayList::new
			, (a,b) -> a.add(b) 
			, (a,b) -> a.addAll(b)
		).forEach((e)->System.out.println(e));
		
		
		System.out.println("Collect with Collectors");
		list.stream().collect(Collectors.toList()).forEach(e -> System.out.println(e));

	}

}
