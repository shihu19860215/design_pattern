package com.msh.model.template;

/**
 * 驾驶模板
 */
abstract public class DriveTemplate {
    public final void drive() {
        openDoor();
        startEngine();
        gear();
        go();
        brake();
        stop();
    }

    protected abstract void openDoor();

    protected void startEngine() {
        System.out.println("发动机启动");
    }

    protected abstract void gear();

    protected void go() {
        System.out.println("开车运行");
    }

    protected abstract void brake();

    protected void stop() {
        System.out.println("停止");
    }
}
