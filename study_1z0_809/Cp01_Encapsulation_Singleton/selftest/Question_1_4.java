package com.wealth.certificate.study_1z0_809.chapter01.selftest;

import java.util.ArrayList;
import java.util.List;

public class Question_1_4 {
    private final List<Integer> list = new ArrayList<>();
    public void add() {
        list.add(0);
    }
    public static void main(String[] args) {
        Question_1_4 q = new Question_1_4();
        q.add();
    }
}

/*

Which of the following is true?
A. Attribute list contains one element after main is executed
B. The class is immutable
C. Compilation fails
D. An exception occurs at runtime

Answer: A
*/