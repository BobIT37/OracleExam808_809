package com.wealth.certificate.study_1z0_809.chapter22;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;

public class TimeZonesAndDaylightSavings_01 {
	public static void main(String[] args) {
		ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);
		System.out.println(ZoneId.systemDefault());
		
		System.out.println("----------ZoneID-------------");
		ZoneId singaporeZoneId = ZoneId.of("Asia/Singapore");
		ZoneId zoneId = ZoneId.of("Z"); // Z represents the zone ID for UTC
		ZoneId zoneId2 = ZoneId.of("-2"); // -02:00
		System.out.println("singaporeZoneId: "+singaporeZoneId);
		System.out.println("zoneId: "+zoneId);
		System.out.println("zoneId2: "+zoneId2);
		
		System.out.println("----------ZoneOffset-------------");
		ZoneOffset zoneOffset = ZoneOffset.of("-2"); //equals ZoneId.of("-2");
		System.out.println("zoneOffset: "+zoneOffset); 
		
		// The offset must be in the range of -18 to +18
		ZoneOffset offsetHours = ZoneOffset.ofHours(1);
		// The range is -18 to +18 for hours and 0 to ± 59 for minutes
		// If the hours are negative, the minutes must be negative or zero
		ZoneOffset offsetHrMin = ZoneOffset.ofHoursMinutes(1, 30);
		// The range is -18 to +18 for hours and 0 to ± 59 for mins and secs]
		// If the hours are negative, mins and secs must be negative or zero
		ZoneOffset offsetHrMinSe = ZoneOffset.ofHoursMinutesSeconds(1,30,0);
		// The offset must be in the range -18:00 to +18:00
		// Which corresponds to -64800 to +64800
		ZoneOffset offsetTotalSeconds = ZoneOffset.ofTotalSeconds(3600);
		// The range must be from +18:00 to -18:00
		ZoneOffset offset = ZoneOffset.of("+01:30:00");
		System.out.println("offsetHours: "+offsetHours); 
		System.out.println("offsetHrMin: "+offsetHrMin); 
		System.out.println("offsetHrMinSe: "+offsetHrMinSe); 
		System.out.println("offsetTotalSeconds: "+offsetTotalSeconds); 
		System.out.println("offset: "+offset); 
		
		System.out.println("-------get ZoneOffset----------");
		// Gets the offset as int
		int offsetInt = offset.get(ChronoField.OFFSET_SECONDS);
		// Gets the offset as long
		long offsetLong= offset.getLong(ChronoField.OFFSET_SECONDS);
		// Gets the offset in seconds
		int offsetSeconds = offset.getTotalSeconds();
		System.out.println("offsetInt: "+offsetInt); 
		System.out.println("offsetLong: "+offsetLong); 
		System.out.println("offsetSeconds: "+offsetSeconds); 

	}
}
