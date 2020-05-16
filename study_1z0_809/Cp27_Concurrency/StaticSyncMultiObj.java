package com.wealth.certificate.study_1z0_809.chapter27;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TestUnlock4 {
	
	private static int count = 0;
	
	public static void visit(int uuid) {
		sleep();
		int visit = count;
		visit = visit + 1;
		count = visit;
		System.out.println(uuid +":" + visit);
	}
	
	private static void sleep() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

public class StaticSyncMultiObj {
	
	public static void main(String... args) 
	{
		TestUnlock4 t = new TestUnlock4();
		TestUnlock4 t2 = new TestUnlock4();
		
		Runnable action = () -> {
			t.visit(1);
		};
		
		Runnable action2 = () -> {
			t2.visit(2);
		};
		
		ExecutorService e = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		e.submit(action);
		e.submit(action);
		e.submit(action);
		e.submit(action);
		e.submit(action2);
		e.submit(action2);
		e.submit(action2);
		e.submit(action2);
	
		e.shutdown();
	}

}
