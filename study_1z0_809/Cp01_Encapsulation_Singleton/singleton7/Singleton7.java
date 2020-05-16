package com.wealth.certificate.study_1z0_809.chapter01.singleton7;

public class Singleton7 {
	public static void main(String[] args) {
		SingletonEnum.INSTANCE.doStuff();
	}
}

/*
1. You cannot create an instance of an enum by using the new operator (because the constructor is private).
2. An instance of an enum is created when the enum is first referenced.
3. An enum can't be reassigned.
4. enums are thread-safe by default
*/
