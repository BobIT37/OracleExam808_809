package com.wealth.certificate.study_1z0_809.chapter05.selftest;

enum Color {
    Blue, Green, Black
}
public class Test02 {
    public static void main(String[] args) {
        Color c = Color.values()[0];
        switch(c) {
            case Blue: System.out.println(1); break;
            case Green: System.out.println(2); break;
            case Black: System.out.println(3); break;
        }
    }
}