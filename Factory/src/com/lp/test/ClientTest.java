package com.lp.test;

import com.lp.abstractFactory.AbstractUsbFactory;
import com.lp.abstractFactory.Usb2Factory;
import com.lp.abstractFactory.Usb3Factory;
import com.lp.factory.Usb;
import com.lp.factory.UsbFactory;

public class ClientTest {

    public static void main(String[] args) {
        Usb usb2 = UsbFactory.produce(2);
        usb2.transferData();
        Usb usb3 = UsbFactory.produce(3);
        usb3.transferData();
        // Usb usb4 = UsbFactory.produce(4);
        // usb4.transferData();
        AbstractUsbFactory usb2Factory = new Usb2Factory();
        usb2 = usb2Factory.produce();
        usb2.transferData();
        AbstractUsbFactory usb3Factory = new Usb3Factory();
        usb3 = usb3Factory.produce();
        usb3.transferData();
    }

}
