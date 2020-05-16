package com.wealth.certificate.study_1z0_809.chapter27.selftest;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class Test03 {
	public static void main(String[] args) throws Exception {
		BlockingDeque<Integer> deque = new LinkedBlockingDeque<>();
		deque.offerLast(10, 5, TimeUnit.SECONDS);
		System.out.print(deque.pollLast(5, TimeUnit.SECONDS) + " ");
		System.out.print(deque.pollFirst(5, TimeUnit.SECONDS));
	}
}

//3. The correct answer is D.