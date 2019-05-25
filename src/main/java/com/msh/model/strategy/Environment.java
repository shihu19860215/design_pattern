package com.msh.model.strategy;

public class Environment {
    private Strategy strategy;

    public Environment(Strategy strategy) {
        this.strategy = strategy;
    }

    public int calulate(int num1, int num2){
        return strategy.calc(num1 , num2);
    }

    public static void main(String[] args) {
        Strategy add = new AddStrategy();
        Strategy sub = new SubStrategy();
        Environment environment = new Environment(sub);
        System.out.println(environment.calulate(5, 3));
    }
}
