package Creational.FM;

public abstract class LaptopFactory {

    public void showResult(){
        Laptop laptop = makeLaptop();
        laptop.makeComputation();
    }

    public abstract Laptop makeLaptop();
}
