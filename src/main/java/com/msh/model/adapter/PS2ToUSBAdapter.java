package com.msh.model.adapter;

public class PS2ToUSBAdapter extends PS2Mouse implements USB {
    private PS2 ps2;

    public PS2ToUSBAdapter(PS2 ps2) {
        this.ps2 = ps2;
    }

    @Override
    public void isUSB() {
        ps2.isPS2();
        System.out.println("ps2转换为usb");
        System.out.println("我需要的接口是USB");
    }
}
