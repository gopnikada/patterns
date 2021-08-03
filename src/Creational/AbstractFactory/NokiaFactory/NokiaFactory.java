package Creational.AbstractFactory.NokiaFactory;

import Creational.AbstractFactory.Devices.DeviceFactory;
import Creational.AbstractFactory.Devices.IPhone;
import Creational.AbstractFactory.Devices.IWatch;

public class NokiaFactory implements DeviceFactory {
    @Override
    public IWatch assembleWatch() {
        return new NokiaWatch();
    }

    @Override
    public IPhone assemblePhone() {
        return new NokiaPhone();
    }
}
