package com.wealth.certificate.study_1z0_809.chapter03.selftest;

public class Question_3_4 {
	public static class Inner {
		private void doIt() {
			System.out.println("doIt()");
		}
	}

	public static void main(String[] args) {
		Question_3_4.Inner i = new Inner();
		i.doIt();
	}
}

/*

What is the result?
A. Compilation fails because an inner class cannot be static.
B. Compilation fails because the Inner class is instantiated incorrectly inside method main.
C. Compilation fails because the method doIt cannot be called in main because it is declared as private
D. The program prints doIt()

The correct answer is D.
There's nothing wrong with the static inner class declaration or the way it is instantiated. 
Since all happens in the same class, the main method can access the private members of the inner class, 
so there's no problem with that neither.

*/
