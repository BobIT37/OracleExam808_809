package com.wealth.certificate.dumps_1z0_808.question174.p2;

import com.wealth.certificate.dumps_1z0_808.question174.p1.*;
import com.wealth.certificate.dumps_1z0_808.question174.p3.*;

class Test {

	public static void main(String[] args) {
		/*DoInterface doi = new DoClass(); // line 3
		doi.m1(100);
		doi.m2(200);*/
	}
}
/*
What is the result?
A.	100 
	210
B. Compilation fails Total Due to AN error in Line 1 
C. Compilation fails Total Due to AT AN error Line 2 
D. Compilation fails Total Due to AT AN error Line 3

[Answer]
D.

[Explain]
line n3 entity of the DoClass category of object entities
, but due to the DoClass the constructor does not use the public modified word declaration
, so it can only be on the same suite (within Package).
 If materialized Do in different packages CLASS objects, compile-time error will occur.
 */