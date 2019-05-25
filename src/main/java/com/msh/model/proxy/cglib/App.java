package com.msh.model.proxy.cglib;

public class App {
    public static void main(String[] args) {
        //目标对象
        CleaningWork target = new CleaningWork();

        System.out.println(target.getClass());
        //代理对象
        CleaningWork proxy = (CleaningWork)new ProxyFactory(target).getProxyInstance();
        System.out.println(proxy.getClass());

        //执行代理对象的方法
        proxy.work();

    }
}
