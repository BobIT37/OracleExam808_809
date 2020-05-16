package com.wealth.certificate.dumps_1z0_809.question003;

import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<String> listVal = Arrays.asList("Joe", "Paul", "Alice", "Tom");
		System.out.println (
				// line n1
				//A
				//listVal.stream().filter(x -> x.length()>3).count()
				//B
//				listVal.stream().map(x -> x.length()>3).count()
				//C Error
				
				//listVal.stream().peek(x -> x.length()>3).count().get()
				//listVal.stream().peek(x -> {}).count().get()
				//D	Error
				listVal.stream().filter(x -> x.length()>3).mapToInt(x -> x).count()
				//listVal.stream().filter(x -> x.length()>3).mapToInt(x -> Integer.parseInt(x)).count()
				
		);
	}
}
