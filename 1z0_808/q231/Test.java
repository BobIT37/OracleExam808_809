package com.wealth.certificate.dumps_1z0_808.question231;

public class Test {

	public static void main(String[] args) {

		String shirts[][] = new String[2][2];
		shirts[0][0] = "red";
		shirts[0][1] = "blue";
		shirts[1][0] = "small";
		shirts[1][1] = "medium";
		/* A. */
		/*
		 * for (int index = 1; index < 2; index++) { for (int idx = 1; idx < 2;
		 * idx++) { System.out.print(shirts[index][idx] + ":"); } }
		 */ // print medium: because initial index and idx = 1

		/* B. */ /*
					 * for (int index = 0; index < 2; ++index) { for (int idx =
					 * 0; idx < index; ++idx) {
					 * System.out.print(shirts[index][idx] + ":"); } }
					 */ // print >> small: because ++ before

		/* C. */
		/*
		 * for(String c : colors){ for (String s : sizes){
		 * System.out.println(s+":"); } }
		 */ // compile error

		/* D. */

		for (int index = 0; index < 2;) {
			for (int idx = 0; idx < 2;) {
				System.out.print(shirts[index][idx] + ":");
				idx++;
			}
			index++;
		}

	}
}
