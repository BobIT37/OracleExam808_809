/*5. Given:

ZonedDateTime zdt =
    ZonedDateTime.of(2015,3,22,0,0,0,0,
                     ZoneId.of("America/Asuncion"))
        .minus(Period.ofDays(1));
System.out.println(zdt);

Assuming that DST ends on March, 22, 2015 at 0:00:00, which of the following is the result of executing the above lines?
A. 2015-03-21T01:00-03:00[America/Asuncion]
B. 2015-03-21T00:00-03:00[America/Asuncion]
C. 2015-03-20T23:00-03:00[America/Asuncion]
D. 2015-03-21T02:00-03:00[America/Asuncion]*/
package com.wealth.certificate.study_1z0_809.chapter22.TimeZonesAndDaylightSavings_SelfTest;

import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZonesAndDaylightSavings_SelfTest05 {

	public static void main(String[] args) {
		ZonedDateTime zdt = ZonedDateTime.of(2015, 3, 22, 0, 0, 0, 0, ZoneId.of("America/Asuncion"))
				.minus(Period.ofDays(1));
		System.out.println(zdt);

	}

}
