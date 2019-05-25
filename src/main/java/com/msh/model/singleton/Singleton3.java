package com.msh.model.singleton;

public class Singleton3 {
    private Singleton3(){}

    private static enum  SingletonEnum{
        INSTANCE;
        private Singleton3 singleton3;
        //JVM会保证此方法绝对只调用一次
        private SingletonEnum(){
            singleton3 = new Singleton3();
        }
        public Singleton3 getInstance(){
            return INSTANCE.singleton3;
        }
    }

    public static Singleton3 getSingleton3(){
        return SingletonEnum.INSTANCE.getInstance();
    }
}
