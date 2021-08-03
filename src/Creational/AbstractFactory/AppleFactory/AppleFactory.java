package Creational.AbstractFactory.AppleFactory;

import Creational.AbstractFactory.Devices.DeviceFactory;
import Creational.AbstractFactory.Devices.IPhone;
import Creational.AbstractFactory.Devices.IWatch;

public class AppleFactory implements DeviceFactory {
    @Override
    public IPhone assemblePhone() {
        return new ApplePhone();
    }

    @Override
    public IWatch assembleWatch() {
        return new AppleWatch();
    }
}
