/*3. Given:

ZonedDateTime zdt =
    ZonedDateTime.of(2015,02,28,5,0,0,0,
                     ZoneId.of("+05:00"));
System.out.println(zdt.toLocalTime());

Assuming a local time zone of +2:00, which of the following is the result of executing the above lines?
A. 05:00
B. 17:00
C. 02:00
D. 03:00*/
package com.wealth.certificate.study_1z0_809.chapter22.TimeZonesAndDaylightSavings_SelfTest;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZonesAndDaylightSavings_SelfTest03 {

	public static void main(String[] args) {
		ZonedDateTime zdt =
			    ZonedDateTime.of(2015,02,28,5,0,0,0,
			                     ZoneId.of("+05:00"));
			System.out.println(zdt.toLocalTime());

	}

}
