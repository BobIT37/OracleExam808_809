/*2. Given:

LocalDate.of(2014, 1, 2).atTime(14, 30, 59, 999999)

Which of the following is the result of executing the above line?
A. A LocalDate of 2014-01-02
B. A LocalTime of 14:30:59:999999
C. A LocalDateTime of 2014-01-02 14:30:59:999999
D. An exception is thrown*/
package com.wealth.certificate.study_1z0_809.chapter21.CoreDateTimeClasses_SelfTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CoreDateTimeClasses_SelfTest_02 {
	public static void main (String [] args){
		LocalDateTime dt = LocalDate.of(2014, 1, 2).atTime(14, 30, 59, 999999);
		System.out.println(dt);
	}
}
