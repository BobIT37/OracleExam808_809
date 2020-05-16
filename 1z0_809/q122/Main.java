package com.wealth.certificate.dumps_1z0_809.question122;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/*from  www.  j  a v a 2  s .  com*/
public class Main {
	public static void main(String... args) {

		ZonedDateTime depart = ZonedDateTime.of(2015, 1, 15, 3, 0, 0, 0, ZoneId.of("UTC-7"));
		ZonedDateTime arrive = ZonedDateTime.of(2015, 1, 15, 9, 0, 0, 0, ZoneId.of("UTC-5"));
		long hrs = ChronoUnit.HOURS.between(depart, arrive); // line n1
		
		
		System.out.println(depart);
		System.out.println(arrive);
		System.out.println("Travel time is" + hrs + "hours");

	}
}

//เอา Arrive ตั้ง

