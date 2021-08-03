package Creational.AbstractFactory.NokiaFactory;

import Creational.AbstractFactory.Devices.IPhone;

public class NokiaPhone implements IPhone {
    @Override
    public void showNews() {
        System.out.println("show news in Symbian");
    }
}
