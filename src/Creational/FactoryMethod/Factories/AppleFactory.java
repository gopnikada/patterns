package Creational.FactoryMethod.Factories;

import Creational.FactoryMethod.Products.ApplePhone;
import Creational.FactoryMethod.Products.IPhone;

public class AppleFactory extends PhoneFactory{
    @Override
    public IPhone assemblePhone() {
        return new ApplePhone();
    }
}
