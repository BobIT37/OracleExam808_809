package com.wealth.certificate.study_1z0_809.chapter01.selftest;

public class Question_1_5 {
    private String s = "Hi";
    public static void main(String[] args) {
        Question_1_5 q = new Question_1_5();
        q.s = "Bye"; // 1
        System.out.println(q.s); // 2
    }
}

/*
What is the result?
A. Hi
B. Bye
C. Compilation fails on the declaration marked as // 1
D. Compilation fails on the declaration marked as // 2

Answer: B.
*/