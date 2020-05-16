package com.wealth.certificate.study_1z0_809.chapter27;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class AtomicIntegerSubject3 {

	int count = 0;
	
	public void visit() {
		sleep();
		int visit = ++count;
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

public class AtomicIntegerExampleUnsync {

	public static void main(String[] args) {
		
		AtomicIntegerSubject3 t = new AtomicIntegerSubject3();
		
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
