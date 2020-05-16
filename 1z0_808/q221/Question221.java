
package com.wealth.certificate.dumps_1z0_808.question221;

public class Question221 {

	public static void main(String[] args) {

		// insert code here

		// A. can compile >> object is null
//		int[][] arr = null;

		// B. mismatch syntax if initial array 2dim must be 2 square brackets
//		int[][] arr = new int[2];

		// C. can be >> new with 2 square brackets >> 1st must be integer and 2nd optional integer (can be empty)
//		int[][] arr = new int[2][];

		// D. mismatch syntax >> 1st square bracket must be int value
//		int[][] arr = new int[][4];

		// E. can be
//		int[][] arr = new int[2][0];

		// F. can be
//		int[][] arr = new int[0][4];

		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;

		arr[1] = new int[4];
		arr[1][0] = 10;
		arr[1][1] = 20;
		arr[1][2] = 30;
		arr[1][3] = 40;

	}
}
