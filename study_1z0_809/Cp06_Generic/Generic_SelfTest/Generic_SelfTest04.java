package com.wealth.certificate.study_1z0_809.chapter06.Generic_SelfTest;

import java.util.ArrayList;
import java.util.List;

public class Generic_SelfTest04 {

	public static void main(String[] args) {
		List<? super Number> list = new ArrayList<Object>(); // 1
		list.add(new Integer(2)); // 2
		list.add(new Object()); // 3
		// additional
//		List<Object> objData = (List<Object>) list;  
//		List<Integer> objData = (List<Integer>) list; 
	}
	
}
