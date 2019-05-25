package com.msh.model.singleton;

public class Singleton1 {
    final private static Singleton1 singleton1 = new Singleton1();
    private Singleton1(){}
    public static Singleton1 getSingleton1(){
        return singleton1;
    }
}
