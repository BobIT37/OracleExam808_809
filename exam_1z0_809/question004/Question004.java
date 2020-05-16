package com.wealth.certificate.exam_1z0_809.question004;

import java.util.stream.Stream;

public class Question004 {
	public static void main(String[] args) {
		Stream<String> strs = Stream.of("a|b|c","","x|y|z");	//I can't remember the words, this is example
		strs.flatMap(str -> Stream.of(str.split("|")))
		.forEach(System.out::print);;
	}
}

/*
What is the result?
A. a|b|cx|y|z
B. Compile Error
C. Throw Exception

*/