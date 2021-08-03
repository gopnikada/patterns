package Creational.AbstractFactory.AppleFactory;

import Creational.AbstractFactory.Devices.IPhone;

public class ApplePhone implements IPhone {
    @Override
    public void showNews() {
        System.out.println("Showing  news from Safari");
    }
}
