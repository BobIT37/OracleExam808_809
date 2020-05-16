package com.wealth.certificate.dumps_1z0_809.question057.ext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.TimeUnit;

public class MyRecursiveAction extends RecursiveAction {

	static final int THRESHOLD_SIZE = 3;

	List<Integer> input;

	public MyRecursiveAction(List<Integer> input) {
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
	protected void compute() {
		if (input.size() <= THRESHOLD_SIZE) {
			// directly solve problem
			int sum = sum(input);
			System.out.println(sum);
		} else {
			// split problem into independent parts
			List<Integer> left = new ArrayList<Integer>();
			left.addAll(input.subList(0, input.size() / 2));
			List<Integer> right = new ArrayList<Integer>();
			right.addAll(input.subList(input.size() / 2, input.size()));

			// fork new subtasks to solve each part
			MyRecursiveAction rLeft = new MyRecursiveAction(left);
			rLeft.fork();
			MyRecursiveAction rRight = new MyRecursiveAction(right);
			rRight.compute();

			// join all subtasks
			rLeft.join();

			// compose result from subresults
			return;
		}
	}

	public static void main(String[] args) {
		ForkJoinPool forkJoinPool = new ForkJoinPool();
		List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		MyRecursiveAction myRecusiveAction = new MyRecursiveAction(input);

		// execute --> Arrange async execution
		forkJoinPool.execute(myRecusiveAction);

		// invoke --> Await and obtain result
		Object result = forkJoinPool.invoke(myRecusiveAction);
		System.out.println("Invoke : "+result);
		
		// submit --> Arrange exec and obtain Future
		Future f = forkJoinPool.submit(myRecusiveAction);
		try {
			System.out.println("Future : "+f.get()); // block
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

		System.out.println("shutdown pool.");
		forkJoinPool.shutdown();

	}

}
