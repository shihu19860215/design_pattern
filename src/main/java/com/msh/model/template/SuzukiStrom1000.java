package com.msh.model.template;

public class SuzukiStrom1000 extends DriveTemplate{

    @Override
    protected void openDoor() {
        System.out.println("没有门");
    }

    @Override
    protected void gear() {
        System.out.println("脚挂档");
    }

    @Override
    protected void brake() {
        System.out.println("手动刹车");
    }
}
