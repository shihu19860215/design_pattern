package com.msh.model.decorator;

public class Egg extends DefalutDecorator {
    public Egg(Decorator decorator) {
        super(decorator);
    }

    @Override
    public void eat() {
        System.out.println("来点儿鸡蛋");
        super.eat();
    }
}
