package com.wealth.certificate.dumps_1z0_808.question075;

import java.util.ArrayList;
import java.util.List;

public class Whizlabs {

	public static void main(String[] args) {
		List<int> list = new ArrayList<>();
		list.add(21); list.add(13);
		list.add(30); list.add(11);
		list.removeIf(e -> e%2 != 0);
		System.out.println(list);
	}

}
