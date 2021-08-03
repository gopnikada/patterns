package Structural.Decorator;

public class Otbivnaya implements MainDish{
    @Override
    public double getPrice() {
        return 18;
    }

    @Override
    public void printInfo() {
        System.out.print("Otbivnaya, ");
    }
}
