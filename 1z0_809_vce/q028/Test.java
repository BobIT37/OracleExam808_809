package com.wealth.certificate.dumps_1z0_809_vce.question028;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Caller implements Callable<String> {
	String str;
	public Caller (String s) {this.str=s;}
	public String call()throws Exception { return str.concat ("Caller");}
}
class Runner implements Runnable {
	String str;
	public Runner (String s) {this.str=s;}
	public void run () { System.out.println (str.concat ("Runner"));}
}

public class Test
{
	public static void main(String[] args) throws InterruptedException, ExecutionException { // no "throws" word.
		ExecutorService es = Executors.newFixedThreadPool(2);
		Future f1 = es.submit (new Caller ("Call"));
		Future f2 = es.submit (new Runner ("Run"));
		String str1 = (String) f1.get();
		String str2 = (String) f2.get(); //line n1
		System.out.println(str1+ ":" + str2);
		
		/** Answered : A is correct. **/
	}
}