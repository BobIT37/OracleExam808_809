package com.wealth.certificate.dumps_1z0_809_ert.question063;

import java.sql.SQLException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


class R implements Runnable {
	public void run() { 
		System.out.println("Run..."); 
	}
}

class C implements Callable<String> {
	public String call() throws Exception { 
		return "call...";
	}
}

public class Question063 {

	public static void main(String[] args) throws SQLException {
		
		ExecutorService es = Executors.newSingleThreadExecutor();
		es.execute(new R()); // line n1 
		Future<String> f1 = es.submit(new C()); // line n2
		try{
			System.out.println(f1.get()); 
		}catch(Exception e){}
		es.shutdown();
	}

}
