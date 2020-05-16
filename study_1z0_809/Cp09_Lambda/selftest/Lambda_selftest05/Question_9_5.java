package com.wealth.certificate.study_1z0_809.chapter09.selftest.Lambda_selftest05;

interface AnInterface {
    default int aMethod() { return 0; }
    int anotherMethod();
}

public class Question_9_5 implements AnInterface {
    public static void main(String[] args) {
        AnInterface a = () -> aMethod(); //Lambda not access default aMethod() in Function Interface
        System.out.println(a.anotherMethod());
    }
    @Override
    public int anotherMethod() {
        return 1;
    }
}
