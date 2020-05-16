/*4. Given:

ZonedDateTime zdt =
    ZonedDateTime.of(2015,10,4,0,0,0,0,
                     ZoneId.of("America/Asuncion"))
    .plus(Duration.ofHours(1));
System.out.println(zdt);

Assuming that DST starts on October, 4, 2015 at 0:00:00, which of the following is the result of executing the above lines?
A. 2015-10-04T00:00-03:00[America/Asuncion]
B. 2015-10-04T01:00-03:00[America/Asuncion]
C. 2015-10-04T02:00-03:00[America/Asuncion]
D. 2015-10-03T23:00-03:00[America/Asuncion]*/
package com.wealth.certificate.study_1z0_809.chapter22.TimeZonesAndDaylightSavings_SelfTest;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZonesAndDaylightSavings_SelfTest04 {

	public static void main(String[] args) {
		ZonedDateTime zdt = ZonedDateTime.of(2015, 10, 4, 0, 0, 0, 0, ZoneId.of("America/Asuncion"))
				.plus(Duration.ofHours(1));
		System.out.println(zdt);

	}

}
