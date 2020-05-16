package com.wealth.certificate.dumps_1z0_808.question070;

import java.time.LocalTime;

public class Test
{
	public static void main(String[] args) 
	{
	// A : Error now0?
		// System.out.print(new LocalTime()-now0);
	// B : Error Argument of LocalTime class is immutable (not new) and thread-safe.
		// System.out.print(new LocalTime());
	// C : Error if not changed ouLprint to out.print
		// System.ouLprint(LocalTime.now());
		System.out.print(LocalTime.now()); /** Answered : C is correct **/
	// D : Error if not changed ouLprint to out.print
		// System.ouLprint(LocalTime.today());
		// System.out.print(LocalTime.today()); // Error because No method today() in LocalTime interface
	// E : None of the above.
	}
}
