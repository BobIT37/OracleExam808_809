package com.wealth.certificate.dumps_1z0_809_ps.question014;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Emp
{
	String fName;
	String lName;
	public Emp (String fn, String ln) {
		fName = fn;
		lName = ln;
	}
	public String getfName() { return fName; }
	public String getlName() { return lName; }
	
	public static void main(String[] args)
	{
		List<Emp> emp = Arrays.asList (
			new Emp ("John", "Smith"),
			new Emp ("Peter", "Sam"),
			new Emp ("Thomas", "Wale"));
		
		emp.stream()
		
		//line n1
		/*A.*/ .sorted (Comparator.comparing(Emp::getfName).reversed().thenComparing(Emp::getlName))
		/*B.*/ //.sorted (Comparator.comparing(Emp::getfName).thenComparing(Emp::getlName))
		/*C.*/ //.map(Emp::getfName).sorted(Comparator.reverseOrder())
		/*D.*/ //.map(Emp::getfName).sorted(Comparator.reverseOrder().map(Emp::getlName).reserved
		
		.collect(Collectors.toList());

		/** Answered : A is correct **/
	}

}
