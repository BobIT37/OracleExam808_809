package com.wealth.certificate.study_1z0_809.chapter06.Generic02;

import java.util.ArrayList;
import java.util.List;

public class DiamondOperator {

	
		// Since Java 7, instead of specifying the generic type on both sides of the assignment
		List<List<String>> generic1 = new ArrayList<List<String>>();
		//can simplify the creation of the object by just writing
		List<List<String>> generic2 = new ArrayList<>();
		
		
		//---------------- be careful -------------------
		// Without the diamond operator, the raw type is used
		List<List<String>> generic = new ArrayList();
	
	
		//------------------parameter type by use diamond operator--------------- 
	void testGenericParam(List<String> list) { } //"List<String>" is declare list of string
	void test() {
	    // In Java 7, this line generates a compile error
	    // In Java 8, this line compiles fine
	    testGenericParam(new ArrayList<>()); //-> "new ArrayList<>()" use diamond operator 
	}

}
