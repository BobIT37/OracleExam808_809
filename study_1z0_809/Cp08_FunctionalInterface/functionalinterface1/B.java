package com.wealth.certificate.study_1z0_809.chapter08.functionalinterface1;

interface A {
	default int m1() {
		return 0;
    }
}
@FunctionalInterface
public interface B extends A {
    static String m() {
        return "static";
    }
}

/*
	Which of the following statements are true?
	xA. Compilation fails
	B. It compiles successfully
	C. It compiles only if interface B declares a default method
	D. An exception occurs at runtime if this interface is implemented by a class
*/