package com.wealth.certificate.dumps_1z0_809_ert.question059;

import java.util.Arrays;
import java.util.List;

public class Question059 {
	public static void main(String[] args) {
		List<String> nums = Arrays.asList("EE" , "SE");
		String ans = nums
				.parallelStream ()
				.reduce("Java",(a,b) -> a.concat(b)) ;
		System.out.print(ans) ; //parallelStream() with reduce output order
		
		//-----------------------------------------------------------------------------
		System.out.println();
		System.out.println("--------------------");
		
		/*List<String> nums1 = Arrays.asList("EE" , "SE" , "CE" , "BE");
		String ans1 = nums1
				.stream()
				.reduce("Java",(a,b) -> {
					System.out.println("a: "+a+" b: "+b);
					return a.concat(b);
				});
		System.out.println(ans1) ;*/
		
		/*List<String> nums1 = Arrays.asList("EE" , "SE" , "CE" , "BE");
		String ans1 = nums1
				.parallelStream ()
				.reduce("Java",(a,b) -> {
					System.out.println("a: "+a+" b: "+b);
					return a.concat(b);
				});
		System.out.println(ans1) ;*/
		
		
		/*List<Integer> list2 = Arrays.asList(2, 3, 4);
		int res = list2.parallelStream().reduce(2, (s1, s2) -> {  //with parallel
				System.out.println("s1 "+s1+" s2 "+s2);
				return s1 * s2; 
				},
			(p, q) -> { 
				System.out.println("p"+p+" q "+q);
				return p + q;
			});
	     System.out.println(res);*/
	     //Here result will be 2*2 + 2*3 + 2*4 that  is 18. 
	     // for case of parallel will always start with identify and then merge at combiner  
	}
}
