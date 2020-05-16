package com.wealth.certificate.dumps_1z0_808.question102;

public class Test {
static String[][] arr =new String[3][]; 
private static void doPrint() {
//insert code here
	for (int i = 0;i < arr.length;i++) {
		int j = arr[i].length-1; 
		System.out.print(arr[i][j]);
	}
}
public static void main(String[] args) {
		String[] class1 = {"A","B","C"};
		String[] class2 = {"L","M","N","O"};
		String[] class3 = {"I","J"};
		arr[0] = class1;
		arr[1] = class2;
		arr[2] = class3;
		Test.doPrint();
	}
}
