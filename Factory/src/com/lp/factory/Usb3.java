package com.lp.factory;

public class Usb3 implements Usb {

    @Override
    public void transferData() {
        System.out.println("使用usb3.0接口传输数据……");
    }

}
