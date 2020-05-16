package com.wealth.certificate.study_1z0_809.chapter27;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TestUnlock3 {
	
	private static int count = 0;
	
	public static void visit() {
		synchronized(TestUnlock3.class) {
			sleep();
			int visit = count;
			visit = visit + 1;
			count = visit;
			System.out.println(visit);
		}
	}
	
	private static void sleep() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

public class StaticSyncAnObject {
	
	public static void main(String... args) 
	{
		TestUnlock3 t = new TestUnlock3();
		
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
