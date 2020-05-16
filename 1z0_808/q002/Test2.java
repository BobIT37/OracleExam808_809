package com.wealth.certificate.dumps_1z0_808.question002;

class Test2 {
	int fvar;
	static int cvar;

	public static void main(String[] args) {
		Test2 t = new Test2();
		//insert code here to write field variables
		
//		A
		t.fvar = 200;
		
//		B
		cvar = 400;
		
//		C
//		fvar = 200;
//		cvar = 400;
		
//		D
//		this.fvar = 200;
//		this.cvar = 400;
		
//		E
		t.fvar = 200;
		Test2.cvar = 400;
		
//		F
//		this.fvar = 200;
//		Test2.cvar = 400;
	}
}

/*
Which code fragments, inserted independently, enable the code compile?
A. 	t.fvar = 200;		//can access via object

B. 	cvar = 400;			//can access static variable

C. 	fvar = 200;			//cannot access non-static variable
	cvar = 400;			//can access static variable
	
D. 	this.fvar = 200;	//cannot use this in static method
	this.cvar = 400;
	
E. 	t.fvar = 200;		//can access via object
	Test2.cvar = 400;	//can access static variable
	
F. 	this.fvar = 200;	//cannot use this in static method
	Test2.cvar = 400;	//can access static variable
	
*/

//Answer: A,B,E