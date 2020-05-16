package com.wealth.certificate.dumps_1z0_809_ert.question015;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class question015 {
	public static void main(String[] args) {
		final List<String> list = new CopyOnWriteArrayList<>();
		final AtomicInteger ai = new AtomicInteger(0);
		final CyclicBarrier barrier = new CyclicBarrier(2, new Runnable() {
			public void run() {
				System.out.println(list);
			}
		});
		Runnable r = new Runnable() {
			public void run() {
				try {
					Thread.sleep(1000 * ai.incrementAndGet());
					list.add("x");
					barrier.await();
				} catch (Exception ex) {
				}
			}
		};
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
	}
}

/*
What is the result?
A) 	[X, X] 
B) 	[X, X] 
	[X, X, X, X,]
C) 	[X]
	[X, X]
	[X, X, X]
D) 	[X]
	[X, X]
	[X, X, X]
	[X, X, X, X]
	
Answer B.
[x, x]
[x, x, x, x]

*/
