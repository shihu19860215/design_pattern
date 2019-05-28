package com.msh.model.bridge;

public class HandBag extends Bag {
    @Override
    public String getName()
    {
        return color.getColor()+"HandBag";
    }
}
