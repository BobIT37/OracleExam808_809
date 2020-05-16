package com.wealth.certificate.study_1z0_809.chapter06.Generic_SelfTest;

public class Generic_SelfTest02 <T extends Number> {
	T t;
    public static void main(String[] args) {
    	Generic_SelfTest02 q =
           new Generic_SelfTest02<Integer>(); // 1
        q.t = new Float(1); // 2
        System.out.println(q.t);
    }
}
