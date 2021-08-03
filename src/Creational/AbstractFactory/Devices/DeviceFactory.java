package Creational.AbstractFactory.Devices;

public interface DeviceFactory {
    IWatch assembleWatch();
    IPhone assemblePhone();
}
