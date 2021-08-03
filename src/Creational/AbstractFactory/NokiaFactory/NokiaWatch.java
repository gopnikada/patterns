package Creational.AbstractFactory.NokiaFactory;

import Creational.AbstractFactory.Devices.IWatch;

public class NokiaWatch implements IWatch {
    @Override
    public void showTime() {
        System.out.println("showing time from nokia phone");
    }
}
