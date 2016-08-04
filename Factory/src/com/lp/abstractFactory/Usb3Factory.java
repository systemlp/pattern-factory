package com.lp.abstractFactory;

import com.lp.factory.Usb;
import com.lp.factory.Usb3;

public class Usb3Factory implements AbstractUsbFactory {

    @Override
    public Usb produce() {
        return new Usb3();
    }

}
