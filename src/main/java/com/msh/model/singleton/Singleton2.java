package com.msh.model.singleton;

public class Singleton2 {
    private static volatile Singleton2 singleton2;
    private Singleton2(){}


    public static Singleton2 getSingleton2(){
        if(null == singleton2) {
            synchronized (Singleton2.class) {
                if (null == singleton2) {
                    singleton2 = new Singleton2();
                }
            }
        }
        return singleton2;
    }
}
