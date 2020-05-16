package com.wealth.certificate.dumps_1z0_809_ps.question003;

import java.util.function.BiFunction;

public class Test {
	public static void main(String[] args) {
			BiFunction<Integer, Double, Integer> val = (t1, t2) -> t1 + t2;	//line n1
			//BiFunction<Integer, Double, Double> val2 = (t1, t2) -> t1 + t2;
			System.out.println(val.apply(10, 10.5));
			//System.out.println(val.apply(10, 10d));
	}
}
