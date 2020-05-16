package com.wealth.certificate.study_1z0_809.chapter06.Generic_SelfTest;

import java.util.ArrayList;
import java.util.List;

public class Generic_SelfTest01 {
	 public static void main(String[] args) {
		 Generic_SelfTest01 q = new Generic_SelfTest01();
	        List<Integer> l = new ArrayList<>();
	        l.add(20);
	        l.add(30);
	        q.m1(l);
	    }
	    private void m1(List<?> l) {
	        m2(l); // 1
	    }
	    private <T> void m2(List<T> l) {
	        l.set(1, l.get(0)); // 2
	        System.out.println(l);
	    }
}
