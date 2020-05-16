package com.wealth.certificate.dumps_1z0_809.question049;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(10,20,8);
		//Comparator<Integer> comp = (p1, p2) -> Integer.compare(p1, p2);
		System.out.println(
				
				/*A*/
				nums.stream().max(Comparator.comparing(a -> a)).get()
				//or
				//nums.stream().max(comp).get()
				
				
				/*B*///nums.stream().max(Integer::max).get() //Integer::max not a Comparator reference : https://www.programcreek.com/2014/01/why-stream-maxintegermax-compile/
				
				/*C*///nums.stream().max()  
				
				/*D*///nums.stream().map(a -> a).max()
								
		);
		
	}

}

// C And D not correct because The method max(Comparator<? super Integer>) in the type Stream<Integer> is not applicable for the arguments ()