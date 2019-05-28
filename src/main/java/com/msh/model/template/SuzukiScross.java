package com.msh.model.template;

/**
 * 小车锋驭
 */
public class SuzukiScross extends DriveTemplate{
    @Override
    protected void openDoor() {
        System.out.println("无钥匙开门");
    }

    @Override
    protected void gear() {
        System.out.println("手动挂挡");
    }

    @Override
    protected void brake() {
        System.out.println("脚刹");
    }
}
