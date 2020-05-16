package com.wealth.certificate.dumps_1z0_809.question057.ext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.TimeUnit;

public class MyRecursiveTask extends RecursiveTask<Integer> {

	static final int THRESHOLD_SIZE = 3;
	
	List<Integer> input;
	
	public MyRecursiveTask(List<Integer> input){
		this.input = input;
	}
	
	private int sum(List<Integer> input) {
		int sum = 0;
		for (int i : input) {
			sum += i;
		}
		return sum;
	}
	
	@Override
	protected Integer compute() {
		if(input.size()<=THRESHOLD_SIZE) {
			// directly solve problem
			int sum = sum(input);
			return sum;
		}else {
			// split problem into independent parts
			List<Integer> left = new ArrayList<Integer>();
			left.addAll(input.subList(0, input.size()/2));
			List<Integer> right = new ArrayList<Integer>();
			right.addAll(input.subList(input.size()/2, input.size()));
							
			// fork new subtasks to solve each part
			MyRecursiveTask rLeft = new MyRecursiveTask(left);						
			rLeft.fork();
			MyRecursiveTask rRight = new MyRecursiveTask(right);
			int sumRight = rRight.compute();
			
			// join all subtasks													
			int sumLeft = rLeft.join();
			
			//compose result from subresults
			return sumLeft+sumRight;			
			
		}

	}

	public static void main(String[] args) {
		ForkJoinPool forkJoinPool = new ForkJoinPool();
		List<Integer> input = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		MyRecursiveTask myRecusiveTask = new MyRecursiveTask(input);
		
		// execute --> Arrange async execution
		forkJoinPool.execute(myRecusiveTask);		
		
		// invoke --> Await and obtain result
		int sum = forkJoinPool.invoke(myRecusiveTask);
		System.out.println("Sum : "+sum);
		
		// submit --> Arrange exec and obtain Future
		Future f = forkJoinPool.submit(myRecusiveTask);
		try {
			System.out.println(f.get()); //block
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		System.out.println("shutdown pool.");
		forkJoinPool.shutdown();
		
	}

}
