package com.wealth.certificate.dumps_1z0_809_ps.question099;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> empDetails = Arrays.asList("100, Robin, HR", "200, Mary, AdminServices", "101, Peter, HR");
		empDetails.stream()
		.filter(s -> s.contains("1")) 
		.sorted()
		.forEach(System.out::println); // line n1	
	}

}
