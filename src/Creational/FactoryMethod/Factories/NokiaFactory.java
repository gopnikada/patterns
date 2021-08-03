package Creational.FactoryMethod.Factories;

import Creational.FactoryMethod.Products.IPhone;
import Creational.FactoryMethod.Products.NokiaPhone;

public class NokiaFactory extends PhoneFactory {
    @Override
    public IPhone assemblePhone() {
        return new NokiaPhone();
    }
}
