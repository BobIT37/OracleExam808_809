package com.wealth.certificate.study_1z0_809.chapter21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;

public class CoreDateTimeClasses_03 {
	public static void main(String[]args){
		// ----------------create and instance-----------------
				System.out.println("----------------create and instance-----------------");
		//public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute)
		//public static LocalDateTime of(int year, Month month, int dayOfMonth,int hour, int minute, int second)
		//public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond)
		//public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute)
		//public static LocalDateTime of(int year, int month, int dayOfMonth,int hour, int minute, int second)
		//public static LocalDateTime of(int year, int month, int dayOfMonth,int hour, int minute, int second, int nanoOfSecond)
		//public static LocalDateTime of(LocalDate date, LocalTime time)
		//***public static LocalDateTime ofInstant(Instant instant, ZoneId zone)
		//***public static LocalDateTime ofEpochSecond(long epochSecond, int nanoOfSecond, ZoneOffset offset)

		
		
		// Setting seconds and nanoseconds to zero
		LocalDateTime dt1 = LocalDateTime.of(2014, 9, 19, 14, 5);
		// Setting nanoseconds to zero
		LocalDateTime dt2 = LocalDateTime.of(2014, 9, 19, 14, 5, 20);
		// Setting all fields
		LocalDateTime dt3 = LocalDateTime.of(2014, 9, 19, 14, 5, 20, 9);
		// Asumming this date LocalDate date = LocalDate.now();
		// And this time LocaDate time = LocalTime.now();
		LocalDateTime epochSecond = LocalDateTime.ofEpochSecond(1, 999999999, ZoneOffset.UTC);
		System.out.println("epochSecond: "+epochSecond);
		
		
		// Combine the above date with the given time like this
		LocalDate now = LocalDate.now();
		LocalDateTime dt4 = now.atTime(14, 30, 59, 999999);
		System.out.println("combineDateTime dt4"+dt4);
		// Or this LocalDateTime dt5 = date.atTime(time);
		// Combine this time with the given date. Notice that LocalTime
		// only has this constructor to be combined with a LocalDate
		//LocalTime time = LocalTime.of(11, 20);
		LocalTime time = LocalTime.now();
		LocalDateTime dt6 = time.atDate(now);
		System.out.println("combineDateTime dt6"+dt6);
		
		
		System.out.println("-------------get date time by ChronoField----------");
		int nanoSecond  = dt6.get(ChronoField.NANO_OF_SECOND);
		long nanoDay  = dt6.getLong(ChronoField.NANO_OF_DAY);
		int microSecond  = dt6.get(ChronoField.MICRO_OF_SECOND);
		long microDay  = dt6.getLong(ChronoField.MICRO_OF_DAY);
		int milliSecond  = dt6.get(ChronoField.MILLI_OF_SECOND);
		int milliDaY  = dt6.get(ChronoField.MILLI_OF_DAY);
		int secondMinute = dt6.get(ChronoField.SECOND_OF_MINUTE);
		System.out.println("secondMinute: "+secondMinute);
		int secondDay = dt6.get(ChronoField.SECOND_OF_DAY);
		int minuteHour = dt6.get(ChronoField.MINUTE_OF_HOUR);
		System.out.println("minuteHour: "+minuteHour);
		int minuteDay = dt6.get(ChronoField.MINUTE_OF_DAY);
		int hourAMPM = dt6.get(ChronoField.HOUR_OF_AMPM);
		int clockHourAMPM  = dt6.get(ChronoField.CLOCK_HOUR_OF_AMPM);
		int hourDay = dt6.get(ChronoField.HOUR_OF_DAY);
		int clockHourDay  = dt6.get(ChronoField.CLOCK_HOUR_OF_DAY);
		int amPmDay = dt6.get(ChronoField.AMPM_OF_DAY);
		int dayWeek = dt6.get(ChronoField.DAY_OF_WEEK);
		int alignDayWeekInMonth = dt6.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
		System.out.println("alignDayWeekInMonth: "+alignDayWeekInMonth);
		int alignDayWeekInYear = dt6.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR);
		int dayMonth = dt6.get(ChronoField.DAY_OF_MONTH);
		System.out.println("dayMonth: "+dayMonth);
		int dayYear = dt6.get(ChronoField.DAY_OF_YEAR);
		long epochDay = dt6.getLong(ChronoField.EPOCH_DAY);
		System.out.println("epochDay: "+epochDay);
		int alignWeekMonth = dt6.get(ChronoField.ALIGNED_WEEK_OF_MONTH);
		int alignWeekMYear = dt6.get(ChronoField.ALIGNED_WEEK_OF_YEAR);
		int monthYear = dt6.get(ChronoField.MONTH_OF_YEAR);
		System.out.println("monthYear: "+monthYear);
		

	}
	
}
