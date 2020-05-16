package com.wealth.certificate.dumps_1z0_809.question100;

import java.util.concurrent.CyclicBarrier;

public class Worker extends Thread {
	CyclicBarrier cb;

	public Worker(CyclicBarrier cb) {
		this.cb = cb;
	}

	public void run() {
		try {
			cb.await();
			System.out.println("Worker�");
		} catch (Exception ex) {
		}
	}
	
	public static void main(String[] args) {
		Master master = new Master();
		// line n2
		CyclicBarrier cb = new CyclicBarrier(1, master);	//Choice C
		Worker worker = new Worker(cb);
		worker.start();
	}
}

class Master implements Runnable { // line n1
	public void run() {
		System.out.println("Master�");
	}
}


/*
You have been asked to ensure that the run methods of both the Worker and Master
classes are executed.

Which modification meets the requirement?

A. At line n2, insert CyclicBarrier cb = new CyclicBarrier(2, master);
B. Replace line n1 with class Master extends Thread {
C. At line n2, insert CyclicBarrier cb = new CyclicBarrier(1, master);
D. At line n2, insert CyclicBarrier cb = new CyclicBarrier(master);

Answer: C


Explanation:
CyclicBarrier: It provides a synchronization point (a barrier point) 
where a thread may need to wait until all other threads also reach that point.
นับจากจำนวนการ call .await()

CyclicBarrier(int parties, Runnable barrierAction)
Creates a CyclicBarrier with the specified number of threads waiting upon it, 
and which will execute the given action when the barrier is reached.

A. is wrong. There is only one worker start, so there is no way to reach barrier point of 2
B. is wrong, It's still compilation failed.
C. is correct
D. is wrong. There is no constructor that accept only Runnable (Compilation failed)

*/
