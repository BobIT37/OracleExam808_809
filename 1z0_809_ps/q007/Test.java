package com.wealth.certificate.dumps_1z0_809_ps.question007;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
	public static void main (String[] args) throws InterruptedException,
	ExecutionException {
	ExecutorService es = Executors.newFixedThreadPool(2);
	Future f1 = es.submit (new Caller ("Call ")); 
	Future f2 = es.submit (new Runner ("Run "));
	String str1 = (String) f1.get();
	String str2 = (String) f2.get();//line n1
	System.out.println(str1+ ":" + str2);
	}
	
	//.submit() it's mean execution and returns a Future representing the pending results of the task.
}
