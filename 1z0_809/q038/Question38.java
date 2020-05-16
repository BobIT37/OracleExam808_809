package com.wealth.certificate.dumps_1z0_809.question038;

import java.util.function.Function;

public class Question38 {

	public static void main(String[] args) {
		
		
		Function<Integer,Integer> add1 = x -> x + 1;
		System.out.println("<Integer,Integer>"+add1.apply(1));

		
		Function<String,String> concat = x -> x + 1;
		System.out.println("<String,String>"+concat.apply(1+""));
		
		Function<Integer,String> concat2 = x -> x+"" + 1;
		System.out.println("<Integer,String>"+concat2.apply(1));
		
		
	}

}
