package Structural.Decorator;

public class Solyanka implements MainDish{
    @Override
    public void printInfo() {
        System.out.print("Solyanka, ");
    }

    @Override
    public double getPrice() {
        return 16;
    }
}
