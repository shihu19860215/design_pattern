package com.msh.model.proxy.dynamic;

public class CleaningWork implements IWork {
    @Override
    public void work() {
        System.out.println("清理卫生");
    }
}
