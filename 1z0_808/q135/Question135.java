package com.wealth.certificate.dumps_1z0_808.question135;

import java.util.ArrayList;
//import java.util.HashSet;
import java.util.List;
//import java.util.Set;

public class Question135 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		// Set<String> names = new HashSet<>();
		names.add("Robb");
		names.add("Bran");
		names.add("Rick");
		names.add("Bran");

		if (names.remove("Bran")) {
			names.remove("Jon");
		}
		System.out.println(names);
	}

}
