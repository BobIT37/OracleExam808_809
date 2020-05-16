package com.wealth.certificate.dumps_1z0_809.question070;

import java.time.LocalDate;
import java.time.Month;

public class Test {
	public static void main(String[] args)
	{
		LocalDate valentinesDay = LocalDate.of(2015, Month.FEBRUARY, 14); // 2015-02-14
		
		LocalDate nextYear = valentinesDay.plusYears(1); // 2016-02-14
		
		nextYear.plusDays(15); // line n1 : Immutable class always create new object.
		
		System.out.println(nextYear);
		
		/** Answered : B is incorrect, Correct is A because LocalDate is immutable class. **/
	}
}
