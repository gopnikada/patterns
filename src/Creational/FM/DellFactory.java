package Creational.FM;

public class DellFactory extends LaptopFactory{
    @Override
    public Laptop makeLaptop() {
        return new DellLaptop();
    }
}