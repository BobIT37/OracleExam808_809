package com.wealth.certificate.study_1z0_809.chapter27;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class BlockingQueueConsumer {
	
	BlockingQueue<Integer> bq;
	
	public BlockingQueueConsumer(BlockingQueue<Integer> bq) {
		this.bq = bq;
	}
	
	public void pollTimeOut() {
		try {
			System.out.println("consume : "+bq.poll(10, TimeUnit.SECONDS));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void offerWithTime() {
		try {
			System.out.println("offering");
			System.out.println("put 5 : "+bq.offer(5, 10, TimeUnit.SECONDS));
			System.out.println(bq);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class BlockingDequeExample {

	public static void main(String[] args) throws InterruptedException {
		
		BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(3);
		
		bq.put(1); System.out.println("put 1");
		bq.put(2); System.out.println("put 2");
		bq.put(3); System.out.println("put 3");
		bq.put(4); System.out.println("put 4");
		
//		Integer i = bq.take();
//		System.out.println(i);
		
//		System.out.println("offer 1: "+bq.offer(1));
//		System.out.println("offer 2: "+bq.offer(2));
//		System.out.println("offer 3: "+bq.offer(3));
//		System.out.println("offer 4: "+bq.offer(4));
//		System.out.println(bq);
		
//		System.out.println("poll: "+bq.poll());
		
//		BlockingQueueConsumer bqc = new BlockingQueueConsumer(bq);
//		ExecutorService e = Executors.newFixedThreadPool(2);
		
//		e.execute(bqc::pollTimeOut);
//		System.out.println("I'm sleeping");
//		Thread.sleep(2000);
//		System.out.println("offer 1 : "+bq.offer(1));
		
//		e.execute(bqc::offerWithTime);
//		System.out.println("I'm sleeping");
//		Thread.sleep(2000);
//		System.out.println("poll : "+bq.poll());
		
//		e.shutdown();
	}

}
