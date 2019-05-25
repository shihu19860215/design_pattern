package com.msh.model.proxy.dynamic;

public class App {
    public static void main(String[] args) {
        IWork target = new LookingRoomWork();
        IWork target2 = new CleaningWork();
        IWork proxy = (IWork) new ProxyFactory(target).getProxyInstance();
        proxy.work();
        proxy = (IWork) new ProxyFactory(target2).getProxyInstance();
        proxy.work();
    }
}
