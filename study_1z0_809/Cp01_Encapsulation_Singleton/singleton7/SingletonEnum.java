package com.wealth.certificate.study_1z0_809.chapter01.singleton7;

public enum SingletonEnum 
{
    INSTANCE;

    public void doStuff()
    {
        System.out.println("Singleton using Enum");
    }
}
