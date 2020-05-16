package com.wealth.certificate.study_1z0_809.chapter21;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class CoreDateTimeClasses_02 {
	public static void main(String[] args) {
		// ----------------create and instance-----------------
		System.out.println("----------------create and instance-----------------");
		//public static LocalTime of(int hour, int minute)  With hour (0-23) and minutes (0-59)
		LocalTime fiveThirty = LocalTime.of(5, 30);
		//public static LocalTime of(int hour, int minute, int second) With hour, minutes, and seconds (0-59)
		LocalTime noon = LocalTime.of(12, 0, 0);
		// public static LocalTime of(int hour, int minute, int second, int nanoOfSecond) With hour, minutes, seconds, and nanoseconds (0-999,999,999)
		LocalTime almostMidnight = LocalTime.of(23, 59, 59, 999999);
		//public static LocalTime ofSecondOfDay(long secondOfDay) //from 0 to 24 * 60 * 60 – 1
		LocalTime  sevenOclock = LocalTime.ofSecondOfDay(25200); //60*60*7
		System.out.println("sevenOclock: "+sevenOclock);
		//public static LocalTime ofNanoOfDay(long nanoOfDay) //from 0 to 24 * 60 * 60 * 1,000,000,000 – 1
		LocalTime  oneOclock = LocalTime.ofNanoOfDay(3600000000000L);
		System.out.println("oneOclock: "+oneOclock);
		
		// ----------------now--------------------------
		LocalTime now = LocalTime.now();

		int hour = now.getHour();
		System.out.println("hour: "+hour);
		int minute = now.getMinute();
		System.out.println("minute: "+minute);
		int second = now.getSecond();
		System.out.println("second"+second);
		int nanosecond = now.getNano();
		System.out.println("nanosecond: "+nanosecond);

		// ---------------ChrnoField------------------
		System.out.println("----How to use ChrnoField------");
		int hourAMPM = now.get(ChronoField.HOUR_OF_AMPM); // 0 - 11
		System.out.println("hourAMPM: "+hourAMPM);
		int hourDay = now.get(ChronoField.HOUR_OF_DAY); // 0 - 23
		System.out.println("hourDay: "+hourDay);
		int minuteDay = now.get(ChronoField.MINUTE_OF_DAY); // 0 - 1,439
		System.out.println("minuteDay: "+minuteDay);
		int minuteHour = now.get(ChronoField.MINUTE_OF_HOUR); // 0 - 59
		System.out.println("minuteHour: "+minuteHour);
		int secondDay = now.get(ChronoField.SECOND_OF_DAY); // 0 - 86,399
		System.out.println("secondDay: "+secondDay);
		int secondMinute = now.get(ChronoField.SECOND_OF_MINUTE);// 0 - 59
		System.out.println("secondMinute: "+secondMinute);
		long nanoDay = now.getLong(ChronoField.NANO_OF_DAY);// 0-86399999999
		System.out.println("nanoDay: "+nanoDay);
		int nanoSecond = now.get(ChronoField.NANO_OF_SECOND);// 0-999999999
		System.out.println("nanoSecond: "+nanoSecond);
		long microDay = now.getLong(ChronoField.MICRO_OF_DAY);
		System.out.println("microDay: "+microDay);
		int milliDay = now.get(ChronoField.MILLI_OF_DAY);
		System.out.println("milliDay: "+milliDay);
		
		// ----------compare with another instance---------
		System.out.println("----------compare with another instance---------");
		boolean after = fiveThirty.isAfter(noon); // false
		System.out.println("after: "+after);
		boolean before = fiveThirty.isBefore(noon); // true
		System.out.println("before: "+before);
		boolean equal = noon.equals(almostMidnight); // false
		System.out.println("equal: "+equal);
		
		// ----------create another instance from an existing one---------
		System.out.println("----------create another instance from an existing one---------");
		LocalTime ten = noon.with(ChronoField.HOUR_OF_DAY, 10);
		LocalTime eight = noon.withHour(8);
		LocalTime twelveThirty = noon.withMinute(30);
		LocalTime thirtyTwoSeconds = noon.withSecond(32);
		// Since these methods return a new instance, we can chain them!
		LocalTime secondsNano = noon.withSecond(20).withNano(999999);
		System.out.println("ten: "+ten);
		System.out.println("eight: "+eight);
		System.out.println("twelveThirty: "+twelveThirty);
		System.out.println("thirtyTwoSeconds: "+thirtyTwoSeconds);
		System.out.println("secondsNano: "+secondsNano);
		
		// -------------------adding or subtracting -----------------
		System.out.println("-------------adding or subtracting----------------");
		// Adding
		LocalTime sixThirty = fiveThirty.plusHours(1);
		LocalTime fiveForty = fiveThirty.plusMinutes(10);
		LocalTime plusSeconds = fiveThirty.plusSeconds(14);
		LocalTime plusNanos = fiveThirty.plusNanos(99999999);
		LocalTime sevenThirty = fiveThirty.plus(2, ChronoUnit.HOURS);
		System.out.println("sixThirty: "+sixThirty);
		System.out.println("fiveForty: "+fiveForty);
		System.out.println("plusSeconds: "+plusSeconds);
		System.out.println("plusNanos: "+plusNanos);
		System.out.println("sevenThirty: "+sevenThirty);
		

		// Subtracting
		LocalTime fourThirty = fiveThirty.minusHours(1);
		LocalTime fiveTen = fiveThirty.minusMinutes(20);
		LocalTime minusSeconds = fiveThirty.minusSeconds(2);
		LocalTime minusNanos = fiveThirty.minusNanos(1);
		LocalTime fiveTwenty = fiveThirty.minus(10, ChronoUnit.MINUTES);
		System.out.println("fourThirty: "+fourThirty);
		System.out.println("fiveTen: "+fiveTen);
		System.out.println("minusSeconds: "+minusSeconds);
		System.out.println("minusNanos: "+minusNanos);
		System.out.println("fiveTwenty: "+fiveTwenty);
		
		
	}

}
