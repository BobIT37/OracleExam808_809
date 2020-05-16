package com.wealth.certificate.study_1z0_809.chapter06.Generic01;

import java.util.ArrayList;
import java.util.List;

public class Generics {
	public static void main(String[]args){
		//------------------generic or raw type-----------------
		List list = new ArrayList();  // no generics but it's call "raw type"
		List<String> generic = new ArrayList<String>(); 
		
		list.add("a");
		list.add(new Integer(1));
		list.add(Boolean.TRUE);
		System.out.println((String) list.get(0)); //This can lead to ugly runtime errors and more complexity
		
		
		//------------------generic type checking----------------
		//generics were added in Java 5 as a mechanism for type checking.
		List<String> listStr = new ArrayList<String>(); //telling the COMPILER to check that only String
		listStr.add("a"); // OK
		listStr.add(new Integer(1)); // Compile-time error
		listStr.add(Boolean.TRUE); // Compile-time error
		System.out.println(listStr.get(0)); //only have values of one type
	}
	
	
	

}
