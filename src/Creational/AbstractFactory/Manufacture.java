package Creational.AbstractFactory;

import Creational.AbstractFactory.Devices.DeviceFactory;
import Creational.AbstractFactory.Devices.IPhone;
import Creational.AbstractFactory.Devices.IWatch;

public class Manufacture {
    private IWatch iWatch;
    private IPhone iPhone;

    Manufacture(DeviceFactory deviceFactory){
        iWatch = deviceFactory.assembleWatch();
        iPhone = deviceFactory.assemblePhone();
    }
    public void exportProducts(){
        iWatch.showTime();
        iPhone.showNews();
    }
}
