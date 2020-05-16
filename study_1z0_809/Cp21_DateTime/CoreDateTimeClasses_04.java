package com.wealth.certificate.study_1z0_809.chapter21;

import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class CoreDateTimeClasses_04 {

	public static void main(String[] args) {
		// ----------------create and instance-----------------
		System.out.println("----------------create and instance-----------------");
		// Setting seconds
		Instant fiveSecondsAfterEpoch = Instant.ofEpochSecond(5);
		// Setting seconds and nanoseconds (can be negative)
		Instant sixSecTwoNanBeforeEpoch = Instant.ofEpochSecond(-6, -2);
		// Setting milliseconds after (can be before also) epoch
		Instant fifthyMilliSecondsAfterEpoch = Instant.ofEpochMilli(50);
		System.out.println("fiveSecondsAfterEpoch: "+fiveSecondsAfterEpoch);
		System.out.println("sixSecTwoNanBeforeEpoch: "+sixSecTwoNanBeforeEpoch);
		System.out.println("fifthyMilliSecondsAfterEpoch: "+fifthyMilliSecondsAfterEpoch);
		
		Instant now = Instant.now();
		System.out.println("now: "+now);
		
		System.out.println("-------------get information by ChronoField----------");
		long seconds = now.getEpochSecond(); // Gets the seconds
		int nanos1 = now.getNano(); // Gets the nanoseconds
		int milis = now.get(ChronoField.MILLI_OF_SECOND);
		//long nanos2 = now.getLong(ChronoField.NANO_OF_SECOND);
		long nanos2 = now.getLong(ChronoField.INSTANT_SECONDS);
		System.out.println("seconds: "+seconds);
		System.out.println("nanos1: "+nanos1);
		System.out.println("milis: "+milis);
		System.out.println("nanos2: "+nanos2);
		
		System.out.println("----------compare with another instant---------");
		boolean after = now.isAfter(fiveSecondsAfterEpoch); // true
		boolean before = now.isBefore(fiveSecondsAfterEpoch); // false
		boolean equal = now.equals(fiveSecondsAfterEpoch); // false
		System.out.println("nanos2: "+nanos2);
		System.out.println("nanos2: "+nanos2);
		System.out.println("nanos2: "+nanos2);
		
		
		// -------------------adding or subtracting -----------------
		// Adding
		
		Instant dt10 = now.plusSeconds(400);
		Instant dt11 = now.plusMillis(98622200);
		Instant dt12 = now.plusNanos(300013890);
		Instant dt13 = now.plus(2, ChronoUnit.MINUTES);
		System.out.println("dt10: "+dt10);
		System.out.println("dt11: "+dt11);
		System.out.println("dt12: "+dt12);
		System.out.println("dt13: "+dt13);
		

		// Subtracting
		Instant dt14 = now.minusSeconds(2);
		Instant dt15 = now.minusMillis(1);
		Instant dt16 = now.minusNanos(1);
		Instant dt17 = now.minus(10, ChronoUnit.SECONDS);
		System.out.println("dt14: "+dt14);
		System.out.println("dt15: "+dt15);
		System.out.println("dt16: "+dt16);
		System.out.println("dt17: "+dt17);

	}

}
