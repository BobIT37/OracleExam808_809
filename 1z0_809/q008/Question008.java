package com.wealth.certificate.dumps_1z0_809.question008;

import java.util.Arrays;
import java.util.List;

public class Question008 {

	public static void main(String[] args) {
		List<String> empDetails = Arrays.asList("100, Robin, HR",
												"200, Mary, AdminServices",
												"101, Peter, HR");
		empDetails.stream()
				.filter(s-> s.contains("1")) 	//filter s.contains("1") to stream
				.sorted() 						//sort value in stream
				.forEach(System.out::println);  //for loop stream to print end
	}

}
