package com.msh.model.decorator;

public class Noodle extends DefalutDecorator {
    public Noodle(Decorator decorator) {
        super(decorator);
    }

    @Override
    public void eat() {
        System.out.println("来点儿面条");
        super.eat();
    }

}
