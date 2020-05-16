package com.wealth.certificate.dumps_1z0_809_ert.question012;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Question012 {
	
	public static void main(String[] args) {
		// A --> wrong (intermediate operation)
		/************************ distinct ***********************/
		System.out.println("Distinct");
		Collection<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "C");
		// Get collection without duplicate i.e. distinct only
		List<String> distinctElements = list.stream().distinct().collect(Collectors.toList());
		//Let's verify distinct elements
		System.out.println(distinctElements); // [A, B, C, D]
		
		// B --> wrong (intermediate operation)
		/************************ filter ***********************/
		System.out.println("\nFilter");
		List<Integer> listFilter  = Arrays.asList(3, 12, 23, 44, 20, 10, 17, 8);
		List<Integer> evenList = listFilter.stream().filter(i -> i%2 == 0)
				.collect(Collectors.toList());
		evenList.forEach(s -> System.out.print(s+" "));
		
		// C --> correct (terminal operation)
		/************************ count ***********************/
		System.out.println("\nCount");
		List<String> listCount = Arrays.asList("AA","AB","CC","CC");
        long l= listCount.stream().filter(s-> s.startsWith("C")).distinct().count();
        System.out.println("Number of Matching Element:"+l);
		
        // D --> correct (terminal operation)
        /************************ collect ***********************/
        System.out.println("\nCollect");
        List<String> listCollect = Arrays.asList("A","B","C","D","E");
        System.out.println(listCollect.stream().collect(Collectors.joining(", ")));
        
        // E --> wrong (intermediate operation)
        /************************ peek ***********************/
        System.out.println("\nPeek");
        List<Integer> listPeek = Arrays.asList(10,11,12);
        listPeek.stream().peek(i->System.out.println(i*i)).collect(Collectors.toList());
        //listPeek.stream().peek(i->System.out.print((i*i)+"]]] ")).forEach(s -> System.out.println(s+",,, "));
	}
	
}
