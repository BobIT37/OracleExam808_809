package com.wealth.certificate.dumps_1z0_808.question022;

import java.util.ArrayList;
import java.util.List;

public class Ref {
	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("Hello Java!");
		String s2 = s1.toString();
		List<String> lst = new ArrayList<String>();
		lst.add(s2);
		System.out.println(s1.getClass());
		System.out.println(s2.getClass());
		System.out.println(lst.getClass());
	}
}
