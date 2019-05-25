package com.msh.model.decorator;

public class Bread extends DefalutDecorator {
    public Bread(Decorator decorator) {
        super(decorator);
    }

    @Override
    public void eat() {
        System.out.println("来点儿面包");
        super.eat();
    }
}
