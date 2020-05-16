package com.wealth.certificate.study_1z0_809.chapter01.singleton2;

public class Singleton2 {
	public static void main(String[] args) {
		Singleton.testing();
//		Singleton.getInstance();
//		Singleton.getInstance();
	}
}

class Singleton {
	private Singleton() {

	}

	// The advantage of this is that the instance won't be created until the inner
	// class is referenced for the first time.
	private static class Holder {
		private static final Singleton instance = new Singleton();
		
		static {
			System.out.println("Holder");
		}
	}

	public static Singleton getInstance() {
		return Holder.instance;
	}
	
    public static void testing() {
    	System.out.println("Singleton");
    }
}
