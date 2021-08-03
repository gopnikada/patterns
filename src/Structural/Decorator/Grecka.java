package Structural.Decorator;

public class Grecka extends Garnir{

    public Grecka(MainDish mainDish) {
        super(mainDish);
    }

    @Override
    public double getPrice() {
        return mainDish.getPrice() + 19;
    }

    @Override
    public void printInfo() {
        mainDish.printInfo();
        System.out.print("Grecka, ");
    }
}
