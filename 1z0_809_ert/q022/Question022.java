package com.wealth.certificate.dumps_1z0_809_ert.question022;

public class Question022 {
	
	public double applyDiscount(double price) {
		assert (price > 0) ; //line n1
		return price * 0.50;
	}
	
	public static void main(String[] args) {
		
		Question022 p = new Question022();
		double newPrice = p.applyDiscount(Double.parseDouble(args[0]));
		System.out.println("New Price: " + newPrice);
	}
}

/*
	And the command:
	java Product 0
	What is the result?
	
	
	A) An AssertionErrer is thrown. 
	B) New Price : 0.0
	C) A compilation error occurs at line n1.
	D) A NumberFormatException is thrown at run time.
	
	
	Answer : B
 */