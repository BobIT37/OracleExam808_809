package com.wealth.certificate.study_1z0_809.chapter05.selftest;

enum Color1 {
    RED, YELLOW
}
enum Color2 {
    RED, PINK
}
public class Test05 {
    public static void main(String[] args) {
        if(Color1.RED.equals(Color2.RED)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
