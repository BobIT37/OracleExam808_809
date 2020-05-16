package com.wealth.certificate.dumps_1z0_808.question159;

public class Test {

	public static void main(String[] args) {
		String[] strs = new String[2];
		int idx = 0;
		for (String str : strs) {
			strs[idx].concat(" element " + idx);
		}
		for (idx = 0; idx < strs.length; idx++) {
			System.out.println(strs[idx]);
		}
	}

}
