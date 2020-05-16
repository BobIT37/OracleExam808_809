package com.wealth.certificate.dumps_1z0_809_vce.question014;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

interface CourseFilter extends Predicate<String> {
	public default boolean test (String str) {
		return str.equals ("Java");
	}
}

public class Test
{
	public static void main(String[] args)
	{
		List<String> strs = Arrays.asList("Java", "Java EE", "Java ME");
		Predicate<String> cf1 = s -> s.length() > 3;
		Predicate cf2 = new CourseFilter() { //line n1
		public boolean test (String s) {
			return s.contains ("Java");
		}
		};
		long c = strs.stream()
		.filter(cf1)
		.filter(cf2) //line n2
		.count();
		System.out.println(c);
		
		/** Answered : A is incorrect, Correct is B because compile correctly and Predicate check String length is more than 3. **/
	}
}