package com.msh.model.observer;

import java.util.ArrayList;
import java.util.List;

public class WechatServer implements Observed {
    private List<Observer> list;
    public WechatServer() {
        list = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        list.remove(o);
    }

    @Override
    public void toDo(Object msg) {
        System.out.println("微信服务更新消息： " + msg);
        notifyObserver(msg);
    }

    private void notifyObserver(Object o) {
        for(int i = 0; i < list.size(); i++) {
            Observer oserver = list.get(i);
            oserver.excute(o);
        }

    }



    public static void main(String[] args) {
        WechatServer wechatServer = new WechatServer();
        User user1 = new User("张三");
        User user2 = new User("李四");
        User user3 = new User("王五");

        wechatServer.registerObserver(user1);
        wechatServer.registerObserver(user2);
        wechatServer.registerObserver(user3);
        wechatServer.toDo("msg1");
        System.out.println("--------------------------------");
        wechatServer.removeObserver(user2);
        wechatServer.toDo("msg2");
    }
}
