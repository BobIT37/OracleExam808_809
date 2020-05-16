package com.wealth.certificate.dumps_1z0_808.question056;

public class Test
{
	public static void main(String[] args) {
		String[][] arr = {{"A", "B", "C"}, {"D", "E"}};
		for (int i = 0; i < arr.length; i++) { // 1st, i = 0,1
			for (int j = 0; j < arr[i].length; j++) { // 2nd, j = 0,1,2 and 0,1
				System.out.print(arr[i][j] + " "); // Go to Answered
				if (arr[i][j].equals("B")) {
					break;
				}
			}
			continue;
		}
		
		/** Answered : C is correct **/
		/* In inner loop j:
		 *  arr[0][0] + " " = "A "			; A != B	, skip if
		 *  arr[0][1] + " " = "A B "		; B = B	, break inner loop j and continue (j = 2 skipped)
		 *  arr[1][0] + " " = "A B D "	; D != B	, skip if
		 *  arr[1][1] + " " = "A B D E "	; E != B	, skip if
		 *  
		 *  "A B D E " is correct printed.
		 */
	}
}
