package com.wealth.certificate.study_1z0_809.chapter21;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class CoreDateTimeClasses_01 {
	public static void main(String[] args) {

		// ----------------create and instance-----------------
		System.out.println("----------------create and instance-----------------");
		// year(-999999999 to 999999999), month(1-12), day(1-31)
		// public static LocalDate of(int year,int month, int dayOfMonth)
		LocalDate newYear2001 = LocalDate.of(2001, 1, 1);
		System.out.println("newYear2001: " + newYear2001);

		// public static LocalDate of(int year,Month month, int dayOfMonth)
		LocalDate newYear2002 = LocalDate.of(2002, Month.JANUARY, 1);
		System.out.println("newYear2002: " + newYear2002);

		// public static LocalDate ofYearDay(int year, int dayOfYear)
		LocalDate dayOfYear = LocalDate.ofYearDay(2017, 365);
		System.out.println("dayOfYear: " + dayOfYear);

		// public static LocalDate ofEpochDay(long epochDay)//from 1970-01-01
		LocalDate epochDay = LocalDate.ofEpochDay(10);
		System.out.println("epochDay: " + epochDay);

		// ----------------now--------------------------
		LocalDate today = LocalDate.now();
		// LocalDate today = LocalDate.of(0, 0, 30);
		// System.out.println("today is: "+today);

		// ---------------ChrnoField------------------
		System.out.println("----How to use ChrnoField------");
		int year = today.get(ChronoField.YEAR);
		System.out.println("year: " + year);
		int month = today.get(ChronoField.MONTH_OF_YEAR);
		System.out.println("month: " + month);
		int dayYear = today.get(ChronoField.DAY_OF_YEAR);
		System.out.println("day of year: " + dayYear);
		int dayMonth = today.get(ChronoField.DAY_OF_MONTH);
		System.out.println("day of month: " + dayMonth);
		int dayWeek = today.get(ChronoField.DAY_OF_WEEK);
		System.out.println("day of week: " + dayWeek);
		long dayEpoch = today.getLong(ChronoField.EPOCH_DAY);
		System.out.println("dayEpoch: " + dayEpoch);
		int alignDayWeekInMonth = today.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
		System.out.println("align day of week in month: " + alignDayWeekInMonth);
		int alignDayWeekInYear = today.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR);
		System.out.println("align day of week in year: " + alignDayWeekInYear);
		int alignWeekOfMonth = today.get(ChronoField.ALIGNED_WEEK_OF_MONTH);
		System.out.println("align week of month: " + alignWeekOfMonth);
		int alignWeekOfYear = today.get(ChronoField.ALIGNED_WEEK_OF_YEAR);
		System.out.println("align week of year: " + alignWeekOfYear);
		long proLeptic = today.getLong(ChronoField.PROLEPTIC_MONTH);
		System.out.println("Proleptic month: " + proLeptic);
		int ear = today.get(ChronoField.ERA);
		System.out.println("ERA: " + ear);

		// ----------compare with another instance---------
		System.out.println("----------compare with another instant---------");
		boolean after = newYear2001.isAfter(newYear2002); // false
		boolean before = newYear2001.isBefore(newYear2002); // true
		boolean equal = newYear2001.equals(newYear2002); // false
		boolean leapYear = newYear2001.isLeapYear(); // false
		System.out.println("2001 after 2002: " + after);
		System.out.println("2001 before 2002: " + before);
		System.out.println("2001 equal 2002: " + equal);
		System.out.println("2001 is leap year: " + leapYear);

		// ----------create another instance from an existing one---------
		System.out.println("----------create another instance from an existing one---------");
		LocalDate newYear2003 = newYear2001.with(ChronoField.YEAR, 2003);
		LocalDate newYear2004 = newYear2001.withYear(2004);
		LocalDate december2001 = newYear2001.withMonth(12);
		LocalDate february2001 = newYear2001.withDayOfYear(32);
		// Since these methods return a new instance, we can chain them!
		LocalDate xmas2001 = newYear2001.withMonth(12).withDayOfMonth(25);
		System.out.println("newYear2003: " + newYear2003);
		System.out.println("newYear2004: " + newYear2004);
		System.out.println("december2001: " + december2001);
		System.out.println("february2001: " + february2001);
		System.out.println("xmas2001: " + xmas2001);

		// -------------------adding or subtracting -----------------
		System.out.println("-------------adding or subtracting----------------");
		// Adding
		LocalDate newYear2005 = newYear2001.plusYears(4);
		System.out.println("newYear2005: " + newYear2005);
		LocalDate march2001 = newYear2001.plusMonths(2);
		System.out.println("march2001: " + march2001);
		LocalDate january15_2001 = newYear2001.plusDays(14);
		System.out.println("january15_2001: " + january15_2001);
		LocalDate lastWeekJanuary2001 = newYear2001.plusWeeks(3);
		System.out.println("lastWeekJanuary2001: " + lastWeekJanuary2001);
		LocalDate newYear2006 = newYear2001.plus(5, ChronoUnit.YEARS);
		System.out.println("newYear2006: " + newYear2006);
		
		// Subtracting
		LocalDate newYear2000 = newYear2001.minusYears(1);
		System.out.println("newYear2000: " + newYear2000);
		LocalDate nov2000 = newYear2001.minusMonths(2);
		System.out.println("nov2000: " + nov2000);
		LocalDate dec30_2000 = newYear2001.minusDays(2);
		System.out.println("dec30_2000: " + dec30_2000);
		LocalDate lastWeekDec2001 = newYear2001.minusWeeks(1);
		System.out.println("lastWeekDec2001: " + lastWeekDec2001);
		LocalDate newYear1999 = newYear2001.minus(2, ChronoUnit.YEARS);
		System.out.println("newYear1999: " + newYear1999);
	}

}
