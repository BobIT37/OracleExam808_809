package com.wealth.certificate.study_1z0_809.chapter27;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Blocked {
	
	CyclicBarrier cb;
	
	Blocked(CyclicBarrier cb) {
		this.cb = cb;
	}
	
	void run() {
		try {
			System.out.println("@"+Thread.currentThread().getId() + " is waiting");
			cb.await();
			System.out.println("@"+Thread.currentThread().getId() + " Release");
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
}

public class CyclicBarrierExample {

	public static void main(String[] args) throws InterruptedException {

		CyclicBarrier cb = new CyclicBarrier(5);
		
		Blocked b = new Blocked(cb);
		
		ExecutorService e = Executors.newFixedThreadPool(5);
		e.execute(b::run);
		e.execute(b::run);
		e.execute(b::run);
		e.execute(b::run);
		
		Thread.sleep(3000);
		
		e.execute(b::run);
		
		e.shutdown();
	}

}
