package com.wealth.certificate.dumps_1z0_809_ert.question039;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Question039 
{
	public static void main(String[] args)
	{
		LocalTime now = LocalTime.of(6, 30); // LocalTime.now();
		long timeToBreakfast = 0;
		LocalTime office_start = LocalTime.of(7, 30);
		if(office_start.isAfter(now)){
			timeToBreakfast = now.until(office_start, ChronoUnit.MINUTES); // MINUTES compile error
		} else {
			timeToBreakfast = now.until(office_start, ChronoUnit.HOURS); // HOURS compile error
		}
		System.out.println(timeToBreakfast); // 60
		
		/** C is incorrect but D is correct because 07:30 is after 06:30 and now.until() count time in minutes. **/
	}
}