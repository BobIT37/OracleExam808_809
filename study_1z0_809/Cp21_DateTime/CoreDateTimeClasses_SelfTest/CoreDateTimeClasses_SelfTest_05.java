/*5. Which of the following is a valid way to get the nanoseconds part of an Instant object referenced by i?
A. int nanos = i.getNano();
B. long nanos = i.get(ChronoField.NANOS);
C. long nanos = i.get(ChronoUnit.NANOS);
D. int nanos = i.getEpochNano();*/
package com.wealth.certificate.study_1z0_809.chapter21.CoreDateTimeClasses_SelfTest;

import java.time.Instant;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class CoreDateTimeClasses_SelfTest_05 {
	Instant i = Instant.now();
	//A. int nanos = i.getNano();
	int nanos = i.getNano();
	//B. long nanos = i.get(ChronoField.NANOS);
	long nanosL = i.get(ChronoField.NANOS);
	
	//C. long nanos = i.get(ChronoUnit.NANOS);
	long nanos2 = i.get(ChronoUnit.NANOS);  // get method use "ChronoField" 
	
	//D. int nanos = i.getEpochNano();*/
	int nanos3 = i.getEpochNano();// don't have this method
	

}
