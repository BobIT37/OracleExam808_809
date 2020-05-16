package com.wealth.certificate.study_1z0_809.chapter27;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TestUnlock {
	
	private int count = 0;
	
	public void visit() {
		sleep();
		
		int visit = count;
		visit = visit + 1;
		count = visit;
		System.out.println(visit);
	}
	
	private void sleep() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

public class SyncAnObject {
	
	public static void main(String... args) 
	{
		TestUnlock t = new TestUnlock();
		
		Runnable action = () -> {
			t.visit();
		};
		
		ExecutorService e = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		e.submit(action);
		e.submit(action);
		e.submit(action);
		e.submit(action);
		e.submit(action);
		e.submit(action);
		e.submit(action);
	
		e.shutdown();
	}

}
