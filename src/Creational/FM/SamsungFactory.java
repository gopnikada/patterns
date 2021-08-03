package Creational.FM;

public class SamsungFactory extends LaptopFactory{
    @Override
    public Laptop makeLaptop() {
        return new SamsungLaptop();
    }
}
