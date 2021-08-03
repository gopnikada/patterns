package Creational.FactoryMethod;

import Creational.FactoryMethod.Factories.PhoneFactory;
import Creational.FactoryMethod.Factories.NokiaFactory;

public class App {
    private static PhoneFactory phoneFactory;

    public static void main(String[] args) {
        config();
        logik();
    }

    static void config(){
        phoneFactory = new NokiaFactory();
    }
    static void logik(){
        phoneFactory.showStartMessage();
    }
}
