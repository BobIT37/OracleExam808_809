package com.wealth.certificate.exam_1z0_808.question017;

public class Test {

	public static void main(String[] args) {
		String [] strArray = {"Thomas", "Perer", "Josepht"};
		String [] resultArray = new String[3]; 
		int idx = 0;
		try {
			for(String s : strArray) {
				resultArray[idx] = s.substring(2, 6);
				idx++;
			}
		} catch (Exception e) {
			System.out.println("invalid limit");
		}
		for(String s : resultArray) {
			System.out.println(s);
		}
	}
	/*Answer : invalid
			   omas
			   null
			   null*/

}
