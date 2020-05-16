package com.wealth.certificate.dumps_1z0_808.question131;

public class Test {

	public static void main(String[] args) {
		String[] arr = { "A", "B", "C", "D" };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if (arr[i].equals("C")) {
				continue;
			}
			System.out.println("Work Done");
			break;
		}

	}

}
