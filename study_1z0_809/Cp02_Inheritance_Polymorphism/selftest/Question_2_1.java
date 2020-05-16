package com.wealth.certificate.study_1z0_809.chapter02_Inheritance_and_Polymorphism.selftest;

public class Question_2_1 {
    protected int id;
    protected String name;

    protected boolean equals(Question_2_1 q) {
        return this.name.equals(q.name);
    }

    public static void main(String[] args) {
        Question_2_1 q1 = new Question_2_1();
        Question_2_1 q2 = new Question_2_1();
        q1.name = "q1";
        q2.name = "q1";

        if(q1.equals((Object)q2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

/*

What is the result?
A. true
B. false
C. Compilation fails
D. An exception occurs at runtime

Answer: B

The method:

protected boolean equals(Question_1_3 q)

Doesn't override the equals method from java.lang.Object (look at the access modifier). For that reason, the if condition fails. Note that if the method call were:

if(q1.equals(q2)) { ...

We will be calling the method with the protected modifier, making the condition true.
*/