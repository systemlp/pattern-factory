package com.lp.factory;

public class UsbFactory {

    public static Usb produce(Integer usbType) {
        switch (usbType) {
            case 2:
                return new Usb2();
            case 3:
                return new Usb3();
            default:
                System.out.println("接口类型不正确");
                return null;
        }
    }

}
