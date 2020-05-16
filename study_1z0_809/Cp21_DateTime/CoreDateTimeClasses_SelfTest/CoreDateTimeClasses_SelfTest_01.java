/*1. Which of the following are valid ways to create a LocalDate object?
A. LocalDate.of(2014);
B. LocalDate.with(2014, 1, 30);
C. LocalDate.of(2014, 0, 30);
D. LocalDate.now().plusDays(5);*/

package com.wealth.certificate.study_1z0_809.chapter21.CoreDateTimeClasses_SelfTest;

import java.time.LocalDate;

public class CoreDateTimeClasses_SelfTest_01 {
	public static void main(String[] args) {
		// A. LocalDate.of(2014);
		 LocalDate a = LocalDate.of(2014) //ส่งแค่ปีอย่างเดียวไม่ได้

		// B. LocalDate.with(2014, 1, 30);
		 LocalDate b = LocalDate.with(2014, 1, 30); //can create another instance from an existing one.

		// C. LocalDate.of(2014, 0, 30);
		LocalDate c = LocalDate.of(2014, 0, 30); // month must be 1-12

		// D. LocalDate.now().plusDays(5);
		LocalDate d = LocalDate.now().plusDays(5);
	}

}
