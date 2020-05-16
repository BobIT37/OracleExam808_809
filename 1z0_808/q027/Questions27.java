package com.wealth.certificate.dumps_1z0_808.question027;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Questions27 {

	public static void main(String[] args) {
		// after run this line, 
		// it will throws  java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: HourOfDay 
		String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
		// You should use this line instead.
		//String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE);
		System.out.println(date);
	}
	
}
