package com.wealth.certificate.study_1z0_809.chapter04_Interface.selftest;

interface F {
    static void test() {
        System.out.println("F test");
    }
}
public class Question_4_5 implements F {
    public void test() {
        System.out.println("Q test");
    }
    public static void main(String[] args) {
        F q = new Question_4_5();
        q.test();
    }
}

/*What is the result?
A. F test
B. Q test
C. Compilation fails
D. An exception occurs at runtime

Answer C.
Interface F defines a static method that should be used as:

F.test();

Since the type of variable q is F, you cannot use method test(). 
If the type of variable q were Question_4_5, the program would print Q test.

By the way, test() on Question_4_5 doesn't redefine test() on interface F, 
since static methods on interfaces are not inherited.
*/