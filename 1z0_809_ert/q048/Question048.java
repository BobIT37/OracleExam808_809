package com.wealth.certificate.dumps_1z0_809_ert.question048;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Question048 {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		final String str1 = "Java";
		StringBuffer strBuf = new StringBuffer("Course");
		UnaryOperator<String> u = (str2) -> str1.concat(str2); //line n1
		UnaryOperator<String> c = (str3) -> str3.toLowerCase(); 
		System.out.println(u.apply(c.apply(strBuf))); //line n2
		
		/*
		final String str1 = "Java";
		String strBuf = new String("Course");
		UnaryOperator<String> u = (str2) -> str1.concat(str2); //line n1
		UnaryOperator<String> c = (str3) -> str3.toLowerCase(); //line n2
		System.out.println(u.apply(c.apply(strBuf)));
		*/
	}
}

/*
	What is the result?

A) A Compilation Error occurs at line n2.
B) A Compilation Error occurs at line n1.
C) courseJava
D) Javacourse
	
	
	Answer : B
 */