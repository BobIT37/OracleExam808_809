package com.wealth.certificate.dumps_1z0_809_ert.question052;

import java.util.Arrays;
import java.util.List;

public class Question052 
{
	public static void main(String[] args)
	{
		List<String> cs = Arrays.asList("Java", "Java EE", "Java ME");
		
		//line n1
	// A) : true because it found any "Java" in array cs
	// boolean b = cs.stream().findAny().get().equals("Java");
	// B) : true because it match any "Java" in array cs
	// boolean b = cs.stream().anyMatch(w -> w.equals("Java")); 
	// C) : false because it is not match all "Java" in array cs
		boolean b = cs.stream().allMatch(w -> w.equals("Java"));
	// D) : true : because it get first item in array cs is "Java" 
	// boolean b = cs.stream().findFirst().get().equals("Java");
		
		System.out.print(b);
		
		/** C is Correct **/
	}
}