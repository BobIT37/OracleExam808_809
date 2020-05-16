package com.wealth.certificate.dumps_1z0_808.question198;

public class Test {
	public static void main(String[] args) {
		Runnable run1 = () -> {System.out.println("Run1");};
		Runnable run2 = () -> System.out.println("Run2");
		run1.run();
		run2.run();
	}
}

/*
Which of the following will create instance of Runnable type?
A. Runnable run = 0 -> {System.out.println("Run");}
B. Runnable run = 0 -> System.outprintlnfRun");
C. Runnable run = 0 > System.outprintlnfRun");
D. Runnable run = > System.ouLprintlnfRun"};
E. None of the above.

Answer: A
*/