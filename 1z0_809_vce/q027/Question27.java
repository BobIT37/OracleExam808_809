package com.wealth.certificate.dumps_1z0_809_vce.question027;

import java.util.Arrays;
import java.util.List;

public class Question27 {
	
	public static void main(String[] args) {
		List<String> listVal = Arrays.asList("Joe","Paul","Alice","Tom");
		// A. filter will print 2
		System.out.println(listVal.stream().filter(x->x.length()>3).count());
		// B. map cannot filter and will print 4 
		System.out.println(listVal.stream().map(x->x.length()>3).count());
		// C. syntax error
		//listVal.stream().peek(x->x.length()>3).count().get(); 
		// D. syntax error cause cannot convert string to int
		//listVal.stream().filter(x->x.length()>3).mapToInt(x->x).count();
	}
	
}
