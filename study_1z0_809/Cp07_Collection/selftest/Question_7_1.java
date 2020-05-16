package com.wealth.certificate.study_1z0_809.chapter07.selftest;

import java.util.ArrayDeque;

public class Question_7_1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque =
              new ArrayDeque<Integer>();
        deque.push(1);
        deque.push(2);
        deque.push(3);
        deque.poll();
        System.out.println(deque);
    }
}