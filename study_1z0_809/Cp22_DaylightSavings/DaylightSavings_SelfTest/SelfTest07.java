/*7. Given:

DateTimeFormatter formatter =
    DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
System.out.println(
    formatter
    .withLocale(Locale.ENGLISH)
    .format(LocalDateTime.of(2015, 5, 7, 16, 0))
);

Which of the following is the result of executing the above lines?
A. 5/7/15 4:00 PM
B. 5/7/15
C. 4:00 PM
D. 4:00:00 PM*/
package com.wealth.certificate.study_1z0_809.chapter22.TimeZonesAndDaylightSavings_SelfTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class TimeZonesAndDaylightSavings_SelfTest07 {

	public static void main(String[] args) {
		DateTimeFormatter formatter =
			    DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
			System.out.println(
			    formatter
			    .withLocale(Locale.ENGLISH)
						.format(LocalDateTime.of(2015, 5, 7, 16, 0)));

	}

}
