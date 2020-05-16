/*
 * 6. Given:

System.out.println(
    Period.between(
        LocalDate.of(2015, 3, 20),
        LocalDate.of(2015, 2, 20))
);

Which of the following is the result of executing the above line?
A. P29D
B. P-29D
C. P1M
D. P-1M*/
package com.wealth.certificate.study_1z0_809.chapter21.CoreDateTimeClasses_SelfTest;

import java.time.LocalDate;
import java.time.Period;

public class CoreDateTimeClasses_SelfTest_06 {
	public static void main (String [] args){
		System.out.println(
			    Period.between(
			        LocalDate.of(2015, 3, 20),
			        LocalDate.of(2015, 2, 20))
			);
	}

}
