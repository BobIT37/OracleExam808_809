package com.wealth.certificate.study_1z0_809.chapter20.Assertion;

public class Assertion {

	public static void main(String[] args) {
		// assert booleanExpression; -> syntax
		assert false;

		// above statement is equivalent to
		/*
		 * if(booleanExpressionIsFalse) { throw new AssertionError(); }
		 */
		if (false) {
			throw new AssertionError();
		}

		// ----------An assert statement can also take a String as a
		// message------
		// assert booleanExpression: "Message about the error";
		assert false : "Message about the error";

		// above statement is equivalent to
		/*
		 * if(booleanExpressionIsFalse) { throw new
		 * AssertionError("Message about the error"); }
		 */
		if (false) {
			throw new AssertionError("Message about the error");
		}
	}
	
	//-----------Assertions are enabled in the command-line------------
	//java –ea MainClass Or java –enableassertions MainClass   -> This would enable assertions in all the classes.
	//java –ea:ClassName MainClass -> enabled for one class
	//java –ea:com.example MainClass -> for all classes in a package
	
	//-----------Assertions are disabled in the command-line------------
	//java –da MainClass Or java –disableassertions MainClass
	//java –da:ClassName MainClass
	//java –da:com.example MainClass
	

}
