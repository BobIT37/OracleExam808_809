package com.wealth.certificate.study_1z0_809.chapter21;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class CoreDateTimeClasses_05 {

	public static void main(String[] args) {
		// ----------------create and instance-----------------
		System.out.println("----------------create and instance-----------------");
		// Setting years, months, days (can be negative)
		Period period5y4m3d = Period.of(5, 4, 3);
		// Setting days (can be negative), years and months will be zero
		Period period2d = Period.ofDays(2);
		// Setting months (can be negative), years and days will be zero
		Period period2m = Period.ofMonths(2);
		// Setting weeks (can be negative). The resulting period will
		// be in days (1 week = 7 days). Years and months will be zero
		Period period14d = Period.ofWeeks(2);
		// Setting years (can be negative), days and months will be zero
		Period period2y = Period.ofYears(2);	
		System.out.println("period5y4m3d: "+period5y4m3d);
		System.out.println("period2d: "+period2d);
		System.out.println("period2m: "+period2m);
		System.out.println("period14d: "+period14d);
		System.out.println("period2y: "+period2y);
		
		//-----------------difference between two LocalDates--------------
		System.out.println("-----------------difference between two LocalDates--------------");
		LocalDate march2003 = LocalDate.of(2003, 3, 1);
		LocalDate may2003 = LocalDate.of(2003, 5, 1);
		Period dif = Period.between(march2003, may2003); // P2M
		System.out.println("dif: "+dif);
		
		LocalDate march2003_01 = LocalDate.of(2003, 3, 1);
		LocalDate march2003_31 = LocalDate.of(2003, 3, 31);
		Period dif1 = Period.between(march2003_01, march2003_31);//P30D
		System.out.println("dif1: "+dif1);
		
		// dif1 will be 1 year 2 months 2 days
		Period dif2 = Period.between( LocalDate.of(2000, 2, 10), LocalDate.of(2001, 4, 12));
		System.out.println("dif2: "+dif2);
		// dif2 will be 25 days
		Period dif3 = Period.between( LocalDate.of(2013, 5, 9), LocalDate.of(2013, 6, 3));
		System.out.println("dif3: "+dif3);
		// dif3 will be -2 years -3 days
		Period dif4 = Period.between( LocalDate.of(2014, 11, 3), LocalDate.of(2012, 10, 31));
		System.out.println("dif4: "+dif4);
		
		//----------------get information from Period-----------
		System.out.println("----------------get information from Period-----------");
		int days = period5y4m3d.getDays();
		int months = period5y4m3d.getMonths();
		int year = period5y4m3d.getYears();
		long days2 = period5y4m3d.get(ChronoUnit.DAYS);
		System.out.println("days: "+days);
		System.out.println("months: "+months);
		System.out.println("year: "+year);
		System.out.println("days2: "+days2);
		
		// ----------create another instance from an existing one---------
		System.out.println("----------create another instance from an existing one---------");
		Period period8d = period2d.withDays(8);
		// Since these methods return a new instance, we can chain them!
		Period period2y1m2d = period2d.withYears(2).withMonths(1);
		System.out.println("period8d: "+period8d);
		System.out.println("period2y1m2d: "+period2y1m2d);
		
		// -------------------adding or subtracting -----------------
		System.out.println("-------------adding or subtracting----------------");
		// Adding
		Period period9y4m3d = period5y4m3d.plusYears(4);
		Period period5y7m3d = period5y4m3d.plusMonths(3);
		Period period5y4m6d = period5y4m3d.plusDays(3);
		Period period7y4m3d = period5y4m3d.plus(period2y);
		System.out.println("period9y4m3d: "+period9y4m3d);
		System.out.println("period5y7m3d: "+period5y7m3d);
		System.out.println("period5y4m6d: "+period5y4m6d);
		System.out.println("period7y4m3d: "+period7y4m3d);
		System.out.println("------------------------");
		// Subtracting
		Period period3y4m3d = period5y4m3d.minusYears(2);
		Period period5y3m3d = period5y4m3d.minusMonths(1);
		Period period5y4m2d = period5y4m3d.minusDays(1);
		Period period3y4m3d_ = period5y4m3d.minus(period2y);
		System.out.println("period3y4m3d: "+period3y4m3d);
		System.out.println("period5y3m3d: "+period5y3m3d);
		System.out.println("period5y4m2d: "+period5y4m2d);
		System.out.println("period3y4m3d_: "+period3y4m3d_);
		
		
	}

}
