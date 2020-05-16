package com.wealth.certificate.study_1z0_809.chapter09.selftest.Lambda_selftest08;

interface X {
    int test(int i);
}
public class Question_9_8 {
    int i = 0;
    public static void main(String[] args) {
        X x = i -> i * 2;
        System.out.println(x.test(3));
    }
}