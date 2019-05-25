package com.msh.model.proxy.statics;

public class LookingRoomWork implements IWork{
    @Override
    public void work() {
        System.out.println("介绍找房源");
    }


    public static void main(String[] args) {
        LookingRoomWork lookingRoomWork = new LookingRoomWork();
        Intermediary intermediary = new Intermediary(lookingRoomWork);

        intermediary.work();
    }
}
