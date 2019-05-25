package com.msh.model.strategy;

public class SubStrategy implements Strategy{
    @Override
    public int calc(int num1, int num2) {
        return num1 - num2;
    }
}
