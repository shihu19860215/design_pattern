package com.msh.model.bridge;

public class Wallet extends Bag{
    @Override
    public String getName()
    {
        return color.getColor()+"Wallet";
    }
}
