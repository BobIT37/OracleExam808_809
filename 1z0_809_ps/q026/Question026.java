package com.wealth.certificate.dumps_1z0_809_ps.question026;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallerThread implements Callable<String> {
	String str;

	public CallerThread(String s) {
		this.str = s;
	}

	public String call() throws Exception {
		return str.concat("Call"); 
	}
}

public class Question026 {

	public static void main(String[] args) throws InterruptedException, ExecutionException { 
		ExecutorService es = Executors.newFixedThreadPool(4); //line n1
		Future f1 = es.submit(new CallerThread("Call"));
		String str = f1.get().toString();
		System.out.println(str);
//		es.shutdown(); //for shutdown the executor service since we don't need it anymore
	}

}
