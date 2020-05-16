/*Given:

ZoneOffset offset = ZoneOffset.of("Z");
System.out.println(
    offset.get(ChronoField.HOUR_OF_DAY)
);

Which of the following is the result of executing the above lines?
A. 0
B. 1
C. 12:00
D. An exception is thrown*/
package com.wealth.certificate.study_1z0_809.chapter22.TimeZonesAndDaylightSavings_SelfTest;

import java.time.ZoneOffset;
import java.time.temporal.ChronoField;

public class TimeZonesAndDaylightSavings_SelfTest02 {

	public static void main(String[] args) {
		ZoneOffset offset = ZoneOffset.of("Z");
		System.out.println(
		    offset.get(ChronoField.HOUR_OF_DAY) //Unsupported field: HourOfDay
		);

	}

}
