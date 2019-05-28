package com.msh.model.bridge;

public class App {

    public static void main(String[] args) {
        Color color = new Red();
        Bag bag = new Wallet();
        bag.setColor(color);
        System.out.println(bag.getName());
    }
}
