package com.wealth.certificate.study_1z0_809.chapter05;

public enum Volume {
//	  public static final int A = 100;
//    public static final int B = 50;
//    public static final int C = 20;
	
    HIGH(100) {
       public void printValue() {
           System.out.println("** Highest value**");
       }
       public void printDescription() {
           System.out.println("High Volume");
       }
    }, MEDIUM(50) {
        public void printDescription() {
           System.out.println("Medium Volume");
        }
    }, LOW(20) {
        public void printDescription() {
            System.out.println("Low Volume");
        }
    };
    private int value;

    private Volume(int value) {
        this.value = value;
//        System.out.println(value);
    }

    public void printValue() {
        System.out.println(value);
    }
    public int getValue() {
        return value;
    }
    public abstract void printDescription();
}