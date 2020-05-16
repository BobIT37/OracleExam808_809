package com.wealth.certificate.study_1z0_809.chapter21;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class CoreDateTimeClasses_06 {

	public static void main(String[] args) {
		// ----------------create and instance-----------------
		Duration oneDay = Duration.ofDays(1); // 1 day = 86400 seconds
		Duration oneHour = Duration.ofHours(1); // 1 hour = 3600 seconds
		Duration oneMin = Duration.ofMinutes(1); // 1 minute = 60 seconds
		Duration tenSeconds = Duration.ofSeconds(10);
		// Set seconds and nanoseconds (if they are outside the range
		// 0 to 999,999,999, the seconds will be altered, like below)
		Duration twoSeconds = Duration.ofSeconds(1, 1000000000);
		// Seconds and nanoseconds are extracted from the passed milisecs
		Duration oneSecondFromMilis = Duration.ofMillis(2L);
		// Seconds and nanoseconds are extracted from the passed nanos
		Duration oneSecondFromNanos = Duration.ofNanos(1000000000);
		Duration oneSecond = Duration.of(1, ChronoUnit.SECONDS);
		Duration halfDay = Duration.of(1, ChronoUnit.HALF_DAYS); //1->12H, 2->24H
		System.out.println("oneDay: "+oneDay);
		System.out.println("oneHour: "+oneHour);
		System.out.println("oneMin: "+oneMin);
		System.out.println("tenSeconds: "+tenSeconds);
		System.out.println("twoSeconds: "+twoSeconds);
		System.out.println("oneSecondFromMilis: "+oneSecondFromMilis);
		System.out.println("oneSecondFromNanos: "+oneSecondFromNanos);
		System.out.println("oneSecond: "+oneSecond);
		System.out.println("halfDay: "+halfDay);
		
		//------------------difference between two instance-------------------
		System.out.println("------------------difference between two instance-------------------");
		Duration difT = Duration.between(LocalTime.of(1, 10), LocalTime.of(1, 20));
		Duration difDT = Duration.between(LocalDateTime.of(2017, 9, 1, 1, 2), LocalDateTime.of(2017, 9, 1, 1, 2));
		Duration difI = Duration.between( Instant.ofEpochSecond(123456789), Instant.ofEpochSecond(99999));
		Duration difTDT = Duration.between(LocalTime.of(1, 10), LocalDateTime.of(2017, 9, 1, 1, 2));
		System.out.println("difT: "+difT);
		System.out.println("difDT: "+difDT);
		System.out.println("difI: "+difI);
		System.out.println("difTDT: "+difTDT);
		
		//-------------------get information----------------
		System.out.println("-------------------get information----------------");
		// Nanoseconds part the duration, from 0 to 999,999,999
		int nanos = oneSecond.getNano();
		// Seconds part of the duration, positive or negative
		long seconds = oneSecond.getSeconds();
		// Supports SECONDS and NANOS.Other units throw an exception
		long oneSec = oneSecond.get(ChronoUnit.SECONDS);
		System.out.println("nanos: "+nanos);
		System.out.println("seconds: "+seconds);
		System.out.println("oneSec: "+oneSec);
		
		// ----------create another instance from an existing one---------
		System.out.println("----------create another instance from an existing one---------");
		Duration duration1sec8nan = oneSecond.withNanos(8);
		Duration duration2sec1nan = oneSecond.withSeconds(2).withNanos(1);
		System.out.println("duration1sec8nan: "+duration1sec8nan);
		System.out.println("duration2sec1nan: "+duration2sec1nan);
		
		// -------------------adding or subtracting -----------------
		System.out.println("-------------------adding or subtracting -----------------");
		// Adding
		Duration plus4Days = oneSecond.plusDays(4);
		Duration plus3Hours = oneSecond.plusHours(3);
		Duration plus3Minutes = oneSecond.plusMinutes(3);
		Duration plus3Seconds = oneSecond.plusSeconds(3);
		Duration plus3Millis = oneSecond.plusMillis(3);
		Duration plus3Nanos = oneSecond.plusNanos(3);
		Duration plusAnotherDuration = oneSecond.plus(twoSeconds);
		Duration plusChronoUnits = oneSecond.plus(1, ChronoUnit.DAYS); 
		System.out.println("plus4Days: "+plus4Days);
		System.out.println("plus3Hours: "+plus3Hours);
		System.out.println("plus3Minutes: "+plus3Minutes);
		System.out.println("plus3Seconds: "+plus3Seconds);
		System.out.println("plus3Millis: "+plus3Millis);
		System.out.println("plus3Nanos: "+plus3Nanos);
		System.out.println("plusAnotherDuration: "+plusAnotherDuration);
		System.out.println("plusChronoUnits: "+plusChronoUnits);

		// Subtracting
		Duration minus4Days = oneSecond.minusDays(4);
		Duration minus3Hours = oneSecond.minusHours(3);
		Duration minus3Minutes = oneSecond.minusMinutes(3);
		Duration minus3Seconds = oneSecond.minusSeconds(3);
		Duration minus3Millis = oneSecond.minusMillis(3);
		Duration minus3Nanos = oneSecond.minusNanos(3);
		Duration minusAnotherDuration = oneSecond.minus(twoSeconds);
		Duration minusChronoUnits = oneSecond.minus(1, ChronoUnit.DAYS);
		System.out.println("minus4Days: "+minus4Days);
		System.out.println("minus3Hours: "+minus3Hours);
		System.out.println("minus3Minutes: "+minus3Minutes);
		System.out.println("minus3Seconds: "+minus3Seconds);
		System.out.println("minus3Millis: "+minus3Millis);
		System.out.println("minus3Nanos: "+minus3Nanos);
		System.out.println("minusAnotherDuration: "+minusAnotherDuration);
		System.out.println("minusChronoUnits: "+minusChronoUnits);

		
		


		

	}

}
