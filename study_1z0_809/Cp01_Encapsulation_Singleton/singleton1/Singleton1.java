package com.wealth.certificate.study_1z0_809.chapter01.singleton1;

public class Singleton1 {
	public static void main(String[] args) {
		Singleton.testing();
//		Singleton.testing();
	}
}

class Singleton {
    private static final Singleton instance = new Singleton();
    static {
    	System.out.println("instance");
    }
    
    private Singleton() { }
    
    public static Singleton getInstance() {
        return instance;
    }
    
    public static void testing() {
    	System.out.println("Singleton");
    }
}