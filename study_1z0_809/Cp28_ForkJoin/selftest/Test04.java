package com.wealth.certificate.study_1z0_809.chapter28.selftest;

import java.util.concurrent.RecursiveTask;

public class Test04 extends RecursiveTask<Integer> {
	private int n;

	Test04(int n) {
	      this.n = n;
	   }

	   public Integer compute() {
	      if (n <= 1) {
	         return n;
	      }
	      Test04 t1 = new Test04(n - 1);
	      Test04 t2 = new Test04(n - 2);
	      t1.fork();
	      return t2.compute() + t1.join();
	   }
}

//4. The correct answer is C.
