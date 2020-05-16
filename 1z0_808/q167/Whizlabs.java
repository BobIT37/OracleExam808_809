package com.wealth.certificate.dumps_1z0_808.question167;

import java.util.ArrayList;
import java.util.List;

public class Whizlabs {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(21); list.add(15);
		list.add(30); list.add(11);
		list.add(2);
		
		// A. list.removelf(e > e%2 != 0); --> wrong cause syntax error lambda expression
		//list.removeIf(e > e%2 != 0); // Fixed A by using > instead of ->
		
		// B. list.removelf(e -> e%2 != 0); --> wrong cause remove odd number
		//list.removeIf(e -> e%2 != 0); // Fixed B by using != instead of ==
		
		// C. list.removelf(e -> e%2 = 0); --> correct due to remove even number
		list.removeIf(e -> e%2 == 0); 
		
		// D. list.remove(e -> e%2 = 0); --> wrong cause remove method receive object not predicate
		//list.remove(e -> e%2 == 0); // Fixed D by using remove instead of removeIf
		
		// E. None of the above. --> wrong cause choice c is correct
		
		System.out.println(list);
	}
	
}
