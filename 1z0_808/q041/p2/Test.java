package com.wealth.certificate.dumps_1z0_808.question041.p2;

import com.wealth.certificate.dumps_1z0_808.question041.p1.Acc;

public class Test extends Acc {
	public static void main(String[] args) {
		Acc obj = new Test();
		
		/*
		obj.p // error cause default access modifier in different package
		obj.q // error cause private access modifier not in same class
		obj.r // error cause protected access modifier without inheritance
		obj.s // no error case public access modifier 
		 */
		
		// A. Both p and s are accessible by obj --> wrong 
//		System.out.println("p = " + obj.p + "and s = " + obj.s);
		
		// B. Only s is accessible by obj --> true 
		System.out.println("s = " + obj.s);
		
		// C. Both r and s are accessible by obj --> wrong
//		System.out.println("r = " + obj.r + "and s = " + obj.s);
		
		// D. p,r, and s are accessible by obj. --> wrong
//		System.out.println("p = " + obj.p + ", r = " + obj.r + ", and s = " + obj.s);
	}
}
