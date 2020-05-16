package com.wealth.certificate.study_1z0_809.chapter04_Interface.selftest;

interface A {
    default int aMethod() {
        return 0;
    }
}
public class Question_4_1 implements A {
    public long aMethod() {
        return 1;
    }
    public static void main(String args[]) {
        Test t = new Test();
        System.out.println(t.aMethod());
    }
}

/*
What is the result?
A. 0
B. 1
C. Compilation fails
D. An exception occurs at runtime

Answer C.
Since the method signature (method name plus parameter list) of aMethod() is the same in interface A and class Test,
 the compiler thinks the method in Test is overriding the default method. However, overriding a method includes the return type
 , which doesn't match (long vs. int).
*/

