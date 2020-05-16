package com.wealth.certificate.dumps_1z0_809.question043;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Emp {

	String fName;
	String lName;

	public Emp(String fn, String ln) {
		fName = fn;
		lName = ln;
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}
	
	//Add for printable
	public String toString() {
		return fName+" "+lName;
	}
	
	public static void main(String[] args) {
		
		List<Emp> emp = Arrays.asList (new Emp ("John", "Smith"), new Emp ("Peter", "Sam"), new Emp ("Thomas", "Wale"));		
		//List<Emp> emp = Arrays.asList (new Emp ("111", "333"), new Emp ("222", "222"), new Emp ("222", "111"));
		emp.stream().forEach(p->System.out.println(p));
		System.out.println("--------------");

		
		emp.stream()
		
		//line n1
		// A
		.sorted(Comparator.comparing(Emp::getfName).reversed().thenComparing(Emp::getlName))		
			
		// B
		//.sorted(Comparator.comparing(Emp::getfName).thenComparing(Emp::getlName))
		
		// C
		//.map(Emp::getfName).sorted(Comparator.reverseOrder())

		// D
		//.map(Emp::getfName).sorted(Comparator.reverseOrder().map(Emp::getlName).reversed()
				
		.collect(Collectors.toList()).stream().forEach(p->System.out.println(p)); // modify for printable
			

	}


}
