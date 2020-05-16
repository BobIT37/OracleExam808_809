package com.wealth.certificate.study_1z0_809.chapter12.stream04.collect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Collect {
	
	public static void printPeek(String s) {
		System.out.println("@"+Thread.currentThread().getId()+"-peek : "+s);
	}
	public static void printPeek(Person s) {
		System.out.println("@"+Thread.currentThread().getId()+"-peek : "+s);
	}
	
	public static void main(String[] args) {
		
		List<Person> personList = Arrays.asList(
				new Person("Max", 18),
				new Person("Peter", 23),
				new Person("Pamela", 23),
				new Person("Ed", 23),
				new Person("David", 12)
				);
		
		
		// Stream to List
		List<Person> filteredP = personList
					.stream()
					.filter(p -> p.name.startsWith("P"))
					.peek(Collect::printPeek)
					.collect(Collectors.toList());
		System.out.println("collect to List:" + filteredP); 
		System.out.println("------------------------------------");
			
		
		// Steam to Map (by grouping)
		Map<Object, List<Person>> listToMap = personList
					.stream()
					.peek(Collect::printPeek)
					.collect(Collectors.groupingBy(p -> p.age));
//		listToMap.forEach((key, value) -> System.out.format("key %s: %s\n", key, value));
		System.out.println("collect to Map(grouping): " + listToMap);
		System.out.println("------------------------------------");
		
		
		Map<Integer, String> map = personList
				    .stream()
				    .peek(Collect::printPeek)
				    .collect(
				    		Collectors.toMap(
					        p -> p.age,									// key
					        p -> p.name,									// value
					        (name1, name2) -> name1 + ", " + name2		// merger
				        ));
		System.out.println("list to Map: " + map);
		System.out.println("------------------------------------");

		Double averageAge = personList
				    .stream()
//				    .peek(Collect::printPeek)
				    .collect(Collectors.averagingInt(p -> p.age));	// Int, Double, Long
		System.out.println("average of age is " + averageAge); 
		System.out.println("------------------------------------");
		
		IntSummaryStatistics ageSummary = personList
			        .stream()
			        .collect(Collectors.summarizingInt(p -> p.age));	// Int, Double, Long
		System.out.println("summarizing: " + ageSummary); 			// count, sum, min, average, max
		System.out.println("------------------------------------");
		
		String phrase = personList
				    .stream()
				    .filter(p -> p.age >= 18)
				    .peek(Collect::printPeek)
				    .map(p -> p.name+"("+p.age+")")
				    .collect(Collectors.joining(" and ", "In Germany ", " are of legal age."));	// delimiter, prefix, suffix
//				    	.collect(Collectors.joining(" and "));	// delimiter
		System.out.println(phrase); 	
		System.out.println("------------------------------------");

	}
}

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name;
	}
}
