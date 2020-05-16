package com.wealth.certificate.dumps_1z0_809.question048;

public class Test {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.read("Java Programming"); // cannot access private method
		Book b2 = new EBook();
		b2.read("http://ebook.com/ebook"); // cannot access private method
	}
	
}

/*
What is the result?

A. Read Java Programming
View http:/ ebook.com/ebook
B. Read Java Programming
Read http:/ ebook.com/ebook
C. The EBook.java file fails to compile
D. The Test.java file fails to compile

Answer: D 
*/
