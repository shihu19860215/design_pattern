package com.msh.model.observer;

public class User implements Observer {
    private String name;
    public User(String name) {
        this.name = name;
    }

    @Override
    public void excute(Object o) {
        System.out.println("name:"+ name +" 接收到消息:" +o.toString());
    }

}
