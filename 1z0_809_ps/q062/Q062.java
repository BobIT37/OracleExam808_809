//Duplicate to 1z0-809 q.003 & 1z0-809_vce q.27
package com.wealth.certificate.dumps_1z0_809_ps.question062;

import java.util.Arrays;
import java.util.List;

public class Q062 {

	public static void main(String[] args) {
		List<String> listVal = Arrays.asList("Joe", "Paul", "Alice", "Tom");
		// A. print 2
		System.out.println(listVal.stream().filter(x -> x.length() > 3).count());
		// B. map all object and print 4
		// System.out.println(listVal.stream().map(x -> x.length() > 3).count());
		// C. syntax error
		// listVal.stream().peek(x->x.length()>3).count().get();
		// D. syntax error cause cannot convert string to int
		// listVal.stream().filter(x->x.length()>3).mapToInt(x->x).count();
	}
}

/*
Given the code fragment:

List<String> listVal = Arrays.asList("Joe","Paul","Alice","Tom");
System.out.println( ); // line n1

Which code fragment, when inserted at line n1, enables the code to print the count of string elements 
whose length is greater than three ?
A. System.out.println(listVal.stream().filter(x->x.length()>3).count());
B. System.out.println(listVal.stream().map(x->x.length()>3).count());
C. listVal.stream().peek(x->x.length()>3).count().get(); 
D. listVal.stream().filter(x->x.length()>3).mapToInt(x->x).count();

*
*
Answer: A
*
*/