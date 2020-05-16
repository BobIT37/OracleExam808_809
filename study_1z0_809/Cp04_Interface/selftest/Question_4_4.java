package com.wealth.certificate.study_1z0_809.chapter04_Interface.selftest;

interface D {
    default void print() {
        System.out.println("D");
    }
}
interface E extends D {
    default void print() {
        System.out.println("E");
    }
}
public class Question_4_4 implements E {
    public void print() {
        E.super.print();
    }
    public static void main(String[] args) {
        Question_4_4 q = new Question_4_4();
        q.print();
   }
}

/*What is the result?
A. D
B. E
C. D and then E
D. Compilation fails
E. An exception occurs at runtime

Answer B.
If you want to call the default method of the super interface from the implementing class, you have to do it with the following syntax:

NameOfTheInteface.super.defaultMethod();

However, this only works with the most direct super interface. In the case of the example, interface E. If you try to use:

D.super.print();

The compiler would generate an error saying that you cannot bypass a more specific direct super type.
*/