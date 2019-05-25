package com.msh.model.decorator;

public class DefalutDecorator implements Decorator {
    private Decorator decorator;
    public DefalutDecorator(Decorator decorator) {
        this.decorator = decorator;
    }
    @Override
    public void eat() {
        decorator.eat();
    }
}
