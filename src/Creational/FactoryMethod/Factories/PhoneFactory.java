package Creational.FactoryMethod.Factories;

import Creational.FactoryMethod.Products.IPhone;

public abstract class PhoneFactory {

    public void showStartMessage(){
        IPhone iPhone = assemblePhone();
        iPhone.perfStartMessage();
    }

    public abstract IPhone assemblePhone();
}
