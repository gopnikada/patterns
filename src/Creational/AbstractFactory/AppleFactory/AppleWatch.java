package Creational.AbstractFactory.AppleFactory;

import Creational.AbstractFactory.Devices.IWatch;

public class AppleWatch implements IWatch {

    @Override
    public void showTime() {
        System.out.println("Showing time from applewatches");
    }
}
