package Creational.AbstractFactory;

import Creational.AbstractFactory.AppleFactory.AppleFactory;
import Creational.AbstractFactory.Devices.DeviceFactory;

public class App {
    private static Manufacture configureManufacture(){
        Manufacture manufacture;
        DeviceFactory deviceFactory;

        deviceFactory = new AppleFactory();
        manufacture = new Manufacture(deviceFactory);

        return manufacture;
    }
    public static void main(String[] args) {
        Manufacture manufacture = configureManufacture();
        manufacture.exportProducts();
    }
}
