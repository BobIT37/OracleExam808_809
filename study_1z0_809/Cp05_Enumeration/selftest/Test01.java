package com.wealth.certificate.study_1z0_809.chapter05.selftest;
public enum Test01 {
    UP(1) {
        public void printValue() {
            System.out.println(value);
        }
    }, DOWN(0);
    private int value;

    private Test01(int value) {
        this.value = value;
    }
}