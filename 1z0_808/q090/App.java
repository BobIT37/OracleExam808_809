package com.wealth.certificate.dumps_1z0_808.question090;

public class App {
	public static void main(String args[]) {
		int[] array = { 1, 2, 3, 4, 5 };
		for (int i : array) {
			if (i < 2) {
				// keyword1 ;
				continue;
			}
			System.out.print(i); // ·Õèâ¨·Âìà¢ÕÂ¹à»ç¹ println ¹Ð¤Ð
			if (i == 3) {
				// keyword2 ;
				continue;
			}
		}
	}
}
/*
What should keyword1 and keyword2 be respectively, in order to produce output 2345?

A. continue, break
B. break, break
C. break, continue
D. continue, continue


----------------------------------
Answer: D
----------------------------------*/