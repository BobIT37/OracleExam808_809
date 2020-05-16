/*7. Given:

System.out.println(
    Duration.between(
        LocalDateTime.of(2015, 3, 20, 18, 0),
        LocalTime.of(18, 5) )
);

Which of the following is the result of executing the above line?
A. PT5M
B. PT-5M
C. PT300S
D. An exception is thrown*/
package com.wealth.certificate.study_1z0_809.chapter21.CoreDateTimeClasses_SelfTest;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CoreDateTimeClasses_SelfTest_07 {
	public static void main(String [] args){
		System.out.println(
			    Duration.between(
			        LocalDateTime.of(2015, 3, 20, 18, 0),
			        LocalTime.of(18, 5) )
			);//��� object ��ҧ type �ѹ�� convert base on first object �� first argument ��ͧ�� LocalTime ��� second argument �� LocalDateTime 
	}

}
