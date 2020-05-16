package com.wealth.certificate.dumps_1z0_809_ps.question024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(10,20);
		List<Integer> list2 = Arrays.asList(15,30);
		
		//line n1
		 /*A.*/
		Stream.of(list1,list2).flatMap(list -> list.stream())
		.forEach(s->System.out.print(s+" "));
		
		 /*B.*/  // not correct because list.intStream() must be list.stream()
		/*Stream.of(list1, list2).flatMap(list -> list.intStream())
		.forEach(s -> System.out.print(s + " "));*/
		
		/*C.*/  // not correct because e1 not List<String> but e1 is String so can't use e1.stream()
		 /*list1.stream().flatMap(list2.stream()
		.flatMap(e1 -> e1.stream())
		.forEach(s -> System.out.println(s + " "));
		
		
		 /*D.*/ //not correct because Type mismatch: cannot convert from Stream<Integer> to IntStream
		/*Stream.of(list1, list2)
		.flatMapToInt(list -> list.stream())
		.forEach(s -> System.out.print(s + " "));*/	
		
	}

}
