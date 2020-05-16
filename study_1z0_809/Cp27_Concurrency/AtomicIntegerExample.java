package com.wealth.certificate.study_1z0_809.chapter27;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

class AtomicIntegerSubject {

	AtomicInteger count = new AtomicInteger(0);
	
	public void visit() {
		sleep();
		int visit = count.incrementAndGet();
		System.out.println(visit);
	}
	
	public static void sleep() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class AtomicIntegerExample {

	public static void main(String[] args) {
		
		AtomicIntegerSubject t = new AtomicIntegerSubject();
		
		ExecutorService e = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		e.submit(t::visit);
		e.submit(t::visit);
		e.submit(t::visit);
		e.submit(t::visit);
		e.submit(t::visit);
		e.submit(t::visit);
		e.submit(t::visit);
		
		e.shutdown();
		
	}

}
