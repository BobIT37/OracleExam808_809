package com.wealth.certificate.study_1z0_809.chapter07.selftest;

import java.util.ArrayList;
import java.util.List;

public class Question_7_3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1);
        System.out.println(list);
    }
}
/*
What is the result?
A. [2, 3]
B. [1, 3]
C. [1, 2, 3]
D. An exception occurs at runtime
*/