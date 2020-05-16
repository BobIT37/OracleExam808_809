package com.wealth.certificate.dumps_1z0_809_vce.question010;

public class Test {
	public static void main (String [] args){
		Thread thread1 = new Thread(new MyThread());
		Thread thread2 = new Thread(new MyThread());
		Thread thread3 = new Thread(new MyThread());
		Thread [] ta = {thread1, thread2, thread3};
		for (int x= 0; x < 3; x++) {
			ta[x].start();
		}
	}
}
