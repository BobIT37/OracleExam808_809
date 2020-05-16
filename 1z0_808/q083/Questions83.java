package com.wealth.certificate.dumps_1z0_808.question083;

interface Readable {
	public void readBook();
	public void setBookMark();
}

abstract class Book implements Readable { // line n1
	public void readBook() { }
}

abstract class EBook extends Book {	// line n3
	public void readBook() {}
	public void setBookMark() { } // line n4
}


public class Questions83 {

	public static void main(String[] args) {
		
	}
	
}
