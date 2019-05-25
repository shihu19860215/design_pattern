package com.msh.model.decorator;

public class Breakfast implements Decorator {
    @Override
    public void eat() {
        System.out.println("吃早餐了");
    }

    public static void main(String[] args) {
        Decorator decorator = new Breakfast();
        decorator = new Bread(decorator);
        decorator = new Noodle(decorator);
        decorator = new Egg(decorator);
        decorator.eat();
    }
}
