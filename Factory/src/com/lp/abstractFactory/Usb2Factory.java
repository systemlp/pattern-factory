package com.lp.abstractFactory;

import com.lp.factory.Usb;
import com.lp.factory.Usb2;

public class Usb2Factory implements AbstractUsbFactory {

    @Override
    public Usb produce() {
        return new Usb2();
    }

}
