package com.wealth.certificate.dumps_1z0_809_ert.question035;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Question035 {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		List<String> li = Arrays.asList("Java", "J2EE", "J2ME", "JSTL", "JSP", "Hello");
		Predicate<String> val = p -> p.contains("J");
		List<String> neLi = li.stream().filter(x -> x.length()>3)
		.filter(val).collect(Collectors.toList());
		System.out.println(neLi);
	}
}

/*
	What is the result?

A) null
B) A compilation error occurs. 
C) [Java, J2EE, J2MF, JSTL]
D) [Java, J2EE, J2MR, JSTL, JSP]
	
	
	Answer : C
 */