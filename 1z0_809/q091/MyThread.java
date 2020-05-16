package com.wealth.certificate.dumps_1z0_809.question091;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread implements Runnable {
	private static AtomicInteger count = new AtomicInteger(0);

	public void run () {
	int x = count.incrementAndGet(); //For numeric classes, atomic pre-increment operation equivalent to ++value
	System.out.print (x+ " ");
	}

}
