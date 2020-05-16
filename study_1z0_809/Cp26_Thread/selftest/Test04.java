package com.wealth.certificate.study_1z0_809.chapter26.selftest;

public class Test04 {
	private static Object A = new Object();
    private static Object B = new Object();
    public static void main(String[] args) {
       new Thread(() -> {
          acquireLock(A);
          System.out.println("Just acquired A");
          acquireLock(B);
          System.out.println("Just acquired B");
          releaseLock(B);
          releaseLock(A);
        }).start();
        new Thread(() -> {
          acquireLock(B);
          System.out.println("Just acquired B");
          acquireLock(A);
          System.out.println("Just acquired A");
          releaseLock(A);
          releaseLock(B);
        }).start();
    }
    private static void acquireLock(Objec o) {
        // Code to acquire lock on object o
    }
    private static void releaseLock(Objec o) {
        // Code to release lock on object o
    }
}

//2. The correct answer is A.
//Even though the program creates an invalid Locale object, it doesn't throw any exception. 
//When Java looks up a resource bundle with that locale, it can find any so it resolves to the default bundle (Bundle1.properties).