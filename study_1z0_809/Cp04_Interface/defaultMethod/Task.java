package com.wealth.certificate.study_1z0_809.chapter04_Interface.defaultMethod;

interface Processable {
    void processInSequence();
    default void processInParallel() {
        System.out.println("Processing in parallel");
    }
    
    //default boolean equals(Object o); //A default method cannot override a method from java.lang.Object
    boolean equals(Object o);// not require implement
    int hashCode();// not require implement
    String toString();// not require implement
}

public class Task implements Processable {
    public void processInSequence() {
        System.out.println("Processing in sequence");
    }
    
    public void processInParallel() {
    	Processable.super.processInParallel(); //call method in Interface
    }
    
    public static void main(String args[]) {
        Task t = new Task();
        t.processInSequence();
        t.processInParallel(); // It compiles just fine 
    }
}