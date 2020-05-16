package com.wealth.certificate.dumps_1z0_808.question169;

public class Test {

	public static void main(String[] args) {
		int row = 10;
		for(;row>0;) {
			int col = row;
			while(col >= 0) {
				System.out.println(col + " ");
				col -= 2;
			}
			row = row / col;
		}		
	}
}
