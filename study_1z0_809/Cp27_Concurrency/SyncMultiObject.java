package com.wealth.certificate.study_1z0_809.chapter27;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TestUnlock2 {
	
	private int uuid;
	private int count = 0;
	
	TestUnlock2(int uuid) {
		this.uuid = uuid;
	}
	
	
	public void visit() {
		sleep();
		int visit = count;
		visit = visit + 1;
		count = visit;
		System.out.println(uuid +":" + visit);
	}
	
	private void sleep() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

public class SyncMultiObject {
	
	public static void main(String... args) 
	{
		TestUnlock2 t = new TestUnlock2(1);
		TestUnlock2 t2 = new TestUnlock2(2);
		
		Runnable action = () -> {
			t.visit();
		};
		
		Runnable action2 = () -> {
			t2.visit();
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
