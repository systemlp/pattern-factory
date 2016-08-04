package com.lp.factory;

public class Usb2 implements Usb {

    @Override
    public void transferData() {
        System.out.println("使用usb2.0接口传输数据……");
    }

}
