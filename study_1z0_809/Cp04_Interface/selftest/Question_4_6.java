package com.wealth.certificate.study_1z0_809.chapter04_Interface.selftest;

interface G {
    default void doIt() {
        System.out.println("G - Do It");
    }
}
interface H {
    void doIt();
}
public class Question_4_6 implements G, H {
    public void doIt() {
        System.out.println("Do It");
    }
    public static void main(String[] args) {
        Question_4_6 q = new Question_4_6();
        q.doIt();
    }
}

/*What is the result?
A. G - Do It
B. Do It
C. Compilation fails
D. An exception occurs at runtime

Answer B.
In an inheritance hierarchy, the most specific method is the one called, which in this case, it's the one defined by Question_4_6.

If we remove method doIt() in class Question_4_6, the program would stop compiling, since the default method doIt() inherited from G 
will conflict with the method inherited from H (the compiler wouldn't know which one you intended to run).


*/