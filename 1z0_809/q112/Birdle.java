package com.wealth.certificate.dumps_1z0_809.question112;

import java.util.function.Consumer;
import java.util.function.Supplier;

class Bird {
	public void fly(){ System.out.println("Can fly"); }
}

class Penquin extends Bird{
	public void fly(){ System.out.println("Cannot fly"); }
}

class Birdle
{
	public static void main(String[] args)
	{
		fly(()->new Bird());
		fly(Penquin::new);
		
		/** Answered : C, D is correct because parameter of method's fly can be Supplier<Bird> or Supplier<? extends Bird>. **/
	}
	
	/* line n1 */
	/*// A.
	 	static void fly (Consumer<Bird> bird){
	 		bird::fly();
	 	}
	*/
	/*// B.
	 	static void fly (Consumer<? extends Bird> bird){
	 		bird.accept().fly(); 	// Fixed : bird.accept()fly();
	 	}
	*/
	/*// C.
	 	static void fly (Supplier<Bird> bird){
	 		bird.get().fly(); 		// Fixed : bird.get()fly();
	 	}
	*/
	/*// D.
	 	static void fly (Supplier<? extends Bird> bird){
	 		// LOST
	 	}
	*/
}