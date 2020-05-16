package com.wealth.certificate.study_1z0_809.chapter07.selftest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

//2. Which of the following options can throw a NullPointerException?

public class Question_7_2 {
	public static void main(String[] args) {
		//A.
		TreeSet<String> s = new TreeSet<>();
		s.add(null);

		//B.
		HashMap<String> m = new HashMap<>();
		m.put(null, null);

		//C.
		ArrayList<String> arr = new ArrayList<>();
		arr.add(null);

		//D.
		HashSet<String> s = new HashSet<String>();
		s.add(null);
	}
}
