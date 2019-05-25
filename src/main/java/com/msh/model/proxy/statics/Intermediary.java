package com.msh.model.proxy.statics;

/**
 * 中介
 */
public class Intermediary implements IWork{
    private IWork work;

    public Intermediary(IWork work) {
        this.work = work;
    }

    @Override
    public void work() {
        work.work();
        System.out.println("收取中介费");
    }
}
