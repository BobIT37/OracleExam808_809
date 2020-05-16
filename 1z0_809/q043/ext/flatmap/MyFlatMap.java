package com.wealth.certificate.dumps_1z0_809.question043.ext.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyFlatMap {

	public static void main(String[] args) {
		
		/*
		Stream<String[]>		-> flatMap ->	Stream<String>
		Stream<Set<String>>		-> flatMap ->	Stream<String>
		Stream<List<String>>	-> flatMap ->	Stream<String>
		Stream<List<Object>>	-> flatMap ->	Stream<Object>
		*/
		
		Stream<List<String>> listStream = Stream.of(Arrays.asList("a","b","c"),Arrays.asList("x","y","z"));	
		
		Function<List<String>, Stream<String>> logic = new Function<List<String>, Stream<String>>() {			
			@Override
			public Stream<String> apply(List<String> t) {
				return t.stream();
			}
		};		
		listStream.flatMap(logic).forEach(System.out::println);
		
		listStream = Stream.of(Arrays.asList("a","b","c"),Arrays.asList("x","y","z"));
		listStream.flatMap( (list)->list.stream()).forEach(System.out::println);
		
				
		listStream = Stream.of(Arrays.asList("1","2","3"),Arrays.asList("4","5","6"));
		listStream.flatMapToInt( (list)->list.stream().mapToInt(s->Integer.parseInt(s)) ).forEach(System.out::println);
				
		
	}

}
