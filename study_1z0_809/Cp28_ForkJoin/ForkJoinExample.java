package com.wealth.certificate.study_1z0_809.chapter28;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class FindMax extends RecursiveTask<Integer> {
	
	private static final long serialVersionUID = -7846285401910405312L;

	List<Integer> data;
	final int THRESHOLD = 3;
	
	public FindMax(List<Integer> data) {
		System.out.println("recieve: "+data);
		this.data = data;
	}

	@Override
	protected Integer compute() {
		
		if(data.size() > THRESHOLD)
		{
			FindMax findMaxHead = new FindMax(data.subList(0, THRESHOLD));
			FindMax findMaxTail = new FindMax(data.subList(THRESHOLD, data.size()));
			
			findMaxTail.fork();
			
			Integer resultH = findMaxHead.compute();
			Integer resultT = findMaxTail.join();
			
			return resultH > resultT ? resultH : resultT;
		}
		else
		{
			return data.stream().max((a,b)-> a-b).orElse(Integer.MIN_VALUE);
		}
		
	}
	
}

public class ForkJoinExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ForkJoinPool pool = new ForkJoinPool();
		
		ForkJoinTask<Integer> task = pool.submit(new FindMax(populate()));
		
		System.out.println(task.get());
	}
	
	public static List<Integer> populate() {
		Random r = new Random();
		return Stream.generate(() -> r.nextInt(100)).limit(12).collect(Collectors.toList());
	}

}