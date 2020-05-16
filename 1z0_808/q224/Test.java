package com.wealth.certificate.dumps_1z0_808.question224;

public class Test
{
	public static void main(String[] args) 
	{
		for (int ii = 0; ii < 3; ii++) { // ii = 0, 1, 2
			int count = 0; // reset count = 0
			
			for (int jj = 3; jj > 0; jj--) { // jj = 3, 2, 1
				if(ii == jj) {
					++count;
					break; // break only loop jj
				}
			}
			
			System.out.print(count); 
			// 1st ii = 0, count = 0
			// 2nd ii = 1, count = 1
			// 3rd ii = 2, count = 1
			// all print = 011
			/** Answered : A is correct **/
			
			continue; // no result with answer in loop
		}
	}
}
