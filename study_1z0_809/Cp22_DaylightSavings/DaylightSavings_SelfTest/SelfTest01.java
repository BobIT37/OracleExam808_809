/*1. Which of the following are valid ways to create a ZoneId object?
A. ZoneId.ofHours(2);
B. ZoneId.of("2");
C. ZoneId.of("-1");
D. ZoneId.of("America/Canada");*/
package com.wealth.certificate.study_1z0_809.chapter22.TimeZonesAndDaylightSavings_SelfTest;

import java.time.ZoneId;

public class TimeZonesAndDaylightSavings_SelfTest01 {

	public static void main(String[] args) {
		//A. ZoneId.ofHours(2);
		ZoneId a = ZoneId.ofHours(2);
		
		//B. ZoneId.of("2");
		ZoneId b = ZoneId.of("2"); //start + or -
		
		//C. ZoneId.of("-1");
		ZoneId c = ZoneId.of("-1");
		
		//D. ZoneId.of("America/Canada");
		ZoneId d = ZoneId.of("America/Canada");//area/city not area/country

	}

}
