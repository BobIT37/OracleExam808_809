package com.wealth.certificate.study_1z0_809.chapter22;

import java.time.Duration;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class DaylightSavingsTime {

	public static void main(String[] args) {
		System.out.println("---------March, 29 2015----------");
		ZonedDateTime march29 = ZonedDateTime.of(2015, 3, 29, 2, 30, 0, 0, ZoneId.of("Europe/Rome"));
		System.out.println(march29);

		ZonedDateTime zdt1 = ZonedDateTime.of(2015, 3, 29, 2, 30, 0, 0, ZoneOffset.ofHours(2));
		ZonedDateTime zdt2 = ZonedDateTime.of(2015, 3, 29, 2, 30, 0, 0, ZoneId.of("UTC+2"));
		System.out.println(zdt1);
		System.out.println(zdt2);

		System.out.println("---------Octomer, 25 2015----------");
		ZonedDateTime octomer25 = ZonedDateTime.of(2015, 10, 25, 2, 30, 0, 0, ZoneId.of("Europe/Rome"));
		ZonedDateTime octomer25Plus = octomer25.plusHours(1);
		System.out.println(octomer25);
		System.out.println(octomer25Plus);

		System.out.println("---------before dst-----------");
		ZonedDateTime zdt = ZonedDateTime.of(2015, 3, 29, 1, 0, 0, 0, ZoneId.of("Europe/Rome"));
		System.out.println("before : \t"+zdt);
		System.out.println("Duration: \t"+zdt.plus(Duration.ofDays(1)));
		System.out.println("Period: \t"+zdt.plus(Period.ofDays(1)));
		

	}

}
