package com.wealth.certificate.dumps_1z0_808.question036;

public class Test036 {
	public static void main(String[] args) {
		int iArray[] = {65, 68, 69};
		iArray[2] = iArray[0];
		iArray[0] = iArray[1];
		iArray[1] = iArray[2];
		for (int element : iArray) {
			System.out.print(element + " ");
		}
	}
}
