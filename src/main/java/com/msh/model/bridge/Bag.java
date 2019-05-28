package com.msh.model.bridge;

//抽象化角色：包
abstract public class Bag {
    protected Color color;
    public void setColor(Color color)
    {
        this.color=color;
    }
    abstract public  String getName();
}
