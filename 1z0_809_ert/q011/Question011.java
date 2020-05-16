package com.wealth.certificate.dumps_1z0_809_ert.question011;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Question011 {

	public static void main(String[] args) {
		ZoneId zone = ZoneId.of("America/New_York");
		ZonedDateTime dt = ZonedDateTime.of(LocalDate.of(2015, 3, 8),LocalTime.of(1, 0, 0, 0), zone);
		ZonedDateTime dt2 = dt.plusHours(2);		
		System.out.print(DateTimeFormatter.ofPattern("H:mm - ").format(dt2)); 
		System.out.println("Difference: " + ChronoUnit.HOURS.between(dt,dt2));
	}

}
