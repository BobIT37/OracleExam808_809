package com.wealth.certificate.dumps_1z0_809.question028.p2;

import com.wealth.certificate.dumps_1z0_809.question028.p1.*;
import com.wealth.certificate.dumps_1z0_809.question028.p3.*;

public class Test {
	public static void main(String[] args)
	{
		// Same 1Z0-808 : Q174, Q203
		/** Answered : C is incorrect, Correct is D (line n3) **/
		DoInterface doi = new DoClass();		// line n3 : Compile error because DoClass Access Modifier must changed Package-Private to Public.
		// If question is incomplete
		//doi.method1(100);
		//doi.method2(200);
		doi.m1(100);
		doi.m2(200);
	}
}
