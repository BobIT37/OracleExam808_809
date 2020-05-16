package com.wealth.certificate.dumps_1z0_809_ert.question065;

import java.util.ArrayDeque;
import java.util.Deque;

public class Question065 
{
	public static void main(String[] args)
	{
		Deque<Integer> nums = new ArrayDeque<>();
		nums.add(1000);
		nums.push(2000); // addFirst
		nums.add(3000);
		nums.push(4000); // addFirst
		Integer i1 = nums.remove(); // 4000, 2000, 1000, 3000
		Integer i2 = nums.pop(); // 2000, 1000, 3000
		System.out.println(i1 + " : " + i2);
		
	// A) 1000 : 2000 
	// B) 4000 : 2000
	// C) 4000 : 1000
	// D) 1000 : 4000
		
		/** B is Correct **/
	}
}