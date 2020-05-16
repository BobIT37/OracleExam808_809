
package com.wealth.certificate.dumps_1z0_808.question207;

public class Question207 {

	public static void main(String[] args) {
	
		String[][] arra = new String[3][];
		arra[0] = new String[]{"rose", "lily"};
		arra[1] = new String[]{"apple", "berry","cherry","grapes"};
//		arra[0] = new String[]{"beans", "carrot","potato"};	// option 1
		arra[2] = new String[]{"beans", "carrot","potato"};	// option 2
		// insert code fragment here
		
//		A. 	//option 1:  incorrect >> index 3 has not initial yet. and cannot access, NullPointerException
			//option 2:  correct answer
//		for (int i = 0; i < arra.length; i++) {
//			for (int j = 0; j < arra[i].length; j++) {
//				arra[i][j] = arra[i][j].toUpperCase();
//			}
//		}
		
//		B.	incorrect >>
		// 1. ArrayIndexOutOfBoundsException >> inner loop ref index that out of bound arra[0] >>  เพราะแต่ละ array ของมิติที่ 1 ไม่ได้มี Size เท่ากัน 
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 4; j++) {
//				arra[i][j] = arra[i][j].toUpperCase();
//			}
//		}
		
//		C.	incorrect mismatch syntax >> for (element : collections)
//		for (String a[]:arra[][]) {
//			for (String x:a[]) {
//				
//			}
//		}
		
//		D. 
//		toUpperCase();
//		}
//		}
		
//		E.  incorrect mismatch syntax
//		for (int i : arra.length) {
//			for (String x : arra) {
//				arra[i].toUpperCase();
//			}
//		}
		
	}
}
