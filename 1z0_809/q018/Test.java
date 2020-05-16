package com.wealth.certificate.dumps_1z0_809.question018;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@FunctionalInterface
interface Converter<F,T>{
	T convert(F from);
}

class Caller implements Callable<String> {
	String str;
	public Caller (String s) {
		this.str=s;
	}
	public String call() throws Exception { 
		//System.out.println("Caller");
		return str.concat ("Caller");
		} 
}
class Runner implements Runnable {
String str;
	public Runner (String s) {
		this.str=s;
	}
	public void run () { 
		/*try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		System.out.println (str.concat("Runner"));
	} 
}

public class Test {
	public static void main (String[] args) throws InterruptedException, ExecutionException/*, TimeoutException*/  { // Future.get thrown exception 
		ExecutorService es = Executors.newFixedThreadPool(2);
		//ExecutorService es = Executors.newSingleThreadExecutor();
		Future f1 = es.submit (new Caller ("Call"));
		Future f2 = es.submit (new Runner ("Run"));
		String str1 = (String) f1.get();
		String str2 = (String) f2.get(); /*f2.get(1, TimeUnit.SECONDS)*/;//line n1  // Exception in thread "main" java.util.concurrent.TimeoutException
		
		System.out.println(str1+ ":" + str2);
		/*es.shutdown();*/
		/*Converter<String , Integer> converter = Integer::valueOf;
		converter.convert("123");*/
	}
}
