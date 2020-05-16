package com.wealth.certificate.study_1z0_809.chapter04_Interface.selftest;

interface C {
    default boolean equals(C obj) {
        return obj == this;
    }
}
public class Question_4_3 implements C {
    public static void main(String[] args) {
        Question_4_3 q = new Question_4_3();
        System.out.println(q.equals(q));
    }
}
/*
What is the result?
A. true
B. false
C. Compilation fails
D. An exception occurs at runtime

Answer A.
There is nothing wrong with the code. The equals method is valid since it doesn't have the signature of Object's equals. 
The this keyword can be used inside the default method (it refers to the object that implements the interface)
 and because we are testing the same instance (q), the code returns true.

*/