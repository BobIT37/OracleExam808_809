/*8. Given:
DateTimeFormatter formatter =
    DateTimeFormatter.ofPattern("HH:mm:ss X");
OffsetDateTime odt =
    OffsetDateTime.parse("11:50:20 Z", formatter);

Which of the following statements is true about the above lines?
A. The pattern HH:mm:ss X is invalid.
B. An OffsetDateTime is created successfully.
C. Z is an invalid offset.
D. An exception is thrown at runtime.*/
package com.wealth.certificate.study_1z0_809.chapter22.TimeZonesAndDaylightSavings_SelfTest;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZonesAndDaylightSavings_SelfTest08 {

	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss X");
		OffsetDateTime odt = OffsetDateTime.parse("11:50:20 Z", formatter);
	}

}
