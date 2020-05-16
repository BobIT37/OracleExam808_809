package com.wealth.certificate.dumps_1z0_808.question098;

public class Test
{
	public static void main(String[] args) 
	{
		// int[] array = {I, 2, 3, 4, 5}; // Error if not changed I to 1
		int[] array = {1, 2, 3, 4, 5};
		
	// Enhanced for loop = foreach loop
		for (int element : array) {
			// body
		}

	// Standard for loop = normally for loop
		for (int i = 0; i < array.length; i++) {
			// body
		}

	// 1. Process all the elements of the array in the order of entry.
	// 2. Process all the elements of the array in the reverse order of entry.
	// 3. Process alternating elements of the array in the order of entry.
		
	/* Enhanced for loop */
	// The order of Enhanced for loop
		System.out.print("The order of Enhanced for-loop is ");
		for (int element : array) {
		    System.out.print(element + " ");
		}
		System.out.println();
			
	/* Standard for loop */
	// The order of entry
		System.out.print("The order of Standard for-loop is ");
		for (int i = 0; i < array.length; i++) {
		    System.out.print(array[i] + " ");
		}
		System.out.println();
	// The reverse of entry
		System.out.print("The reverse of Standard for-loop is ");
		for (int i = array.length - 1; i >= 0; i--) {
		    System.out.print(array[i] + " ");
		}
		System.out.println();
	// The alternating of entry = Jumping loop
		System.out.print("The alternating of Standard for-loop is ");
		for (int i = 0; i < array.length; i+=2) {
		   System.out.print(array[i] + " ");
		}
		System.out.println();
		
		/** Answered : B,D is correct **/
	}
}
