package com.wealth.certificate.dumps_1z0_808.question111;

public class Questions111 {

	public static void main(String[] args) {
		int ii = 0;
		int jj = 7;
		for (ii = 0; ii < jj - 1; ii = ii + 2) {
		/*
			round 1: ii=0, jj = 6, 0 < 6 --> print 0
			round 2: ii=2, jj = 6, 2 < 6 --> print 2
			round 3: ii=4, jj = 6, 4 < 6 --> print 4 
			round 4: ii=6, jj = 6, 6 == 6 --> not enter loop 
			
			Finally, it will print 0 2 4
		*/
			System.out.print(ii + " ");
		} 
	}

}
