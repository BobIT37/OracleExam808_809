package com.wealth.certificate.dumps_1z0_808.question086;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static List data = new ArrayList();

	// insert code here
//	A. 
//	List update (String[] strs)
//	B. 
//	Static ArrayList update(String [] strs)
//	C.
//	Static List update (String [] strs)
	static List update (String [] strs)
//	D. 
//	Static void update (String[] strs)
//	E. 
//	ArrayList static update(String [] strs)
	{
		for (String x :strs) {
			data.add(x);
		}
		return data;
	}

	public static void main(String[] args) {
		String[] d = {"a", "b", "c"};
		update(d);
		for (String s :d) {
			System.out.print(s + " ");
		}
	}
}

/*

Which code fragment, when inserted at // insert code here, enables the code to compile
and and print a b c?
A. List update (String[] strs)
B. Static ArrayList update(String [] strs)
C. Static List update (String [] strs)
D. Static void update (String[] strs)
E. ArrayList static update(String [] strs)

*/
/*
Answer: no correct answer
	change choice C to 
		static List update (String [] strs)
	will be corrected
*/
/*
 * Explanation
 * - Return Type must be next from method name
 * - static method can access only static member
 */

