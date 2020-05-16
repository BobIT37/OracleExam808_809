package com.wealth.certificate.study_1z0_809.chapter22;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class OffsetDateTimeAndOffsetTime {

	public static void main(String[] args) {
		System.out.println("---------OffsetDateTime-----------");
		Instant i = Instant.now();
		OffsetDateTime osdt = OffsetDateTime.now();
		ZonedDateTime zdt = ZonedDateTime .now();
		System.out.println("Instant: \t"+i);
		System.out.println("OffsetDateTime: "+osdt);
		System.out.println("ZonedDateTime: \t"+zdt);
		
		System.out.println();
		System.out.println("---------OffsetDateTime vs OffsetTime----------");
		OffsetDateTime odt = OffsetDateTime.of(LocalDateTime.now(), ZoneOffset.of("+03:00"));
		OffsetTime ot = OffsetTime.of(LocalTime.now(), ZoneOffset.of("-08:00"));
		System.out.println("OffsetDateTime: "+odt);
		System.out.println("OffsetTime: \t"+ot);

	}

}
