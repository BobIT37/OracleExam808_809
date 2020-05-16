package com.wealth.certificate.dumps_1z0_809_ert.question009;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Question009 {
	public static void main(String[] args) {
		
		// Login time : 2015-01-12T21:58:18.817Z
				try {
					Instant loginTime = Instant.now();
					Thread.sleep(1000);

					// Logout time : 2015-01-10T21:58:19.880Z
					Instant logoutTime = Instant.now();
					
					loginTime = loginTime.truncatedTo(ChronoUnit.MINUTES); // line n1
					logoutTime = logoutTime.truncatedTo(ChronoUnit.MINUTES);
					
					System.out.println("loginTime"+loginTime+"\nlogoutTime"+logoutTime);
					if (logoutTime.isAfter(loginTime))
						System.out.println("Logged out at : " + logoutTime);
					else
						System.out.println("Can’t logout");

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
}


/*
	What is the result?
	
	
A) A compilation error occurs at line n1.
B) Can’t logout
C) Logged out at : 2015-01-12T21:58:00Z
D) Logged out at : 2015-01-12T21:58:19.880Z

Answer : B

*/