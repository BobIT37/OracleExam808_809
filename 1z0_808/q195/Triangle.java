package com.wealth.certificate.dumps_1z0_808.question195;

public class Triangle {

	static double area;
	int b = 2, h = 3;
	public static void main(String[] args) {
		double p, b, h;		// line n1
		// Fixed error at line n2 with following code at line n1
//		double p=0, b=0, h=0;
		if (area == 0) {
			b = 3;
			h = 4;
			p = 0.5;
		}
		area = p * b * h; 	// line n2
		
		System.out.println("Area is " + area);
	}

}
