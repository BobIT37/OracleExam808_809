package com.wealth.certificate.study_1z0_809.chapter04_Interface.selftest;

interface B {
    default static void test() {
        System.out.println("B test");
    }
}
public class Question_4_2 implements B {
    public void test() {
        System.out.println("Q test");
    }
    public static void main(String[] args) {
        Question_4_2 q = new Question_4_2();
        q.test();
    }
}

/*
What is the result?
A. B test
B. Q test
C. Compilation fails
D. An exception occurs at runtime

Answer C.
An interface method cannot be default and static at the same time. Therefore
, a compile-time error is generated.
*/

