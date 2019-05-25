package com.msh.model.adapter;

public class APP {
    public static void main(String[] args) {
        PS2Mouse ps2Mouse =new PS2Mouse();
        USB usb = new PS2ToUSBAdapter(ps2Mouse);
        usb.isUSB();
    }
}
